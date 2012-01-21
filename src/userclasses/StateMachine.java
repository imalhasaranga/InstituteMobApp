/**
 * Your application code goes here
 */
package userclasses;

import generated.StateMachineBase;
import com.sun.lwuit.*;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import java.io.IOException;
import javax.microedition.lcdui.Alert;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    Form Login, HTTPemailsender, Myprofile, perosnl, department;
    Dialog Alarm;
    TextField username, password, name, index, tel, addr, email, group;
    String checkpass = "+", imgpath = "+",frndid;
    RecordStore record;
    int departmentPerson = 5;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {
    }

    public String sendEmial(String email, String title, String body) {
        HttpCon con12 = new HttpCon(email + "-" + title + "-" + body, PropertyClass.ServerUrl + "importantEmails");
        try {

            con12.SetContype(true, true, true);
            Thread t = new Thread(con12);
            synchronized (t) {
                t.start();
                t.wait();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return con12.getValue().toString();
    }
/////////////////////////////////////////////////////my codes login form///////////////////////////////////

    protected void beforeLoginGUI(Form f) {
        Login = f;
        username = (TextField) findByName("Username", f);
        password = (TextField) findByName("Password", f);
        password.setConstraint(TextField.PASSWORD);

        try {
            record = RecordStore.openRecordStore("recordpr", true);

        } catch (Exception e) {
        }

        try {

            record.getRecord(1);
        } catch (Exception e) {

            byte[] defaultlogin = "user-user".getBytes();
            byte image[] = "no".getBytes();
            byte prio[] = "0-0-0".getBytes();
            byte[] userdetail = "n-n-n-n-n-n".getBytes();
            try {
                record.addRecord(defaultlogin, 0, defaultlogin.length);//1
                record.addRecord(image, 0, image.length);//2              
                record.addRecord(prio, 0, prio.length);//3
                record.addRecord(userdetail, 0, userdetail.length);

                defaultlogin = null;
                image = null;
                prio = null;
                userdetail = null;
                System.gc();

            } catch (Exception e1) {
                System.out.println(e1);
            }
        }
        super.beforeLoginGUI(f);
    }

    protected boolean onLoginGUILogme() {
        try {
            showForm("FirstForm", null);
            String values[] = Splitter.Split(new String(record.getRecord(1)), "-");
            showForm("FirstForm", null);
            if (values[0].equals(username.getText()) && values[1].equals(password.getText())) {
                showForm("FirstForm", null);
            } else {

                showForm("Htmlpasrecover", null);
            }

            values = null;
        } catch (Exception e) {
            System.out.println(e);
        }

        boolean val = super.onLoginGUILogme();
        return val;
    }

    protected void beforeHtmlpasrecover(Form f) {
        HTTPemailsender = f;
        super.beforeHtmlpasrecover(f);

    }

    protected void beforeAlertBox(Form f) {
        Alarm = (Dialog) f;
        Alarm.setDialogType(Dialog.TYPE_WARNING);
        Alarm.setTimeout(Alert.FOREVER);
    }

    protected boolean onHtmlpasrecoverRetrieve() {

        try {
            String Email = Splitter.Split(new String(record.getRecord(4)), "-")[4];
            if (!Email.equals("n")) {
                HttpCon con = new HttpCon(new String(record.getRecord(1)) + "-" + Email, PropertyClass.ServerUrl + "PasswordRecvoer");
                con.SetContype(true, true, true);
                Thread t = new Thread(con);
                showContainer("AlertBox", null, null);
                synchronized (t) {
                    t.start();
                    t.wait();
                }

                ((TextField) findByName("status1", HTTPemailsender)).setText(con.getValue().toString());
            } else {
                ((TextField) findByName("status1", HTTPemailsender)).setText("Your password need not to retrive, it's default password");
            }
            Email = null;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        boolean val = super.onHtmlpasrecoverRetrieve();
        return val;
    }
    //--------------------------------- codings for the login finishes-------------------------------------

    protected void beforeMyProfile(Form f) {
        Myprofile = f;
        Label l1 = (Label) findByName("propic", f);
        name = (TextField) findByName("name", Myprofile);
        index = (TextField) findByName("index", Myprofile);
        tel = (TextField) findByName("tel", Myprofile);
        addr = (TextField) findByName("addr", Myprofile);
        email = (TextField) findByName("email", Myprofile);
        group = (TextField) findByName("group", Myprofile);
        try {

            String userde[] = Splitter.Split(new String(record.getRecord(4)), "-");

            name.setText(userde[0]);
            index.setText(userde[1]);
            tel.setText(userde[2]);
            addr.setText(userde[3]);
            email.setText(userde[4]);
            group.setText(userde[5]);

            if (new String(record.getRecord(2)).equals("no")) {
                l1.setIcon(Image.createImage("/no_user.png").scaledHeight(72));

            } else {
                l1.setIcon(Image.createImage(new String(record.getRecord(2))).scaledHeight(72));
            }




            System.gc();
        } catch (Exception e) {
        }
        super.beforeMyProfile(f);
    }
//   

    protected void beforePersonalinfo(Form f) {
        perosnl = f;
        super.beforePersonalinfo(f);
    }

    protected boolean onPersonalinfoDone() {
        TextField t = (TextField) findByName("thispass", perosnl);
        TextField t2 = (TextField) findByName("nowpass", perosnl);
        TextField l = (TextField) findByName("path11", perosnl);
        int indecate = 0;
        Label l2 = (Label) findByName("Label32", perosnl);

        if (!t2.getText().equals("")) {

            if (t.getText().equals(password.getText())) {
                checkpass = t2.getText();
            } else {

                l2.setText("error password miss match");
                indecate = 1;
            }
        }
        if (l.getText() != null) {
            imgpath = l.getText();
        }
        if (indecate == 0) {
            Myprofile.show();
            // showForm("MyProfile", null);
        }


        boolean val = super.onPersonalinfoDone();
        return val;
    }

    protected boolean onMyProfileSaveAll() {
        String pass = null;
        byte arr[] = null;


        if (checkpass.equals("+")) {
            try {
                pass = new String(record.getRecord(1));
                pass = Splitter.Split(pass, "-")[1];
            } catch (Exception e) {
            }

        } else {
            pass = checkpass;
        }

        if (!imgpath.equals("+")) {
            try {
                record.setRecord(2, imgpath.getBytes(), 0, imgpath.getBytes().length);
            } catch (RecordStoreException ex) {
                ex.printStackTrace();
            }
        }


        try {


            String userpass[] = Splitter.Split(new String(record.getRecord(1)), "-");

            byte userpsss[] = (userpass[0] + "-" + pass).getBytes();
            record.setRecord(1, userpsss, 0, userpsss.length);


            String record4 = name.getText() + "-" + index.getText() + "-" + tel.getText() + "-" + addr.getText() + "-" + email.getText() + "-" + group.getText();
            byte reco4[] = record4.getBytes();

            record.setRecord(4, reco4, 0, reco4.length);

            String id = (Splitter.Split(new String(record.getRecord(3)), "-")[1]);

            if (id.equals("0")) {

                HttpCon con2 = new HttpCon(record4 + "-" + pass, PropertyClass.ServerUrl + "addaUser");
                con2.SetContype(true, true, true);
                Thread t = new Thread(con2);
                synchronized (t) {
                    t.start();
                    t.wait();

                }

                String[] newid = Splitter.Split((new String(record.getRecord(3))), "-");
                userpsss = null;
                userpsss = (newid[0] + "-" + con2.getValue().toString() + "-" + newid[2]).getBytes();
                record.setRecord(3, userpsss, 0, userpsss.length);


            } else {
                HttpCon con12 = new HttpCon(record4 + ("-" + pass + "-" + id), PropertyClass.ServerUrl + "UpdateUser");

                con12.SetContype(true, true, true);
                Thread t = new Thread(con12);

                synchronized (t) {
                    t.start();
                    t.wait();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        pass = null;
        arr = null;
        boolean val = super.onMyProfileSaveAll();
        return val;
    }

//--------------------------------------------------------- Departments -----------------------------------------------------
    protected boolean onHomeHead() {
        departmentPerson = 1;

        showForm("Departments", null);
        boolean val = super.onHomeHead();

        return val;
    }

    protected boolean onHomeDiv3() {
        departmentPerson = 2;

        showForm("Departments", null);
        boolean val = super.onHomeDiv3();

        return val;
    }

    protected boolean onHomeDiv2() {
        departmentPerson = 3;

        showForm("Departments", null);
        boolean val = super.onHomeDiv2();

        return val;
    }

    protected boolean onHomeDiv1() {
        departmentPerson = 4;

        showForm("Departments", null);
        boolean val = super.onHomeDiv1();

        return val;
    }

    protected boolean onHomeDepch() {
        departmentPerson = 5;

        boolean val = super.onHomeDepch();

        return val;
    }

    protected void beforeDepartments(Form f) {
        department = f;
        Label l = (Label) findByName("Label2", f);
        try {
            HttpCon con12 = new HttpCon(String.valueOf(departmentPerson) + "-p", PropertyClass.ServerUrl + "DepartmentOffiecer");
            con12.SetContype(true, true, true);
            Thread t = new Thread(con12);
            synchronized (t) {
                t.start();
                t.wait();
            }

            String a[] = Splitter.Split(con12.getValue().toString(), "-");
            ((Label) findByName("Label3", f)).setText(a[4]);
            ((TextArea) findByName("aboutDepartmentt", f)).setText(a[0]);
            ((Label) findByName("name", f)).setText("Head Dept: " + a[1]);
            ((Label) findByName("Label7", f)).setText(a[2]);
            ((Label) findByName("Label8", f)).setText("Tel : " + a[3]);


            switch (departmentPerson) {
                case 1:
                    l.setIcon(Image.createImage("/ceo.png").scaledHeight(78));

                    break;
                case 2:
                    l.setIcon(Image.createImage("/div1.png").scaledHeight(78));
                    break;
                case 3:
                    l.setIcon(Image.createImage("/div2.png").scaledHeight(78));
                    break;
                case 4:
                    l.setIcon(Image.createImage("/div3.png").scaledHeight(78));
                    break;
                default:
                    l.setIcon(Image.createImage("no_user.png").scaledHeight(78));
                    break;
            }
            departmentPerson = 0;
            super.beforeDepartments(f);
            System.gc();
        } catch (Exception e) {
        }

    }

    protected boolean onDepartmentsSend() {

        String output = sendEmial(((Label) findByName("Label7", department)).getText(), ((TextField) findByName("titleeee", department)).getText(), ((TextArea) findByName("bodyArea", department)).getText());
        System.out.println(output);

        boolean val = super.onDepartmentsSend();

        return val;
    }
//-------------------------------------------------Friends------------------------------------------------

    protected void beforeGUI1(Form f) {
        try {
            HttpCon con12 = new HttpCon(null, PropertyClass.ServerUrl + "Allfrends");
            con12.SetContype(false, true, true);
            Thread t = new Thread(con12);
            synchronized (t) {
                t.start();
                t.wait();
            }
            final String bf[] = Splitter.Split(con12.getValue().toString(), "-");
            System.out.println(bf);
            final List l = (List) findByName("studentlist", f);

            for (int i = 0; i < bf.length - 1; i++) {

                l.addItem(Splitter.Split(bf[i], "/")[0]);

            }

            l.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent ae) {
                  frndid =  Splitter.Split(bf[l.getSelectedIndex()], "/")[1];
                  showForm("Userprofile", null);
                }
            });

        } catch (Exception e) {
            System.out.println(e);
        }

        super.beforeGUI1(f);

    }

    protected void beforeUserprofile(Form f) {
        try {
            ((Label) findByName("Label2", f)).setIcon(Image.createImage("/no_user.png").scaledHeight(72));
            HttpCon con12 = new HttpCon(frndid+"-p", PropertyClass.ServerUrl + "Frends");
            con12.SetContype(true, true, true);
            Thread t = new Thread(con12);
            synchronized (t) {
                t.start();
                t.wait();
            }
            String frnd[] =Splitter.Split(con12.getValue().toString(),"-");
            ((Label)findByName("Label4", f)).setText(frnd[0]);
           ((Label)findByName("Label6", f)).setText(frnd[1]);
            ((Label)findByName("tel", f)).setText("Tel   "+frnd[2]);
            ((Label)findByName("Label81", f)).setText("Address   "+frnd[3]);
           ((Label)findByName("Label7", f)).setText("email   "+frnd[4]);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        super.beforeUserprofile(f);

    }
}
