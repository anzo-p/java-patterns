package structural.bridge.entertainmentDeviceSystem;

import structural.bridge.EntertainmentDevice;

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int deviceState, int maxSettings) {
        this.deviceState = deviceState;
        this.maxSetting = maxSettings;
    }

    public void buttonOnePressed() {
        this.deviceState = Math.max(1, this.deviceState - 1);

        System.out.println("TV Channel down to " + this.deviceState);
    }

    public void buttonSevenPressed() {
        this.deviceState = Math.min(this.maxSetting, this.deviceState + 1);

        System.out.println("TV channel up to " + this.deviceState);
    }
}
