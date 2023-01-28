package behavioral.command.devices.radio.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class TurnRadioOn implements Command {

    DeviceReceiver device;

    public TurnRadioOn(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.powerOn();
    }

    public void undo() {
        device.powerOff();
    }
}

