/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
	private String username;
	String resFile;
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
        this.resFile = resFile;
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
	@Override
	protected void initVars(Resources res){
	}

    @Override
    protected void postMain(Form f) {
    
    }

    @Override
    protected void beforeMain(Form f) {
    	findWelcome(f).setText("Welcome, "+username+"!");
    	findTabs().setSelectedIndex(1);
    }

    @Override
    protected void exitLoginPage(Form f) {
    	System.out.println("Welcome, "+findUsername(f).getText()+"!");
    	username = findUsername(f).getText();
    }

    @Override
    protected void onLoginPage_UsernameAction(Component c, ActionEvent event) {
    	//Verify username and password and go to main
    	showForm("Main", null);
    
    }
    
    @Override
    protected void onLoginPage_PasswordAction(Component c, ActionEvent event) {
    	//Verify username and password and go to main
    	showForm("Main", null);
    
    }

    @Override
    protected void onMain_LaunchLinkButtonAction(Component c, ActionEvent event) {
    	String val = (String)findResourcesSpinner().getValue();
    	System.out.println(val+" was chosen.");
    	Dialog.show("You have chosen:", val,"OK" , null);
    	
    
    }
}
