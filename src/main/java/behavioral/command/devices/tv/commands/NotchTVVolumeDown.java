package behavioral.command.devices.tv.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class NotchTVVolumeDown implements Command {

    DeviceReceiver device;

    public NotchTVVolumeDown(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.volumeDown();
    }

    public void undo() {
        device.volumeUp();
    }
}

