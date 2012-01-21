package userclasses;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public class HttpCon implements Runnable {

    String Query;
    HttpConnection c = null;
    private boolean passdata = false;
    private boolean getting = false;
    private boolean closecon = false;
    StringBuffer k;
    StringBuffer output;
    String path;

    public void SetContype(boolean passdata, boolean getting, boolean closecon) {
        this.passdata = passdata;
        this.getting = getting;
        this.closecon = closecon;



    }

    HttpCon(String Query, String path) {
        this.Query = Query;
        this.path = path;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {


        boolean b = false;

        try {

            //send something to database
            //  HttpConnection c = (HttpConnection) Connector.open("http://localhost:8080/mobileSQLWebApplication/testSQLConnector");
            if (c == null) {
                c = (HttpConnection) Connector.open(path);
                c.setRequestProperty("User-Agent", "Profile/MIDP-1.0,Configuration/CLDC-1.0");
                c.setRequestMethod(HttpConnection.POST);
            }

            //-----------------------------------------------------------------------------
            if (passdata == true) {
                DataOutputStream os = (DataOutputStream) c.openDataOutputStream();
                os.writeUTF(Query);
                os.flush();
                os.close();
                os = null;
                passdata = false;
            }
            //--------------------------------------------------------------------------------

            if (getting == true) {
                DataInputStream is = (DataInputStream) c.openDataInputStream();
                int ch;

                output = new StringBuffer();

                while ((ch = is.read()) != -1) {
                    output.append((char) ch);
                }
                k = output;

                is.close();
                is = null;
                getting = false;

            }
            //-----------------------------------------------------------------------------


            if (closecon = true) {

                c.close();
                c = null;
                output = null;
                System.gc();

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//------------------------------------------------------------passing the String Buffer-----------------------------------
     StringBuffer getValue() {
        return k;
    }
}
