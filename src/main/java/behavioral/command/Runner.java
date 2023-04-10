package behavioral.command;

/*
    Command

    Key concepts
    - An object contains all info to call a method at a later point in time
    - An Invoker transforms this info into a Command for a Receiver to execute
    - A command may be an undo command to a command executed earlier

    Key Objects
        Receiver, Command, Invoker

    Adding a new Command
    - Implement new commands to an existing type
    - Implement a new receiver type and then implementing commands to it

    In practice
        The Command pattern wraps a Receiver class, which can be fully ignorant to the pattern
        An Invoker class instantiates and calls the command, preferably asynchronously
        Invoker may also contain execution intelligence, such as monitoring and retry rules
        The Client minimally needs access to a proper Invoker instance that eventually points to the target receiver class
 */

import behavioral.command.devices.radio.RadioRemoteControl;
import behavioral.command.devices.radio.commands.NotchRadioVolumeUp;
import behavioral.command.devices.radio.commands.TurnRadioOn;
import behavioral.command.devices.tv.commands.NotchTVVolumeUp;
import behavioral.command.devices.TurnAllDevicesOff;
import behavioral.command.devices.tv.TVRemoteControl;
import behavioral.command.devices.tv.commands.NotchTVVolumeDown;
import behavioral.command.devices.tv.commands.TurnTVOff;
import behavioral.command.devices.tv.commands.TurnTVOn;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        /*
            Receiver
            - Any object whose methods we wish to call

            Command
            - Wraps any one method call of the receiver
            - Also contains the parameters for that call
            - Has reference to the receiver instance

            Invoker
            - Calls the command to execute
            - May know multiple commands with different arguments for the same method in receiver
            - May contain logic to choose the optimal out of various commands
            - May contain queueing and controlling of the execution
         */

        DeviceReceiver tvDevice = TVRemoteControl.getDevice();

        TurnTVOn tvOnCommand = new TurnTVOn(tvDevice);
        Invoker tvOnPressed = new Invoker(tvOnCommand);
        tvOnPressed.execute();

        TurnTVOff tvOffCommand = new TurnTVOff(tvDevice);
        Invoker tvOffPressed = new Invoker(tvOffCommand);
        tvOffPressed.execute();

        for (int i=0; i<6; i++) {
            NotchTVVolumeUp tvVolumeUpCommand = new NotchTVVolumeUp(tvDevice);
            Invoker tvVolumeUpPressed = new Invoker(tvVolumeUpCommand);
            tvVolumeUpPressed.execute();
        }

        NotchTVVolumeDown tvVolumeDownCommand = new NotchTVVolumeDown(tvDevice);
        Invoker tvVolumeDownPressed = new Invoker(tvVolumeDownCommand);
        tvVolumeDownPressed.execute();

        DeviceReceiver radioDevice = RadioRemoteControl.getDevice();

        TurnRadioOn radioOnCommand = new TurnRadioOn(radioDevice);
        Invoker radioOnPressed = new Invoker(radioOnCommand);
        radioOnPressed.execute();


        for (int i=0; i<4; i++) {
            NotchRadioVolumeUp radioVolumeUpCommand = new NotchRadioVolumeUp(radioDevice);
            Invoker radioVolumeUpPressed = new Invoker(radioVolumeUpCommand);
            radioVolumeUpPressed.execute();
        }

        List<DeviceReceiver> allDevices = new ArrayList<>();
        allDevices.add(tvDevice);
        allDevices.add(radioDevice);

        TurnAllDevicesOff turnItAllOffCommand = new TurnAllDevicesOff(allDevices);
        Invoker turnItAllOffPressed = new Invoker(turnItAllOffCommand);
        turnItAllOffPressed.execute();
        turnItAllOffPressed.undo();
    }
}