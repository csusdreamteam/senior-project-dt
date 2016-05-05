/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("GenericSpinner", com.codename1.ui.spinner.GenericSpinner.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "LoginPage";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("GenericSpinner", com.codename1.ui.spinner.GenericSpinner.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "LoginPage");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
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

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.GenericSpinner findResourcesSpinner(Component root) {
        return (com.codename1.ui.spinner.GenericSpinner)findByName("ResourcesSpinner", root);
    }

    public com.codename1.ui.spinner.GenericSpinner findResourcesSpinner() {
        com.codename1.ui.spinner.GenericSpinner cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("ResourcesSpinner", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.GenericSpinner)findByName("ResourcesSpinner", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton2(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton2", root);
    }

    public com.codename1.components.MultiButton findMultiButton2() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton1(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton1", root);
    }

    public com.codename1.components.MultiButton findMultiButton1() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findHomeTab(Component root) {
        return (com.codename1.ui.Container)findByName("HomeTab", root);
    }

    public com.codename1.ui.Container findHomeTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("HomeTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("HomeTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.InfiniteProgress findInfiniteProgress(Component root) {
        return (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", root);
    }

    public com.codename1.components.InfiniteProgress findInfiniteProgress() {
        com.codename1.components.InfiniteProgress cmp = (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCalendarTab(Component root) {
        return (com.codename1.ui.Container)findByName("CalendarTab", root);
    }

    public com.codename1.ui.Container findCalendarTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("CalendarTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("CalendarTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton", root);
    }

    public com.codename1.components.MultiButton findMultiButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findWelcome(Component root) {
        return (com.codename1.ui.Label)findByName("welcome", root);
    }

    public com.codename1.ui.Label findWelcome() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("welcome", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("welcome", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLaunchResourceButton(Component root) {
        return (com.codename1.ui.Button)findByName("LaunchResourceButton", root);
    }

    public com.codename1.ui.Button findLaunchResourceButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("LaunchResourceButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("LaunchResourceButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTextContainer(Component root) {
        return (com.codename1.ui.Container)findByName("TextContainer", root);
    }

    public com.codename1.ui.Container findTextContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("TextContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("TextContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findButtonContainer(Component root) {
        return (com.codename1.ui.Container)findByName("ButtonContainer", root);
    }

    public com.codename1.ui.Container findButtonContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ButtonContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ButtonContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findImageContainter(Component root) {
        return (com.codename1.ui.Container)findByName("ImageContainter", root);
    }

    public com.codename1.ui.Container findImageContainter() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ImageContainter", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ImageContainter", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsername(Component root) {
        return (com.codename1.ui.TextField)findByName("username", root);
    }

    public com.codename1.ui.TextField findUsername() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("username", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("username", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findResourcesTab(Component root) {
        return (com.codename1.ui.Container)findByName("ResourcesTab", root);
    }

    public com.codename1.ui.Container findResourcesTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ResourcesTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ResourcesTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_LoginPageLogin = 3;
    public static final int COMMAND_MainSettings = 12;
    public static final int COMMAND_MainProfile = 11;
    public static final int COMMAND_MainLogout = 13;
    public static final int COMMAND_SettingsPageBack = 8;
    public static final int COMMAND_ProfilePageBack = 9;

    protected boolean onLoginPageLogin() {
        return false;
    }

    protected boolean onMainSettings() {
        return false;
    }

    protected boolean onMainProfile() {
        return false;
    }

    protected boolean onMainLogout() {
        return false;
    }

    protected boolean onSettingsPageBack() {
        return false;
    }

    protected boolean onProfilePageBack() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_LoginPageLogin:
                if(onLoginPageLogin()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainSettings:
                if(onMainSettings()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainProfile:
                if(onMainProfile()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainLogout:
                if(onMainLogout()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SettingsPageBack:
                if(onSettingsPageBack()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_ProfilePageBack:
                if(onProfilePageBack()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("LoginPage".equals(f.getName())) {
            exitLoginPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(f.getName())) {
            exitSplashPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(f.getName())) {
            exitProfilePage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(f.getName())) {
            exitSettingsPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitLoginPage(Form f) {
    }


    protected void exitSplashPage(Form f) {
    }


    protected void exitProfilePage(Form f) {
    }


    protected void exitSettingsPage(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("LoginPage".equals(f.getName())) {
            beforeLoginPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(f.getName())) {
            beforeSplashPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(f.getName())) {
            beforeProfilePage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(f.getName())) {
            beforeSettingsPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeLoginPage(Form f) {
    }


    protected void beforeSplashPage(Form f) {
    }


    protected void beforeProfilePage(Form f) {
    }


    protected void beforeSettingsPage(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("LoginPage".equals(c.getName())) {
            beforeContainerLoginPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(c.getName())) {
            beforeContainerSplashPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(c.getName())) {
            beforeContainerProfilePage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(c.getName())) {
            beforeContainerSettingsPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerLoginPage(Container c) {
    }


    protected void beforeContainerSplashPage(Container c) {
    }


    protected void beforeContainerProfilePage(Container c) {
    }


    protected void beforeContainerSettingsPage(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("LoginPage".equals(f.getName())) {
            postLoginPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(f.getName())) {
            postSplashPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(f.getName())) {
            postProfilePage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(f.getName())) {
            postSettingsPage(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postLoginPage(Form f) {
    }


    protected void postSplashPage(Form f) {
    }


    protected void postProfilePage(Form f) {
    }


    protected void postSettingsPage(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("LoginPage".equals(c.getName())) {
            postContainerLoginPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(c.getName())) {
            postContainerSplashPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(c.getName())) {
            postContainerProfilePage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(c.getName())) {
            postContainerSettingsPage(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerLoginPage(Container c) {
    }


    protected void postContainerSplashPage(Container c) {
    }


    protected void postContainerProfilePage(Container c) {
    }


    protected void postContainerSettingsPage(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("LoginPage".equals(rootName)) {
            onCreateLoginPage();
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(rootName)) {
            onCreateSplashPage();
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(rootName)) {
            onCreateProfilePage();
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(rootName)) {
            onCreateSettingsPage();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateLoginPage() {
    }


    protected void onCreateSplashPage() {
    }


    protected void onCreateProfilePage() {
    }


    protected void onCreateSettingsPage() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("LoginPage".equals(f.getName())) {
            getStateLoginPage(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SplashPage".equals(f.getName())) {
            getStateSplashPage(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ProfilePage".equals(f.getName())) {
            getStateProfilePage(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SettingsPage".equals(f.getName())) {
            getStateSettingsPage(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateLoginPage(Form f, Hashtable h) {
    }


    protected void getStateSplashPage(Form f, Hashtable h) {
    }


    protected void getStateProfilePage(Form f, Hashtable h) {
    }


    protected void getStateSettingsPage(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("LoginPage".equals(f.getName())) {
            setStateLoginPage(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SplashPage".equals(f.getName())) {
            setStateSplashPage(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProfilePage".equals(f.getName())) {
            setStateProfilePage(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SettingsPage".equals(f.getName())) {
            setStateSettingsPage(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateLoginPage(Form f, Hashtable state) {
    }


    protected void setStateSplashPage(Form f, Hashtable state) {
    }


    protected void setStateProfilePage(Form f, Hashtable state) {
    }


    protected void setStateSettingsPage(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("LoginPage")) {
            if("username".equals(c.getName())) {
                onLoginPage_UsernameAction(c, event);
                return;
            }
            if("password".equals(c.getName())) {
                onLoginPage_PasswordAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onLoginPage_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onLoginPage_Button1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SettingsPage")) {
            if("MultiButton".equals(c.getName())) {
                onSettingsPage_MultiButtonAction(c, event);
                return;
            }
            if("MultiButton1".equals(c.getName())) {
                onSettingsPage_MultiButton1Action(c, event);
                return;
            }
            if("MultiButton2".equals(c.getName())) {
                onSettingsPage_MultiButton2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("LaunchResourceButton".equals(c.getName())) {
                onMain_LaunchResourceButtonAction(c, event);
                return;
            }
        }
    }

      protected void onLoginPage_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onLoginPage_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLoginPage_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onLoginPage_Button1Action(Component c, ActionEvent event) {
      }

      protected void onSettingsPage_MultiButtonAction(Component c, ActionEvent event) {
      }

      protected void onSettingsPage_MultiButton1Action(Component c, ActionEvent event) {
      }

      protected void onSettingsPage_MultiButton2Action(Component c, ActionEvent event) {
      }

      protected void onMain_LaunchResourceButtonAction(Component c, ActionEvent event) {
      }

}
