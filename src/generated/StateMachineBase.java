/**
 * This class contains generated code from the LWUIT resource editor, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://lwuit.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.sun.lwuit.*;
import com.sun.lwuit.util.*;
import com.sun.lwuit.plaf.*;
import com.sun.lwuit.events.*;

public abstract class StateMachineBase extends UIBuilder {
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected abstract void initVars();

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Table", com.sun.lwuit.table.Table.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.open(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            showForm("SplashScreen", null);
        } else {
            Form f = (Form)createContainer(resPath, "SplashScreen");
            beforeShow(f);
            f.show();
            postShow(f);
        }
    }

    protected void initTheme(Resources res) {
            UIManager.getInstance().setThemeProps(res.getTheme(res.getThemeResourceNames()[0]));
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.sun.lwuit.Form findSubjects(Container root) {
        return (com.sun.lwuit.Form)findByName("Subjects", root);
    }

    public com.sun.lwuit.Container findContainer4(Container root) {
        return (com.sun.lwuit.Container)findByName("Container4", root);
    }

    public com.sun.lwuit.Button findButton9(Container root) {
        return (com.sun.lwuit.Button)findByName("Button9", root);
    }

    public com.sun.lwuit.Container findContainer3(Container root) {
        return (com.sun.lwuit.Container)findByName("Container3", root);
    }

    public com.sun.lwuit.Button findButton8(Container root) {
        return (com.sun.lwuit.Button)findByName("Button8", root);
    }

    public com.sun.lwuit.Container findContainer2(Container root) {
        return (com.sun.lwuit.Container)findByName("Container2", root);
    }

    public com.sun.lwuit.Button findButton7(Container root) {
        return (com.sun.lwuit.Button)findByName("Button7", root);
    }

    public com.sun.lwuit.Container findContainer1(Container root) {
        return (com.sun.lwuit.Container)findByName("Container1", root);
    }

    public com.sun.lwuit.Button findButton6(Container root) {
        return (com.sun.lwuit.Button)findByName("Button6", root);
    }

    public com.sun.lwuit.Button findButton5(Container root) {
        return (com.sun.lwuit.Button)findByName("Button5", root);
    }

    public com.sun.lwuit.Button findButton4(Container root) {
        return (com.sun.lwuit.Button)findByName("Button4", root);
    }

    public com.sun.lwuit.Button findButton3(Container root) {
        return (com.sun.lwuit.Button)findByName("Button3", root);
    }

    public com.sun.lwuit.Container findContainer5(Container root) {
        return (com.sun.lwuit.Container)findByName("Container5", root);
    }

    public com.sun.lwuit.Component findTel(Container root) {
        return (com.sun.lwuit.Component)findByName("tel", root);
    }

    public com.sun.lwuit.Button findButton2(Container root) {
        return (com.sun.lwuit.Button)findByName("Button2", root);
    }

    public com.sun.lwuit.Label findLabel21(Container root) {
        return (com.sun.lwuit.Label)findByName("Label21", root);
    }

    public com.sun.lwuit.Button findSaveAll(Container root) {
        return (com.sun.lwuit.Button)findByName("SaveAll", root);
    }

    public com.sun.lwuit.TextField findAddr(Container root) {
        return (com.sun.lwuit.TextField)findByName("addr", root);
    }

    public com.sun.lwuit.Button findButton21(Container root) {
        return (com.sun.lwuit.Button)findByName("Button21", root);
    }

    public com.sun.lwuit.Button findButton(Container root) {
        return (com.sun.lwuit.Button)findByName("Button", root);
    }

    public com.sun.lwuit.Label findLabel1(Container root) {
        return (com.sun.lwuit.Label)findByName("Label1", root);
    }

    public com.sun.lwuit.Label findLabel3(Container root) {
        return (com.sun.lwuit.Label)findByName("Label3", root);
    }

    public com.sun.lwuit.Label findLabel2(Container root) {
        return (com.sun.lwuit.Label)findByName("Label2", root);
    }

    public com.sun.lwuit.Container findContainer31(Container root) {
        return (com.sun.lwuit.Container)findByName("Container31", root);
    }

    public com.sun.lwuit.Form findPersonalinfo(Container root) {
        return (com.sun.lwuit.Form)findByName("personalinfo", root);
    }

    public com.sun.lwuit.Form findGroupmessage(Container root) {
        return (com.sun.lwuit.Form)findByName("Groupmessage", root);
    }

    public com.sun.lwuit.Form findSplashScreen(Container root) {
        return (com.sun.lwuit.Form)findByName("SplashScreen", root);
    }

    public com.sun.lwuit.TextField findIndex(Container root) {
        return (com.sun.lwuit.TextField)findByName("index", root);
    }

    public com.sun.lwuit.Form findGUI1(Container root) {
        return (com.sun.lwuit.Form)findByName("GUI 1", root);
    }

    public com.sun.lwuit.Form findHome(Container root) {
        return (com.sun.lwuit.Form)findByName("Home", root);
    }

    public com.sun.lwuit.Label findLabel10(Container root) {
        return (com.sun.lwuit.Label)findByName("Label10", root);
    }

    public com.sun.lwuit.TextField findPath11(Container root) {
        return (com.sun.lwuit.TextField)findByName("path11", root);
    }

    public com.sun.lwuit.Label findLabel6(Container root) {
        return (com.sun.lwuit.Label)findByName("Label6", root);
    }

    public com.sun.lwuit.Label findLabel7(Container root) {
        return (com.sun.lwuit.Label)findByName("Label7", root);
    }

    public com.sun.lwuit.Label findLabel32(Container root) {
        return (com.sun.lwuit.Label)findByName("Label32", root);
    }

    public com.sun.lwuit.Label findLabel4(Container root) {
        return (com.sun.lwuit.Label)findByName("Label4", root);
    }

    public com.sun.lwuit.Label findLabel31(Container root) {
        return (com.sun.lwuit.Label)findByName("Label31", root);
    }

    public com.sun.lwuit.TextField findThispass(Container root) {
        return (com.sun.lwuit.TextField)findByName("thispass", root);
    }

    public com.sun.lwuit.Label findLabel5(Container root) {
        return (com.sun.lwuit.Label)findByName("Label5", root);
    }

    public com.sun.lwuit.Button findSendrequest(Container root) {
        return (com.sun.lwuit.Button)findByName("sendrequest", root);
    }

    public com.sun.lwuit.Label findLabel13(Container root) {
        return (com.sun.lwuit.Label)findByName("Label13", root);
    }

    public com.sun.lwuit.Label findLabel12(Container root) {
        return (com.sun.lwuit.Label)findByName("Label12", root);
    }

    public com.sun.lwuit.Label findLabel8(Container root) {
        return (com.sun.lwuit.Label)findByName("Label8", root);
    }

    public com.sun.lwuit.Label findLabel11(Container root) {
        return (com.sun.lwuit.Label)findByName("Label11", root);
    }

    public com.sun.lwuit.Label findLabel9(Container root) {
        return (com.sun.lwuit.Label)findByName("Label9", root);
    }

    public com.sun.lwuit.Form findMessages(Container root) {
        return (com.sun.lwuit.Form)findByName("Messages", root);
    }

    public com.sun.lwuit.Form findHtmlpasrecover(Container root) {
        return (com.sun.lwuit.Form)findByName("Htmlpasrecover", root);
    }

    public com.sun.lwuit.TextField findEmail(Container root) {
        return (com.sun.lwuit.TextField)findByName("email", root);
    }

    public com.sun.lwuit.Form findTTable(Container root) {
        return (com.sun.lwuit.Form)findByName("TTable", root);
    }

    public com.sun.lwuit.Button findButton1(Container root) {
        return (com.sun.lwuit.Button)findByName("Button1", root);
    }

    public com.sun.lwuit.Form findTTableINFO(Container root) {
        return (com.sun.lwuit.Form)findByName("TTableINFO", root);
    }

    public com.sun.lwuit.List findStudentlist(Container root) {
        return (com.sun.lwuit.List)findByName("studentlist", root);
    }

    public com.sun.lwuit.TextField findStatus1(Container root) {
        return (com.sun.lwuit.TextField)findByName("status1", root);
    }

    public com.sun.lwuit.TextField findSearchfield(Container root) {
        return (com.sun.lwuit.TextField)findByName("searchfield", root);
    }

    public com.sun.lwuit.TextField findPassword(Container root) {
        return (com.sun.lwuit.TextField)findByName("Password", root);
    }

    public com.sun.lwuit.List findList2(Container root) {
        return (com.sun.lwuit.List)findByName("List2", root);
    }

    public com.sun.lwuit.table.Table findTable(Container root) {
        return (com.sun.lwuit.table.Table)findByName("Table", root);
    }

    public com.sun.lwuit.TextArea findTextArea(Container root) {
        return (com.sun.lwuit.TextArea)findByName("TextArea", root);
    }

    public com.sun.lwuit.Dialog findWelcome(Container root) {
        return (com.sun.lwuit.Dialog)findByName("Welcome", root);
    }

    public com.sun.lwuit.Form findPresence(Container root) {
        return (com.sun.lwuit.Form)findByName("Presence", root);
    }

    public com.sun.lwuit.List findList1(Container root) {
        return (com.sun.lwuit.List)findByName("List1", root);
    }

    public com.sun.lwuit.TextField findNowpass(Container root) {
        return (com.sun.lwuit.TextField)findByName("nowpass", root);
    }

    public com.sun.lwuit.Form findUserprofile(Container root) {
        return (com.sun.lwuit.Form)findByName("Userprofile", root);
    }

    public com.sun.lwuit.TextArea findTextArea1(Container root) {
        return (com.sun.lwuit.TextArea)findByName("TextArea1", root);
    }

    public com.sun.lwuit.Form findLoginGUI(Container root) {
        return (com.sun.lwuit.Form)findByName("LoginGUI", root);
    }

    public com.sun.lwuit.Component findName(Container root) {
        return (com.sun.lwuit.Component)findByName("name", root);
    }

    public com.sun.lwuit.Form findDepartments(Container root) {
        return (com.sun.lwuit.Form)findByName("Departments", root);
    }

    public com.sun.lwuit.Dialog findAlertBox(Container root) {
        return (com.sun.lwuit.Dialog)findByName("AlertBox", root);
    }

    public com.sun.lwuit.Button findDone(Container root) {
        return (com.sun.lwuit.Button)findByName("Done", root);
    }

    public com.sun.lwuit.Label findLabel81(Container root) {
        return (com.sun.lwuit.Label)findByName("Label81", root);
    }

    public com.sun.lwuit.Form findFirstForm(Container root) {
        return (com.sun.lwuit.Form)findByName("FirstForm", root);
    }

    public com.sun.lwuit.List findList(Container root) {
        return (com.sun.lwuit.List)findByName("List", root);
    }

    public com.sun.lwuit.Container findContainer(Container root) {
        return (com.sun.lwuit.Container)findByName("Container", root);
    }

    public com.sun.lwuit.Form findMessageInfo(Container root) {
        return (com.sun.lwuit.Form)findByName("MessageInfo", root);
    }

    public com.sun.lwuit.RadioButton findRadioButton(Container root) {
        return (com.sun.lwuit.RadioButton)findByName("RadioButton", root);
    }

    public com.sun.lwuit.List findList12(Container root) {
        return (com.sun.lwuit.List)findByName("List12", root);
    }

    public com.sun.lwuit.Form findResponse(Container root) {
        return (com.sun.lwuit.Form)findByName("Response", root);
    }

    public com.sun.lwuit.Button findButton10(Container root) {
        return (com.sun.lwuit.Button)findByName("Button10", root);
    }

    public com.sun.lwuit.TextArea findAboutDepartmentt(Container root) {
        return (com.sun.lwuit.TextArea)findByName("aboutDepartmentt", root);
    }

    public com.sun.lwuit.TextField findTextField(Container root) {
        return (com.sun.lwuit.TextField)findByName("TextField", root);
    }

    public com.sun.lwuit.Button findButton11(Container root) {
        return (com.sun.lwuit.Button)findByName("Button11", root);
    }

    public com.sun.lwuit.TextField findTitleeee(Container root) {
        return (com.sun.lwuit.TextField)findByName("titleeee", root);
    }

    public com.sun.lwuit.TextField findUsername(Container root) {
        return (com.sun.lwuit.TextField)findByName("Username", root);
    }

    public com.sun.lwuit.Label findPropic(Container root) {
        return (com.sun.lwuit.Label)findByName("propic", root);
    }

    public com.sun.lwuit.RadioButton findRadioButton1(Container root) {
        return (com.sun.lwuit.RadioButton)findByName("RadioButton1", root);
    }

    public com.sun.lwuit.Label findLabel(Container root) {
        return (com.sun.lwuit.Label)findByName("Label", root);
    }

    public com.sun.lwuit.Form findMyProfile(Container root) {
        return (com.sun.lwuit.Form)findByName("MyProfile", root);
    }

    public com.sun.lwuit.TextField findGroup(Container root) {
        return (com.sun.lwuit.TextField)findByName("group", root);
    }

    public com.sun.lwuit.TextArea findBodyArea(Container root) {
        return (com.sun.lwuit.TextArea)findByName("bodyArea", root);
    }

    public static final int COMMAND_FirstFormPresence = 14;
    public static final int COMMAND_UserprofileSend = 28;
    public static final int COMMAND_GroupmessageResponse = 12;
    public static final int COMMAND_FirstFormMessages = 9;
    public static final int COMMAND_FirstFormHome = 5;
    public static final int COMMAND_MessageInfoButton = 10;
    public static final int COMMAND_FirstFormBack = 2;
    public static final int COMMAND_HtmlpasrecoverRetrieve = 25;
    public static final int COMMAND_HomeHead = 31;
    public static final int COMMAND_FirstFormFriends = 3;
    public static final int COMMAND_FirstForm = 20;
    public static final int COMMAND_HomeDiv1 = 33;
    public static final int COMMAND_PresenceBack = 13;
    public static final int COMMAND_FirstFormSubjects = 7;
    public static final int COMMAND_HomeDiv3 = 23;
    public static final int COMMAND_HomeDiv2 = 32;
    public static final int COMMAND_PersonalinfoDone = 27;
    public static final int COMMAND_DepartmentsSend = 46;
    public static final int COMMAND_MessagesBack = 8;
    public static final int COMMAND_HomeDepch = 22;
    public static final int COMMAND_TTableBack = 16;
    public static final int COMMAND_MyProfilePersonal = 26;
    public static final int COMMAND_LoginGUIExit = 24;
    public static final int COMMAND_TTableINFOBack = 17;
    public static final int COMMAND_FirstFormTTable = 15;
    public static final int COMMAND_MyProfileSaveAll = 29;
    public static final int COMMAND_ResponseBack = 11;
    public static final int COMMAND_MyProfile = 30;
    public static final int COMMAND_LoginGUILogme = 1;
    public static final int COMMAND_DepartmentsBack = 4;

    protected boolean onFirstFormPresence() {
        return false;
    }

    protected boolean onUserprofileSend() {
        return false;
    }

    protected boolean onGroupmessageResponse() {
        return false;
    }

    protected boolean onFirstFormMessages() {
        return false;
    }

    protected boolean onFirstFormHome() {
        return false;
    }

    protected boolean onMessageInfoButton() {
        return false;
    }

    protected boolean onFirstFormBack() {
        return false;
    }

    protected boolean onHtmlpasrecoverRetrieve() {
        return false;
    }

    protected boolean onHomeHead() {
        return false;
    }

    protected boolean onFirstFormFriends() {
        return false;
    }

    protected boolean onFirstForm() {
        return false;
    }

    protected boolean onHomeDiv1() {
        return false;
    }

    protected boolean onPresenceBack() {
        return false;
    }

    protected boolean onFirstFormSubjects() {
        return false;
    }

    protected boolean onHomeDiv3() {
        return false;
    }

    protected boolean onHomeDiv2() {
        return false;
    }

    protected boolean onPersonalinfoDone() {
        return false;
    }

    protected boolean onDepartmentsSend() {
        return false;
    }

    protected boolean onMessagesBack() {
        return false;
    }

    protected boolean onHomeDepch() {
        return false;
    }

    protected boolean onTTableBack() {
        return false;
    }

    protected boolean onMyProfilePersonal() {
        return false;
    }

    protected boolean onLoginGUIExit() {
        return false;
    }

    protected boolean onTTableINFOBack() {
        return false;
    }

    protected boolean onFirstFormTTable() {
        return false;
    }

    protected boolean onMyProfileSaveAll() {
        return false;
    }

    protected boolean onResponseBack() {
        return false;
    }

    protected boolean onMyProfile() {
        return false;
    }

    protected boolean onLoginGUILogme() {
        return false;
    }

    protected boolean onDepartmentsBack() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_FirstFormPresence:
                if(onFirstFormPresence()) {
                    ev.consume();
                }
                return;

            case COMMAND_UserprofileSend:
                if(onUserprofileSend()) {
                    ev.consume();
                }
                return;

            case COMMAND_GroupmessageResponse:
                if(onGroupmessageResponse()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormMessages:
                if(onFirstFormMessages()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormHome:
                if(onFirstFormHome()) {
                    ev.consume();
                }
                return;

            case COMMAND_MessageInfoButton:
                if(onMessageInfoButton()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormBack:
                if(onFirstFormBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_HtmlpasrecoverRetrieve:
                if(onHtmlpasrecoverRetrieve()) {
                    ev.consume();
                }
                return;

            case COMMAND_HomeHead:
                if(onHomeHead()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormFriends:
                if(onFirstFormFriends()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstForm:
                if(onFirstForm()) {
                    ev.consume();
                }
                return;

            case COMMAND_HomeDiv1:
                if(onHomeDiv1()) {
                    ev.consume();
                }
                return;

            case COMMAND_PresenceBack:
                if(onPresenceBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormSubjects:
                if(onFirstFormSubjects()) {
                    ev.consume();
                }
                return;

            case COMMAND_HomeDiv3:
                if(onHomeDiv3()) {
                    ev.consume();
                }
                return;

            case COMMAND_HomeDiv2:
                if(onHomeDiv2()) {
                    ev.consume();
                }
                return;

            case COMMAND_PersonalinfoDone:
                if(onPersonalinfoDone()) {
                    ev.consume();
                }
                return;

            case COMMAND_DepartmentsSend:
                if(onDepartmentsSend()) {
                    ev.consume();
                }
                return;

            case COMMAND_MessagesBack:
                if(onMessagesBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_HomeDepch:
                if(onHomeDepch()) {
                    ev.consume();
                }
                return;

            case COMMAND_TTableBack:
                if(onTTableBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_MyProfilePersonal:
                if(onMyProfilePersonal()) {
                    ev.consume();
                }
                return;

            case COMMAND_LoginGUIExit:
                if(onLoginGUIExit()) {
                    ev.consume();
                }
                return;

            case COMMAND_TTableINFOBack:
                if(onTTableINFOBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_FirstFormTTable:
                if(onFirstFormTTable()) {
                    ev.consume();
                }
                return;

            case COMMAND_MyProfileSaveAll:
                if(onMyProfileSaveAll()) {
                    ev.consume();
                }
                return;

            case COMMAND_ResponseBack:
                if(onResponseBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_MyProfile:
                if(onMyProfile()) {
                    ev.consume();
                }
                return;

            case COMMAND_LoginGUILogme:
                if(onLoginGUILogme()) {
                    ev.consume();
                }
                return;

            case COMMAND_DepartmentsBack:
                if(onDepartmentsBack()) {
                    ev.consume();
                }
                return;

        }
    }

    protected void exitForm(Form f) {
        if("personalinfo".equals(f.getName())) {
            exitPersonalinfo(f);
            return;
        }

        if("TTableINFO".equals(f.getName())) {
            exitTTableINFO(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            exitGUI1(f);
            return;
        }

        if("Userprofile".equals(f.getName())) {
            exitUserprofile(f);
            return;
        }

        if("Groupmessage".equals(f.getName())) {
            exitGroupmessage(f);
            return;
        }

        if("Home".equals(f.getName())) {
            exitHome(f);
            return;
        }

        if("Subjects".equals(f.getName())) {
            exitSubjects(f);
            return;
        }

        if("Htmlpasrecover".equals(f.getName())) {
            exitHtmlpasrecover(f);
            return;
        }

        if("Response".equals(f.getName())) {
            exitResponse(f);
            return;
        }

        if("MyProfile".equals(f.getName())) {
            exitMyProfile(f);
            return;
        }

        if("MessageInfo".equals(f.getName())) {
            exitMessageInfo(f);
            return;
        }

        if("LoginGUI".equals(f.getName())) {
            exitLoginGUI(f);
            return;
        }

        if("Messages".equals(f.getName())) {
            exitMessages(f);
            return;
        }

        if("TTable".equals(f.getName())) {
            exitTTable(f);
            return;
        }

        if("Presence".equals(f.getName())) {
            exitPresence(f);
            return;
        }

        if("AlertBox".equals(f.getName())) {
            exitAlertBox(f);
            return;
        }

        if("Welcome".equals(f.getName())) {
            exitWelcome(f);
            return;
        }

        if("FirstForm".equals(f.getName())) {
            exitFirstForm(f);
            return;
        }

        if("SplashScreen".equals(f.getName())) {
            exitSplashScreen(f);
            return;
        }

        if("Departments".equals(f.getName())) {
            exitDepartments(f);
            return;
        }

    }


    protected void exitPersonalinfo(Form f) {
    }


    protected void exitTTableINFO(Form f) {
    }


    protected void exitGUI1(Form f) {
    }


    protected void exitUserprofile(Form f) {
    }


    protected void exitGroupmessage(Form f) {
    }


    protected void exitHome(Form f) {
    }


    protected void exitSubjects(Form f) {
    }


    protected void exitHtmlpasrecover(Form f) {
    }


    protected void exitResponse(Form f) {
    }


    protected void exitMyProfile(Form f) {
    }


    protected void exitMessageInfo(Form f) {
    }


    protected void exitLoginGUI(Form f) {
    }


    protected void exitMessages(Form f) {
    }


    protected void exitTTable(Form f) {
    }


    protected void exitPresence(Form f) {
    }


    protected void exitAlertBox(Form f) {
    }


    protected void exitWelcome(Form f) {
    }


    protected void exitFirstForm(Form f) {
    }


    protected void exitSplashScreen(Form f) {
    }


    protected void exitDepartments(Form f) {
    }

    protected void beforeShow(Form f) {
        if("personalinfo".equals(f.getName())) {
            beforePersonalinfo(f);
            return;
        }

        if("TTableINFO".equals(f.getName())) {
            beforeTTableINFO(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            beforeGUI1(f);
            return;
        }

        if("Userprofile".equals(f.getName())) {
            beforeUserprofile(f);
            return;
        }

        if("Groupmessage".equals(f.getName())) {
            beforeGroupmessage(f);
            return;
        }

        if("Home".equals(f.getName())) {
            beforeHome(f);
            return;
        }

        if("Subjects".equals(f.getName())) {
            beforeSubjects(f);
            return;
        }

        if("Htmlpasrecover".equals(f.getName())) {
            beforeHtmlpasrecover(f);
            return;
        }

        if("Response".equals(f.getName())) {
            beforeResponse(f);
            return;
        }

        if("MyProfile".equals(f.getName())) {
            beforeMyProfile(f);
            return;
        }

        if("MessageInfo".equals(f.getName())) {
            beforeMessageInfo(f);
            return;
        }

        if("LoginGUI".equals(f.getName())) {
            beforeLoginGUI(f);
            return;
        }

        if("Messages".equals(f.getName())) {
            beforeMessages(f);
            return;
        }

        if("TTable".equals(f.getName())) {
            beforeTTable(f);
            return;
        }

        if("Presence".equals(f.getName())) {
            beforePresence(f);
            return;
        }

        if("AlertBox".equals(f.getName())) {
            beforeAlertBox(f);
            return;
        }

        if("Welcome".equals(f.getName())) {
            beforeWelcome(f);
            return;
        }

        if("FirstForm".equals(f.getName())) {
            beforeFirstForm(f);
            return;
        }

        if("SplashScreen".equals(f.getName())) {
            beforeSplashScreen(f);
            return;
        }

        if("Departments".equals(f.getName())) {
            beforeDepartments(f);
            return;
        }

    }


    protected void beforePersonalinfo(Form f) {
    }


    protected void beforeTTableINFO(Form f) {
    }


    protected void beforeGUI1(Form f) {
    }


    protected void beforeUserprofile(Form f) {
    }


    protected void beforeGroupmessage(Form f) {
    }


    protected void beforeHome(Form f) {
    }


    protected void beforeSubjects(Form f) {
    }


    protected void beforeHtmlpasrecover(Form f) {
    }


    protected void beforeResponse(Form f) {
    }


    protected void beforeMyProfile(Form f) {
    }


    protected void beforeMessageInfo(Form f) {
    }


    protected void beforeLoginGUI(Form f) {
    }


    protected void beforeMessages(Form f) {
    }


    protected void beforeTTable(Form f) {
    }


    protected void beforePresence(Form f) {
    }


    protected void beforeAlertBox(Form f) {
    }


    protected void beforeWelcome(Form f) {
    }


    protected void beforeFirstForm(Form f) {
    }


    protected void beforeSplashScreen(Form f) {
    }


    protected void beforeDepartments(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        if("personalinfo".equals(c.getName())) {
            beforeContainerPersonalinfo(c);
            return;
        }

        if("TTableINFO".equals(c.getName())) {
            beforeContainerTTableINFO(c);
            return;
        }

        if("GUI 1".equals(c.getName())) {
            beforeContainerGUI1(c);
            return;
        }

        if("Userprofile".equals(c.getName())) {
            beforeContainerUserprofile(c);
            return;
        }

        if("Groupmessage".equals(c.getName())) {
            beforeContainerGroupmessage(c);
            return;
        }

        if("Home".equals(c.getName())) {
            beforeContainerHome(c);
            return;
        }

        if("Subjects".equals(c.getName())) {
            beforeContainerSubjects(c);
            return;
        }

        if("Htmlpasrecover".equals(c.getName())) {
            beforeContainerHtmlpasrecover(c);
            return;
        }

        if("Response".equals(c.getName())) {
            beforeContainerResponse(c);
            return;
        }

        if("MyProfile".equals(c.getName())) {
            beforeContainerMyProfile(c);
            return;
        }

        if("MessageInfo".equals(c.getName())) {
            beforeContainerMessageInfo(c);
            return;
        }

        if("LoginGUI".equals(c.getName())) {
            beforeContainerLoginGUI(c);
            return;
        }

        if("Messages".equals(c.getName())) {
            beforeContainerMessages(c);
            return;
        }

        if("TTable".equals(c.getName())) {
            beforeContainerTTable(c);
            return;
        }

        if("Presence".equals(c.getName())) {
            beforeContainerPresence(c);
            return;
        }

        if("AlertBox".equals(c.getName())) {
            beforeContainerAlertBox(c);
            return;
        }

        if("Welcome".equals(c.getName())) {
            beforeContainerWelcome(c);
            return;
        }

        if("FirstForm".equals(c.getName())) {
            beforeContainerFirstForm(c);
            return;
        }

        if("SplashScreen".equals(c.getName())) {
            beforeContainerSplashScreen(c);
            return;
        }

        if("Departments".equals(c.getName())) {
            beforeContainerDepartments(c);
            return;
        }

    }


    protected void beforeContainerPersonalinfo(Container c) {
    }


    protected void beforeContainerTTableINFO(Container c) {
    }


    protected void beforeContainerGUI1(Container c) {
    }


    protected void beforeContainerUserprofile(Container c) {
    }


    protected void beforeContainerGroupmessage(Container c) {
    }


    protected void beforeContainerHome(Container c) {
    }


    protected void beforeContainerSubjects(Container c) {
    }


    protected void beforeContainerHtmlpasrecover(Container c) {
    }


    protected void beforeContainerResponse(Container c) {
    }


    protected void beforeContainerMyProfile(Container c) {
    }


    protected void beforeContainerMessageInfo(Container c) {
    }


    protected void beforeContainerLoginGUI(Container c) {
    }


    protected void beforeContainerMessages(Container c) {
    }


    protected void beforeContainerTTable(Container c) {
    }


    protected void beforeContainerPresence(Container c) {
    }


    protected void beforeContainerAlertBox(Container c) {
    }


    protected void beforeContainerWelcome(Container c) {
    }


    protected void beforeContainerFirstForm(Container c) {
    }


    protected void beforeContainerSplashScreen(Container c) {
    }


    protected void beforeContainerDepartments(Container c) {
    }

    protected void postShow(Form f) {
        if("personalinfo".equals(f.getName())) {
            postPersonalinfo(f);
            return;
        }

        if("TTableINFO".equals(f.getName())) {
            postTTableINFO(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            postGUI1(f);
            return;
        }

        if("Userprofile".equals(f.getName())) {
            postUserprofile(f);
            return;
        }

        if("Groupmessage".equals(f.getName())) {
            postGroupmessage(f);
            return;
        }

        if("Home".equals(f.getName())) {
            postHome(f);
            return;
        }

        if("Subjects".equals(f.getName())) {
            postSubjects(f);
            return;
        }

        if("Htmlpasrecover".equals(f.getName())) {
            postHtmlpasrecover(f);
            return;
        }

        if("Response".equals(f.getName())) {
            postResponse(f);
            return;
        }

        if("MyProfile".equals(f.getName())) {
            postMyProfile(f);
            return;
        }

        if("MessageInfo".equals(f.getName())) {
            postMessageInfo(f);
            return;
        }

        if("LoginGUI".equals(f.getName())) {
            postLoginGUI(f);
            return;
        }

        if("Messages".equals(f.getName())) {
            postMessages(f);
            return;
        }

        if("TTable".equals(f.getName())) {
            postTTable(f);
            return;
        }

        if("Presence".equals(f.getName())) {
            postPresence(f);
            return;
        }

        if("AlertBox".equals(f.getName())) {
            postAlertBox(f);
            return;
        }

        if("Welcome".equals(f.getName())) {
            postWelcome(f);
            return;
        }

        if("FirstForm".equals(f.getName())) {
            postFirstForm(f);
            return;
        }

        if("SplashScreen".equals(f.getName())) {
            postSplashScreen(f);
            return;
        }

        if("Departments".equals(f.getName())) {
            postDepartments(f);
            return;
        }

    }


    protected void postPersonalinfo(Form f) {
    }


    protected void postTTableINFO(Form f) {
    }


    protected void postGUI1(Form f) {
    }


    protected void postUserprofile(Form f) {
    }


    protected void postGroupmessage(Form f) {
    }


    protected void postHome(Form f) {
    }


    protected void postSubjects(Form f) {
    }


    protected void postHtmlpasrecover(Form f) {
    }


    protected void postResponse(Form f) {
    }


    protected void postMyProfile(Form f) {
    }


    protected void postMessageInfo(Form f) {
    }


    protected void postLoginGUI(Form f) {
    }


    protected void postMessages(Form f) {
    }


    protected void postTTable(Form f) {
    }


    protected void postPresence(Form f) {
    }


    protected void postAlertBox(Form f) {
    }


    protected void postWelcome(Form f) {
    }


    protected void postFirstForm(Form f) {
    }


    protected void postSplashScreen(Form f) {
    }


    protected void postDepartments(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("personalinfo".equals(c.getName())) {
            postContainerPersonalinfo(c);
            return;
        }

        if("TTableINFO".equals(c.getName())) {
            postContainerTTableINFO(c);
            return;
        }

        if("GUI 1".equals(c.getName())) {
            postContainerGUI1(c);
            return;
        }

        if("Userprofile".equals(c.getName())) {
            postContainerUserprofile(c);
            return;
        }

        if("Groupmessage".equals(c.getName())) {
            postContainerGroupmessage(c);
            return;
        }

        if("Home".equals(c.getName())) {
            postContainerHome(c);
            return;
        }

        if("Subjects".equals(c.getName())) {
            postContainerSubjects(c);
            return;
        }

        if("Htmlpasrecover".equals(c.getName())) {
            postContainerHtmlpasrecover(c);
            return;
        }

        if("Response".equals(c.getName())) {
            postContainerResponse(c);
            return;
        }

        if("MyProfile".equals(c.getName())) {
            postContainerMyProfile(c);
            return;
        }

        if("MessageInfo".equals(c.getName())) {
            postContainerMessageInfo(c);
            return;
        }

        if("LoginGUI".equals(c.getName())) {
            postContainerLoginGUI(c);
            return;
        }

        if("Messages".equals(c.getName())) {
            postContainerMessages(c);
            return;
        }

        if("TTable".equals(c.getName())) {
            postContainerTTable(c);
            return;
        }

        if("Presence".equals(c.getName())) {
            postContainerPresence(c);
            return;
        }

        if("AlertBox".equals(c.getName())) {
            postContainerAlertBox(c);
            return;
        }

        if("Welcome".equals(c.getName())) {
            postContainerWelcome(c);
            return;
        }

        if("FirstForm".equals(c.getName())) {
            postContainerFirstForm(c);
            return;
        }

        if("SplashScreen".equals(c.getName())) {
            postContainerSplashScreen(c);
            return;
        }

        if("Departments".equals(c.getName())) {
            postContainerDepartments(c);
            return;
        }

    }


    protected void postContainerPersonalinfo(Container c) {
    }


    protected void postContainerTTableINFO(Container c) {
    }


    protected void postContainerGUI1(Container c) {
    }


    protected void postContainerUserprofile(Container c) {
    }


    protected void postContainerGroupmessage(Container c) {
    }


    protected void postContainerHome(Container c) {
    }


    protected void postContainerSubjects(Container c) {
    }


    protected void postContainerHtmlpasrecover(Container c) {
    }


    protected void postContainerResponse(Container c) {
    }


    protected void postContainerMyProfile(Container c) {
    }


    protected void postContainerMessageInfo(Container c) {
    }


    protected void postContainerLoginGUI(Container c) {
    }


    protected void postContainerMessages(Container c) {
    }


    protected void postContainerTTable(Container c) {
    }


    protected void postContainerPresence(Container c) {
    }


    protected void postContainerAlertBox(Container c) {
    }


    protected void postContainerWelcome(Container c) {
    }


    protected void postContainerFirstForm(Container c) {
    }


    protected void postContainerSplashScreen(Container c) {
    }


    protected void postContainerDepartments(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("personalinfo".equals(rootName)) {
            onCreatePersonalinfo();
            return;
        }

        if("TTableINFO".equals(rootName)) {
            onCreateTTableINFO();
            return;
        }

        if("GUI 1".equals(rootName)) {
            onCreateGUI1();
            return;
        }

        if("Userprofile".equals(rootName)) {
            onCreateUserprofile();
            return;
        }

        if("Groupmessage".equals(rootName)) {
            onCreateGroupmessage();
            return;
        }

        if("Home".equals(rootName)) {
            onCreateHome();
            return;
        }

        if("Subjects".equals(rootName)) {
            onCreateSubjects();
            return;
        }

        if("Htmlpasrecover".equals(rootName)) {
            onCreateHtmlpasrecover();
            return;
        }

        if("Response".equals(rootName)) {
            onCreateResponse();
            return;
        }

        if("MyProfile".equals(rootName)) {
            onCreateMyProfile();
            return;
        }

        if("MessageInfo".equals(rootName)) {
            onCreateMessageInfo();
            return;
        }

        if("LoginGUI".equals(rootName)) {
            onCreateLoginGUI();
            return;
        }

        if("Messages".equals(rootName)) {
            onCreateMessages();
            return;
        }

        if("TTable".equals(rootName)) {
            onCreateTTable();
            return;
        }

        if("Presence".equals(rootName)) {
            onCreatePresence();
            return;
        }

        if("AlertBox".equals(rootName)) {
            onCreateAlertBox();
            return;
        }

        if("Welcome".equals(rootName)) {
            onCreateWelcome();
            return;
        }

        if("FirstForm".equals(rootName)) {
            onCreateFirstForm();
            return;
        }

        if("SplashScreen".equals(rootName)) {
            onCreateSplashScreen();
            return;
        }

        if("Departments".equals(rootName)) {
            onCreateDepartments();
            return;
        }

    }


    protected void onCreatePersonalinfo() {
    }


    protected void onCreateTTableINFO() {
    }


    protected void onCreateGUI1() {
    }


    protected void onCreateUserprofile() {
    }


    protected void onCreateGroupmessage() {
    }


    protected void onCreateHome() {
    }


    protected void onCreateSubjects() {
    }


    protected void onCreateHtmlpasrecover() {
    }


    protected void onCreateResponse() {
    }


    protected void onCreateMyProfile() {
    }


    protected void onCreateMessageInfo() {
    }


    protected void onCreateLoginGUI() {
    }


    protected void onCreateMessages() {
    }


    protected void onCreateTTable() {
    }


    protected void onCreatePresence() {
    }


    protected void onCreateAlertBox() {
    }


    protected void onCreateWelcome() {
    }


    protected void onCreateFirstForm() {
    }


    protected void onCreateSplashScreen() {
    }


    protected void onCreateDepartments() {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(rootContainerName == null) return;
        if(rootContainerName.equals("personalinfo")) {
            if("thispass".equals(c.getName())) {
                onPersonalinfo_ThispassAction(c, event);
                return;
            }
            if("nowpass".equals(c.getName())) {
                onPersonalinfo_NowpassAction(c, event);
                return;
            }
            if("path11".equals(c.getName())) {
                onPersonalinfo_Path11Action(c, event);
                return;
            }
            if("Done".equals(c.getName())) {
                onPersonalinfo_DoneAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("TTableINFO")) {
            if("Button".equals(c.getName())) {
                onTTableINFO_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GUI 1")) {
            if("Button5".equals(c.getName())) {
                onGUI1_Button5Action(c, event);
                return;
            }
            if("RadioButton".equals(c.getName())) {
                onGUI1_RadioButtonAction(c, event);
                return;
            }
            if("RadioButton1".equals(c.getName())) {
                onGUI1_RadioButton1Action(c, event);
                return;
            }
            if("searchfield".equals(c.getName())) {
                onGUI1_SearchfieldAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onGUI1_ButtonAction(c, event);
                return;
            }
            if("studentlist".equals(c.getName())) {
                onGUI1_StudentlistAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Userprofile")) {
            if("RadioButton".equals(c.getName())) {
                onUserprofile_RadioButtonAction(c, event);
                return;
            }
            if("RadioButton1".equals(c.getName())) {
                onUserprofile_RadioButton1Action(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onUserprofile_TextAreaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onUserprofile_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onUserprofile_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onUserprofile_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Groupmessage")) {
            if("Button".equals(c.getName())) {
                onGroupmessage_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onGroupmessage_Button1Action(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onGroupmessage_TextAreaAction(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onGroupmessage_ListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Home")) {
            if("Button11".equals(c.getName())) {
                onHome_Button11Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onHome_Button2Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onHome_Button3Action(c, event);
                return;
            }
            if("Button10".equals(c.getName())) {
                onHome_Button10Action(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onHome_Button1Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onHome_Button4Action(c, event);
                return;
            }
            if("Button6".equals(c.getName())) {
                onHome_Button6Action(c, event);
                return;
            }
            if("Button7".equals(c.getName())) {
                onHome_Button7Action(c, event);
                return;
            }
            if("Button8".equals(c.getName())) {
                onHome_Button8Action(c, event);
                return;
            }
            if("Button9".equals(c.getName())) {
                onHome_Button9Action(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onHome_Button5Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Subjects")) {
            if("List2".equals(c.getName())) {
                onSubjects_List2Action(c, event);
                return;
            }
            if("Button6".equals(c.getName())) {
                onSubjects_Button6Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Htmlpasrecover")) {
            if("Button1".equals(c.getName())) {
                onHtmlpasrecover_Button1Action(c, event);
                return;
            }
            if("TextField".equals(c.getName())) {
                onHtmlpasrecover_TextFieldAction(c, event);
                return;
            }
            if("sendrequest".equals(c.getName())) {
                onHtmlpasrecover_SendrequestAction(c, event);
                return;
            }
            if("status1".equals(c.getName())) {
                onHtmlpasrecover_Status1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Response")) {
            if("Button".equals(c.getName())) {
                onResponse_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onResponse_Button1Action(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onResponse_TextAreaAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("MyProfile")) {
            if("name".equals(c.getName())) {
                onMyProfile_NameAction(c, event);
                return;
            }
            if("index".equals(c.getName())) {
                onMyProfile_IndexAction(c, event);
                return;
            }
            if("tel".equals(c.getName())) {
                onMyProfile_TelAction(c, event);
                return;
            }
            if("addr".equals(c.getName())) {
                onMyProfile_AddrAction(c, event);
                return;
            }
            if("email".equals(c.getName())) {
                onMyProfile_EmailAction(c, event);
                return;
            }
            if("group".equals(c.getName())) {
                onMyProfile_GroupAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onMyProfile_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onMyProfile_Button2Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onMyProfile_Button4Action(c, event);
                return;
            }
            if("SaveAll".equals(c.getName())) {
                onMyProfile_SaveAllAction(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onMyProfile_Button5Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("MessageInfo")) {
            if("Button".equals(c.getName())) {
                onMessageInfo_ButtonAction(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onMessageInfo_TextAreaAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("LoginGUI")) {
            if("Username".equals(c.getName())) {
                onLoginGUI_UsernameAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onLoginGUI_PasswordAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onLoginGUI_ButtonAction(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onLoginGUI_Button5Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Messages")) {
            if("RadioButton1".equals(c.getName())) {
                onMessages_RadioButton1Action(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onMessages_ListAction(c, event);
                return;
            }
            if("RadioButton".equals(c.getName())) {
                onMessages_RadioButtonAction(c, event);
                return;
            }
            if("List1".equals(c.getName())) {
                onMessages_List1Action(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onMessages_TextAreaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMessages_ButtonAction(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onMessages_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("TTable")) {
            if("Button".equals(c.getName())) {
                onTTable_ButtonAction(c, event);
                return;
            }
            if("List12".equals(c.getName())) {
                onTTable_List12Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Presence")) {
            if("List".equals(c.getName())) {
                onPresence_ListAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onPresence_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Welcome")) {
            if("TextArea1".equals(c.getName())) {
                onWelcome_TextArea1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("FirstForm")) {
            if("Button".equals(c.getName())) {
                onFirstForm_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onFirstForm_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onFirstForm_Button2Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onFirstForm_Button3Action(c, event);
                return;
            }
            if("Button21".equals(c.getName())) {
                onFirstForm_Button21Action(c, event);
                return;
            }
            if("Button11".equals(c.getName())) {
                onFirstForm_Button11Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onFirstForm_Button4Action(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onFirstForm_Button5Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Departments")) {
            if("aboutDepartmentt".equals(c.getName())) {
                onDepartments_AboutDepartmenttAction(c, event);
                return;
            }
            if("titleeee".equals(c.getName())) {
                onDepartments_TitleeeeAction(c, event);
                return;
            }
            if("bodyArea".equals(c.getName())) {
                onDepartments_BodyAreaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onDepartments_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onDepartments_Button1Action(c, event);
                return;
            }
        }
    }

      protected void onPersonalinfo_ThispassAction(Component c, ActionEvent event) {
      }

      protected void onPersonalinfo_NowpassAction(Component c, ActionEvent event) {
      }

      protected void onPersonalinfo_Path11Action(Component c, ActionEvent event) {
      }

      protected void onPersonalinfo_DoneAction(Component c, ActionEvent event) {
      }

      protected void onTTableINFO_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_Button5Action(Component c, ActionEvent event) {
      }

      protected void onGUI1_RadioButtonAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_RadioButton1Action(Component c, ActionEvent event) {
      }

      protected void onGUI1_SearchfieldAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_StudentlistAction(Component c, ActionEvent event) {
      }

      protected void onUserprofile_RadioButtonAction(Component c, ActionEvent event) {
      }

      protected void onUserprofile_RadioButton1Action(Component c, ActionEvent event) {
      }

      protected void onUserprofile_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onUserprofile_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onUserprofile_Button1Action(Component c, ActionEvent event) {
      }

      protected void onUserprofile_Button2Action(Component c, ActionEvent event) {
      }

      protected void onGroupmessage_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGroupmessage_Button1Action(Component c, ActionEvent event) {
      }

      protected void onGroupmessage_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onGroupmessage_ListAction(Component c, ActionEvent event) {
      }

      protected void onHome_Button11Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button2Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button3Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button10Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button1Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button4Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button6Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button7Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button8Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button9Action(Component c, ActionEvent event) {
      }

      protected void onHome_Button5Action(Component c, ActionEvent event) {
      }

      protected void onSubjects_List2Action(Component c, ActionEvent event) {
      }

      protected void onSubjects_Button6Action(Component c, ActionEvent event) {
      }

      protected void onHtmlpasrecover_Button1Action(Component c, ActionEvent event) {
      }

      protected void onHtmlpasrecover_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onHtmlpasrecover_SendrequestAction(Component c, ActionEvent event) {
      }

      protected void onHtmlpasrecover_Status1Action(Component c, ActionEvent event) {
      }

      protected void onResponse_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onResponse_Button1Action(Component c, ActionEvent event) {
      }

      protected void onResponse_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_NameAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_IndexAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_TelAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_AddrAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_EmailAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_GroupAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMyProfile_Button2Action(Component c, ActionEvent event) {
      }

      protected void onMyProfile_Button4Action(Component c, ActionEvent event) {
      }

      protected void onMyProfile_SaveAllAction(Component c, ActionEvent event) {
      }

      protected void onMyProfile_Button5Action(Component c, ActionEvent event) {
      }

      protected void onMessageInfo_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMessageInfo_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onLoginGUI_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onLoginGUI_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLoginGUI_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onLoginGUI_Button5Action(Component c, ActionEvent event) {
      }

      protected void onMessages_RadioButton1Action(Component c, ActionEvent event) {
      }

      protected void onMessages_ListAction(Component c, ActionEvent event) {
      }

      protected void onMessages_RadioButtonAction(Component c, ActionEvent event) {
      }

      protected void onMessages_List1Action(Component c, ActionEvent event) {
      }

      protected void onMessages_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onMessages_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMessages_Button2Action(Component c, ActionEvent event) {
      }

      protected void onTTable_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onTTable_List12Action(Component c, ActionEvent event) {
      }

      protected void onPresence_ListAction(Component c, ActionEvent event) {
      }

      protected void onPresence_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onWelcome_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button1Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button2Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button3Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button21Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button11Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button4Action(Component c, ActionEvent event) {
      }

      protected void onFirstForm_Button5Action(Component c, ActionEvent event) {
      }

      protected void onDepartments_AboutDepartmenttAction(Component c, ActionEvent event) {
      }

      protected void onDepartments_TitleeeeAction(Component c, ActionEvent event) {
      }

      protected void onDepartments_BodyAreaAction(Component c, ActionEvent event) {
      }

      protected void onDepartments_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onDepartments_Button1Action(Component c, ActionEvent event) {
      }

}
