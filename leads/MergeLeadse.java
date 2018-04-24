package leads;

import org.testng.annotations.Test;

import wdMethods.ProjectMethod;

public class MergeLeadse extends ProjectMethod {
	@Test
	public void mergeleads() throws InterruptedException  {
		// TODO Auto-generated method stub
		login();

		//Click on the link Merge Leads;
		click(locateElement("linktext","Merge Leads"));
		
		//Click on the image;
		clickwithnosnap(locateElement("xpath","//img[contains(@src,'/images/fieldlookup.gif')]"));
		
		//Move to new window;
		switchToWindow(1);

		//Enter Lead ID;
		type(locateElement("xpath", "//input[@class=' x-form-text x-form-field']"),"1");
		

		//Click on find leads;
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//Click First Resulting lead
		clickwithnosnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		

		//Switch back to primary window
		switchToWindow(0);

		//Click on Icon near To Lead
		clickwithnosnap(locateElement("xpath","(//img[contains(@src,'/images/fieldlookup.gif')])[2]"));
				
		//Move to new window
		switchToWindow(1);

		//Enter Lead ID
		type(locateElement("xpath", "//input[@class=' x-form-text x-form-field']"),"6");
		
		
		//Click Find Leads button
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//Click First Resulting lead
		clickwithnosnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		//Switch back to primary window
		switchToWindow(0);
		
		//Click Merge
		clickwithnosnap(locateElement("linktext","Merge"));
		
		//Accept Alert
		acceptAlert();

		//Click Find Leads
		click(locateElement("linktext","Find Leads"));
		
		//Enter From Lead ID
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input"),"1");
		
		//Click Find Leads
		click(locateElement("xpath","//button[text()='Find Leads']"));
	
		//Verify error msg
		verifyPartialText(locateElement("xpath","//div[text()='No records to display']"),"No records to display");
		
		//close the browser
		closeBrowser();


	}

}
