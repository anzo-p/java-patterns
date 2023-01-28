package structural.bridge.remoteControlSystem;

import structural.bridge.EntertainmentDevice;
import structural.bridge.RemoteController;

public class TVRemotePauseRefined extends RemoteController {

    private Boolean paused = false;

    public TVRemotePauseRefined(EntertainmentDevice device) {
        super(device);
    }

    public void buttonFivePressed() {
        if (paused) {
            this.paused = false;

            System.out.println("TV playing");
        } else {
            this.paused = true;

            System.out.println("TV paused");
        }
    }
}

