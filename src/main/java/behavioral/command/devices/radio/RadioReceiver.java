package behavioral.command.devices.radio;

import behavioral.command.DeviceReceiver;

public class RadioReceiver implements DeviceReceiver {

    private int volume = 0;

    public void powerOn() {
        System.out.println("Radio is on");
    }

    public void powerOff() {
        System.out.println("Radio is off");
    }

    public void volumeDown() {
        volume = Math.max(0, volume - 1);

        System.out.println("Radio volume is at " + this.volume);
    }

    public void volumeUp() {
        volume = Math.min(3, volume + 1);

        System.out.println("Radio volume is at " + this.volume);
    }
}
