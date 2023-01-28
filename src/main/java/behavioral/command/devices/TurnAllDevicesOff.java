package behavioral.command.devices;

import behavioral.command.Command;
import behavioral.command.DeviceReceiver;

import java.util.List;

public class TurnAllDevicesOff implements Command {

    private List<DeviceReceiver> devices;

    public TurnAllDevicesOff(List<DeviceReceiver> devices) {

        this.devices = devices;
    }

    public void execute() {

        for (DeviceReceiver device : this.devices) {
            device.powerOff();
        }
    }

    public void undo() {
        for (DeviceReceiver device : this.devices) {
            device.powerOn();
        }
    }
}
