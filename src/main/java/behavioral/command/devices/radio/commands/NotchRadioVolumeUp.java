package behavioral.command.devices.radio.commands;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

public class NotchRadioVolumeUp implements Command {

    DeviceReceiver device;

    public NotchRadioVolumeUp(DeviceReceiver device) {
        this.device = device;
    }

    public void execute() {
        device.volumeUp();
    }

    public void undo() {
        device.volumeDown();
    }
}

