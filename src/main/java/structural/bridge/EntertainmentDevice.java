package structural.bridge;

public abstract class EntertainmentDevice {

    public int deviceState;

    public int maxSetting;

    public int volumeLevel = 0;

    public abstract void buttonOnePressed();
    public void buttonThreePressed() {
        this.volumeLevel = Math.max(1, this.volumeLevel - 1);

        System.out.println("Volume decreased to " + volumeLevel);
    }

    public abstract void buttonSevenPressed();

    public void buttonNinePressed() {
        this.volumeLevel = Math.min(5, this.volumeLevel + 1);

        System.out.println("Volume increased to " + volumeLevel);
    }

    public void deviceFeedback() {
        if (this.deviceState < 0) {
            this.deviceState = 0;
        }

        if (this.deviceState > maxSetting) {
            this.deviceState = maxSetting;
        }

        System.out.println("On " + deviceState);
    }
}
