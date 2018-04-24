package leads;

import wdMethods.SeMethods;

public class ProjectMethod extends SeMethods{
	
	public void login() 
{
	//To Open the Browser
	startApp("chrome", "http://leaftaps.com/opentaps/control/main");

	//Enter Username;
	type(locateElement("id", "username"), "DemoSalesManager");
	
	//Enter the password;
	type(locateElement("id", "password"), "crmsfa");

	//Click on login;
	click(locateElement("class", "decorativeSubmit"));	

	//Click on the link CRM?SFA;
	click(locateElement("linktext","CRM/SFA"));

	//Click on the link Leads;
	click(locateElement("linktext","Leads"));
}
}
	/*@AfterMethod(groups="all")
public void logoffApp()
{
	closeBrowser();
}
}
*/