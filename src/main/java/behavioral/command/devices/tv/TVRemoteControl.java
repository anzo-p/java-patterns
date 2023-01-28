package behavioral.command.devices.tv;

import behavioral.command.DeviceReceiver;

public class TVRemoteControl {

    public static DeviceReceiver getDevice() {
        return new TelevisionReceiver();
    }
}
