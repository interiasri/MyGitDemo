package AutomationTestScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppUtilities.BasicFunctions;

public class LoginwithValidInput extends BasicFunctions {
//	log.Login("Admin", "Qedge123!@#");
	
	@Parameters({"uname", "pwd"})
	@Test
	public void login(String uname, String pwd) {
		BasicFunctions log = new BasicFunctions();
		log.login(uname, pwd);
	}
	

}