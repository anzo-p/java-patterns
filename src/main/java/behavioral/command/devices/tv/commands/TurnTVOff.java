package behavioral.command.devices.tv.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class TurnTVOff implements Command {

    DeviceReceiver device;

    public TurnTVOff(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.powerOff();
    }

    public void undo() {
        device.powerOn();
    }
}
