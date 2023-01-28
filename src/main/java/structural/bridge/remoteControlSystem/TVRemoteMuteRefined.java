package structural.bridge.remoteControlSystem;

import structural.bridge.EntertainmentDevice;
import structural.bridge.RemoteController;

public class TVRemoteMuteRefined extends RemoteController {

    private Boolean muted = false;

    public TVRemoteMuteRefined(EntertainmentDevice device) {
        super(device);
    }

    public void buttonFivePressed() {
        if (muted) {
            this.muted = false;

            System.out.println("TV unmuted");
        } else {
            this.muted = true;

            System.out.println("TV muted");
        }
    }
}
