package behavioral.command.devices.radio;

import behavioral.command.DeviceReceiver;

public class RadioRemoteControl {

    public static DeviceReceiver getDevice() {
        return new RadioReceiver();
    }
}
