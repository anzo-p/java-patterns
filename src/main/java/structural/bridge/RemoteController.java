package structural.bridge;

public abstract class RemoteController {

    private EntertainmentDevice device;

    public RemoteController(EntertainmentDevice device) {
        this.device = device;
    }

    public void buttonOnePressed() {
        device.buttonOnePressed();
    }

    public void buttonThreePressed() {
        device.buttonThreePressed();
    }

    public void buttonSevenPressed() {
        device.buttonSevenPressed();
    }

    public void buttonNinePressed() {
        device.buttonNinePressed();
    }

    public void deviceFeedback() {
        device.deviceFeedback();
    }

    public abstract void buttonFivePressed();
}
