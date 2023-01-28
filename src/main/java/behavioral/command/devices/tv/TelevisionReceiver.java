package behavioral.command.devices.tv;

import behavioral.command.DeviceReceiver;

public class TelevisionReceiver implements DeviceReceiver {

    private int volume = 0;

    public void powerOn() {
        System.out.println("TV is on");
    }

    public void powerOff() {
        System.out.println("TV is off");
    }

    public void volumeDown() {
        volume = Math.max(0, volume - 1);

        System.out.println("TV volume is at " + this.volume);
    }

    public void volumeUp() {
        volume = Math.min(5, volume + 1);

        System.out.println("TV volume is at " + this.volume);
    }
}
