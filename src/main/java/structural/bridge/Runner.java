package structural.bridge;

/*
    Bridge
    - Either
        - Connect two separately living entities for some benefit
        - Decouple two concepts so that developers may work on them separately

    - Commonly the ends of the bridge are interfaces or abstract classes

    Adding a new bridge just bridges some other two concepts
 */

import structural.bridge.remoteControlSystem.TVRemoteMuteRefined;
import structural.bridge.remoteControlSystem.TVRemotePauseRefined;
import structural.bridge.entertainmentDeviceSystem.TVDevice;

public class Runner {

    public static void main(String[] args) {

        RemoteController rcWithMute = new TVRemoteMuteRefined(new TVDevice(1, 100));

        RemoteController rcWithPause = new TVRemotePauseRefined(new TVDevice(1, 100));

        rcWithMute.buttonOnePressed();
        rcWithMute.buttonSevenPressed();
        rcWithMute.buttonSevenPressed();
        rcWithMute.buttonSevenPressed();
        rcWithMute.buttonFivePressed();
        rcWithMute.buttonFivePressed();

        rcWithPause.buttonOnePressed();
        rcWithPause.buttonSevenPressed();
        rcWithPause.buttonSevenPressed();
        rcWithPause.buttonSevenPressed();
        rcWithPause.buttonFivePressed();
        rcWithPause.buttonFivePressed();
        rcWithPause.deviceFeedback();
    }
}
