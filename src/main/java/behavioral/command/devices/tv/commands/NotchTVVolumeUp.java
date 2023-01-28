package behavioral.command.devices.tv.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class NotchTVVolumeUp implements Command {

    DeviceReceiver device;

    public NotchTVVolumeUp(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.volumeUp();
    }

    public void undo() {
        device.volumeDown();
    }
}

