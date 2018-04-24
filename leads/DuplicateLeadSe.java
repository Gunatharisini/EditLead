package leads;

import org.testng.annotations.Test;
import wdMethods.ProjectMethod;


public class DuplicateLeadSe extends ProjectMethod {
	@Test(groups="sanity", dependsOnGroups="smoke")
	public void DuLeadSe() throws InterruptedException  {
		// TODO Auto-generated method stub
		//To Open the Browser
		//login();

		//Click on the link find lead;
		click(locateElement("linktext","Find Leads"));
		Thread.sleep(2000);
		
		//Click on Email
		click(locateElement("xpath","//span[text()='Email']"));
		
		//Enter Email
		type(locateElement("xpath","//input[@name='emailAddress']"), "a");
		
		//Click find leads button
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		
		//Capture name of First Resulting lead
		String text = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		Thread.sleep(2000);
		//Click First Resulting lead
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		//Click Duplicate Lead
		click(locateElement("linktext","Duplicate Lead"));
		Thread.sleep(2000);
		
		//Verify the title as 'Duplicate Lead'
		verifyTitle("Duplicate Lead");
				
		//Click Create Lead
		click(locateElement("xpath","//input[@name='submitButton']"));
		
		//Confirm the duplicated lead name is same as captured name
		verifyPartialText(locateElement("id","viewLead_firstName_sp"),text);
		
		//Close the browser (Do not log out)
		//closeBrowser();		
		
	}
}