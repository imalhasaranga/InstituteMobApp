/*
 * Feel free to update this class
 */

package userclasses;

import com.sun.lwuit.Display;
//#ifndef RIM
import javax.microedition.midlet.*;

/**
 * @author Your Name Here
 */
public class MainMIDlet extends MIDlet implements Runnable {
    public void startApp() {
        Display.init(this);
        Display.getInstance().callSerially(this);
    }

    public void run() {
        new StateMachine("/FinalBackup.res");
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
//#else
//# import net.rim.device.api.ui.UiApplication;
//#
//# /**
//#  * @author Your Name Here
//#  */
//# public class MainMIDlet extends UiApplication implements Runnable {
//#     public MainMIDlet() {
//#         Display.init(this);
//#         Display.getInstance().callSerially(this);
//#     }
//#
//#     public void run() {
//#         new StateMachine("/FinalBackup.res");
//#     }
//#     
//#     public static void main(String[] arg) {
//#         new MainMIDlet();
//#     }
//# }
//#endif
