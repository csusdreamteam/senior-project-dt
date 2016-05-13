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
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Calendar", com.codename1.ui.Calendar.class);
        UIBuilder.registerCustomComponent("ContainerList", com.codename1.ui.list.ContainerList.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
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
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Calendar", com.codename1.ui.Calendar.class);
        UIBuilder.registerCustomComponent("ContainerList", com.codename1.ui.list.ContainerList.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
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

    public com.codename1.components.MultiButton findFranklinHS(Component root) {
        return (com.codename1.components.MultiButton)findByName("Franklin HS", root);
    }

    public com.codename1.components.MultiButton findFranklinHS() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Franklin HS", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Franklin HS", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
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

    public com.codename1.components.MultiButton findAdamsSharonWomble(Component root) {
        return (com.codename1.components.MultiButton)findByName("Adams          Sharon Womble      ", root);
    }

    public com.codename1.components.MultiButton findAdamsSharonWomble() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Adams          Sharon Womble      ", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Adams          Sharon Womble      ", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findElDorado(Component root) {
        return (com.codename1.components.MultiButton)findByName("El Dorado", root);
    }

    public com.codename1.components.MultiButton findElDorado() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("El Dorado", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("El Dorado", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findCesarChavezHS(Component root) {
        return (com.codename1.components.MultiButton)findByName("Cesar Chavez H.S.", root);
    }

    public com.codename1.components.MultiButton findCesarChavezHS() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Cesar Chavez H.S.", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Cesar Chavez H.S.", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findBush(Component root) {
        return (com.codename1.components.MultiButton)findByName("Bush", root);
    }

    public com.codename1.components.MultiButton findBush() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Bush", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Bush", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findCommodoreStocktonSkills(Component root) {
        return (com.codename1.components.MultiButton)findByName("Commodore Stockton Skills", root);
    }

    public com.codename1.components.MultiButton findCommodoreStocktonSkills() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Commodore Stockton Skills", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Commodore Stockton Skills", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findFillmore(Component root) {
        return (com.codename1.components.MultiButton)findByName("Fillmore ", root);
    }

    public com.codename1.components.MultiButton findFillmore() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Fillmore ", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Fillmore ", aboutToShowThisContainer);
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

    public com.codename1.ui.list.MultiList findMultiList(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("MultiList", root);
    }

    public com.codename1.ui.list.MultiList findMultiList() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("MultiList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("MultiList", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findAugust(Component root) {
        return (com.codename1.components.MultiButton)findByName("August", root);
    }

    public com.codename1.components.MultiButton findAugust() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("August", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("August", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findGrunsky(Component root) {
        return (com.codename1.components.MultiButton)findByName("Grunsky", root);
    }

    public com.codename1.components.MultiButton findGrunsky() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Grunsky", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Grunsky", aboutToShowThisContainer);
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

    public com.codename1.ui.list.ContainerList findContainerList(Component root) {
        return (com.codename1.ui.list.ContainerList)findByName("ContainerList", root);
    }

    public com.codename1.ui.list.ContainerList findContainerList() {
        com.codename1.ui.list.ContainerList cmp = (com.codename1.ui.list.ContainerList)findByName("ContainerList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.ContainerList)findByName("ContainerList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findEdisonHS(Component root) {
        return (com.codename1.components.MultiButton)findByName("Edison HS ", root);
    }

    public com.codename1.components.MultiButton findEdisonHS() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Edison HS ", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Edison HS ", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findHamiltonFongIBProgram(Component root) {
        return (com.codename1.components.MultiButton)findByName("Hamilton/Fong IB Program", root);
    }

    public com.codename1.components.MultiButton findHamiltonFongIBProgram() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Hamilton/Fong IB Program", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Hamilton/Fong IB Program", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findElmwood(Component root) {
        return (com.codename1.components.MultiButton)findByName("Elmwood ", root);
    }

    public com.codename1.components.MultiButton findElmwood() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Elmwood ", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Elmwood ", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Calendar findCalendar(Component root) {
        return (com.codename1.ui.Calendar)findByName("Calendar", root);
    }

    public com.codename1.ui.Calendar findCalendar() {
        com.codename1.ui.Calendar cmp = (com.codename1.ui.Calendar)findByName("Calendar", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Calendar)findByName("Calendar", aboutToShowThisContainer);
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

    public com.codename1.components.MultiButton findClevland(Component root) {
        return (com.codename1.components.MultiButton)findByName("Clevland", root);
    }

    public com.codename1.components.MultiButton findClevland() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("Clevland", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("Clevland", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_LoginPageLogin = 3;
    public static final int COMMAND_AdamsSchool1PageBack = 25;
    public static final int COMMAND_MainSettings = 12;
    public static final int COMMAND_MainProfile = 11;
    public static final int COMMAND_SchoolDirectoryCommand23 = 23;
    public static final int COMMAND_MainLogout = 13;
    public static final int COMMAND_SchoolDirectoryCommand20 = 20;
    public static final int COMMAND_SettingsPageBack = 8;
    public static final int COMMAND_MainGo = 14;
    public static final int COMMAND_SchoolDirectoryBack = 15;
    public static final int COMMAND_AdamsSchool1PageCommand24 = 24;
    public static final int COMMAND_ProfilePageBack = 9;

    protected boolean onLoginPageLogin() {
        return false;
    }

    protected boolean onAdamsSchool1PageBack() {
        return false;
    }

    protected boolean onMainSettings() {
        return false;
    }

    protected boolean onMainProfile() {
        return false;
    }

    protected boolean onSchoolDirectoryCommand23() {
        return false;
    }

    protected boolean onMainLogout() {
        return false;
    }

    protected boolean onSchoolDirectoryCommand20() {
        return false;
    }

    protected boolean onSettingsPageBack() {
        return false;
    }

    protected boolean onMainGo() {
        return false;
    }

    protected boolean onSchoolDirectoryBack() {
        return false;
    }

    protected boolean onAdamsSchool1PageCommand24() {
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

            case COMMAND_AdamsSchool1PageBack:
                if(onAdamsSchool1PageBack()) {
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

            case COMMAND_SchoolDirectoryCommand23:
                if(onSchoolDirectoryCommand23()) {
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

            case COMMAND_SchoolDirectoryCommand20:
                if(onSchoolDirectoryCommand20()) {
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

            case COMMAND_MainGo:
                if(onMainGo()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SchoolDirectoryBack:
                if(onSchoolDirectoryBack()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_AdamsSchool1PageCommand24:
                if(onAdamsSchool1PageCommand24()) {
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

        if("SchoolDirectory".equals(f.getName())) {
            exitSchoolDirectory(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(f.getName())) {
            exitAdamsSchool1Page(f);
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


    protected void exitSchoolDirectory(Form f) {
    }


    protected void exitAdamsSchool1Page(Form f) {
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

        if("SchoolDirectory".equals(f.getName())) {
            beforeSchoolDirectory(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(f.getName())) {
            beforeAdamsSchool1Page(f);
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


    protected void beforeSchoolDirectory(Form f) {
    }


    protected void beforeAdamsSchool1Page(Form f) {
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

        if("SchoolDirectory".equals(c.getName())) {
            beforeContainerSchoolDirectory(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(c.getName())) {
            beforeContainerAdamsSchool1Page(c);
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


    protected void beforeContainerSchoolDirectory(Container c) {
    }


    protected void beforeContainerAdamsSchool1Page(Container c) {
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

        if("SchoolDirectory".equals(f.getName())) {
            postSchoolDirectory(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(f.getName())) {
            postAdamsSchool1Page(f);
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


    protected void postSchoolDirectory(Form f) {
    }


    protected void postAdamsSchool1Page(Form f) {
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

        if("SchoolDirectory".equals(c.getName())) {
            postContainerSchoolDirectory(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(c.getName())) {
            postContainerAdamsSchool1Page(c);
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


    protected void postContainerSchoolDirectory(Container c) {
    }


    protected void postContainerAdamsSchool1Page(Container c) {
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

        if("SchoolDirectory".equals(rootName)) {
            onCreateSchoolDirectory();
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(rootName)) {
            onCreateAdamsSchool1Page();
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


    protected void onCreateSchoolDirectory() {
    }


    protected void onCreateAdamsSchool1Page() {
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

        if("SchoolDirectory".equals(f.getName())) {
            getStateSchoolDirectory(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Adams_School1Page".equals(f.getName())) {
            getStateAdamsSchool1Page(f, h);
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


    protected void getStateSchoolDirectory(Form f, Hashtable h) {
    }


    protected void getStateAdamsSchool1Page(Form f, Hashtable h) {
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

        if("SchoolDirectory".equals(f.getName())) {
            setStateSchoolDirectory(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Adams_School1Page".equals(f.getName())) {
            setStateAdamsSchool1Page(f, state);
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


    protected void setStateSchoolDirectory(Form f, Hashtable state) {
    }


    protected void setStateAdamsSchool1Page(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("MultiList".equals(listName)) {
            return initListModelMultiList(cmp);
        }
        if("Calendar".equals(listName)) {
            return initListModelCalendar(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelMultiList(List cmp) {
        return false;
    }

    protected boolean initListModelCalendar(List cmp) {
        return false;
    }

    protected boolean setListModel(com.codename1.ui.list.ContainerList cmp) {
        String listName = cmp.getName();
        if("ContainerList".equals(listName)) {
            return initListModelContainerList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelContainerList(com.codename1.ui.list.ContainerList cmp) {
        return false;
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
        if(rootContainerName.equals("SchoolDirectory")) {
            if("Button".equals(c.getName())) {
                onSchoolDirectory_ButtonAction(c, event);
                return;
            }
            if("Adams          Sharon Womble      ".equals(c.getName())) {
                onSchoolDirectory_AdamsSharonWombleAction(c, event);
                return;
            }
            if("August".equals(c.getName())) {
                onSchoolDirectory_AugustAction(c, event);
                return;
            }
            if("Cesar Chavez H.S.".equals(c.getName())) {
                onSchoolDirectory_CesarChavezHSAction(c, event);
                return;
            }
            if("Bush".equals(c.getName())) {
                onSchoolDirectory_BushAction(c, event);
                return;
            }
            if("Clevland".equals(c.getName())) {
                onSchoolDirectory_ClevlandAction(c, event);
                return;
            }
            if("Commodore Stockton Skills".equals(c.getName())) {
                onSchoolDirectory_CommodoreStocktonSkillsAction(c, event);
                return;
            }
            if("Edison HS ".equals(c.getName())) {
                onSchoolDirectory_EdisonHSAction(c, event);
                return;
            }
            if("El Dorado".equals(c.getName())) {
                onSchoolDirectory_ElDoradoAction(c, event);
                return;
            }
            if("Elmwood ".equals(c.getName())) {
                onSchoolDirectory_ElmwoodAction(c, event);
                return;
            }
            if("Fillmore ".equals(c.getName())) {
                onSchoolDirectory_FillmoreAction(c, event);
                return;
            }
            if("Franklin HS".equals(c.getName())) {
                onSchoolDirectory_FranklinHSAction(c, event);
                return;
            }
            if("Grunsky".equals(c.getName())) {
                onSchoolDirectory_GrunskyAction(c, event);
                return;
            }
            if("Hamilton/Fong IB Program".equals(c.getName())) {
                onSchoolDirectory_HamiltonFongIBProgramAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Adams_School1Page")) {
            if("Button".equals(c.getName())) {
                onAdamsSchool1Page_ButtonAction(c, event);
                return;
            }
            if("MultiList".equals(c.getName())) {
                onAdamsSchool1Page_MultiListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Calendar".equals(c.getName())) {
                onMain_CalendarAction(c, event);
                return;
            }
            if("ContainerList".equals(c.getName())) {
                onMain_ContainerListAction(c, event);
                return;
            }
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

      protected void onSchoolDirectory_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_AdamsSharonWombleAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_AugustAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_CesarChavezHSAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_BushAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_ClevlandAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_CommodoreStocktonSkillsAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_EdisonHSAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_ElDoradoAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_ElmwoodAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_FillmoreAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_FranklinHSAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_GrunskyAction(Component c, ActionEvent event) {
      }

      protected void onSchoolDirectory_HamiltonFongIBProgramAction(Component c, ActionEvent event) {
      }

      protected void onAdamsSchool1Page_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onAdamsSchool1Page_MultiListAction(Component c, ActionEvent event) {
      }

      protected void onMain_CalendarAction(Component c, ActionEvent event) {
      }

      protected void onMain_ContainerListAction(Component c, ActionEvent event) {
      }

      protected void onMain_LaunchResourceButtonAction(Component c, ActionEvent event) {
      }

}
