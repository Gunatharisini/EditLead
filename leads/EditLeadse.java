package leads;


import org.testng.annotations.Test;

import wdMethods.ProjectMethod;


public class EditLeadse extends ProjectMethod {
	@Test
	public void ELeadse() throws InterruptedException     {
		// TODO Auto-generated method stub
		login();

		//Click on the link find lead;
		click(locateElement("linktext","Find Leads"));
		Thread.sleep(2000);
		
		//Enter first name
		//type(locateElement("id","(//input[@class=' x-form-text x-form-field '])"),"Guna");
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Guna");
		
		//Click Find leads button
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		Thread.sleep(2000);
		
		//Click on first resulting lead
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		//Verify title of the page
		verifyTitle("View Lead");
		
		
		//Click Edit
		click(locateElement("linktext","Edit"));
		
		
		//To clear the company name
		clear(locateElement("id", "updateLeadForm_companyName"));
		
		//Change the company name
		type(locateElement("id", "updateLeadForm_companyName"), "TCS");
		
				
		//Click Update
		click(locateElement("class","smallSubmit"));
		
		
		//Confirm the changed name appears
		verifyPartialText(locateElement("id","viewLead_companyName_sp"),"TCS");
		
		
		//Close the browser (Do not log out)
		//closeBrowser();
	}

}
