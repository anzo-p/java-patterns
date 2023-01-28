package behavioral.command.devices.tv.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class TurnTVOn implements Command {

    DeviceReceiver device;

    public TurnTVOn(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.powerOn();
    }

    public void undo() {
        device.powerOff();
    }
}
