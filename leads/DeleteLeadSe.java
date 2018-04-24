package leads;

import org.testng.annotations.Test;

import wdMethods.ProjectMethod;

public class DeleteLeadSe extends ProjectMethod {
	@Test
	public void DLeadSe() throws InterruptedException  {
		// TODO Auto-generated method stub
		login();
		
		//Click Find leads
		click(locateElement("linktext","Find Leads"));
				
		//Click on Phone
		click(locateElement("xpath","//span[text()='Phone']"));
		
		
		//Enter phone number
		type(locateElement("xpath", "//input[@name='phoneNumber']"), "9");
		
		
		//Click find leads button
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		
		
		//Capture lead ID of First Resulting lead
		String text = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		System.out.println(text);
		
		//Click First Resulting lead
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		
		//Click Delete
		click(locateElement("linktext","Delete"));
		
		//Click Find leads
		click(locateElement("linktext","Find Leads"));
		
		//Enter captured lead ID
		type(locateElement("xpath", "//input[@name='id']"),text);
		
		//Click find leads button
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//Verify error msg
		verifyExactText(locateElement("xpath","//div[text()='No records to display']"),"No records to display");
		
		//Close the browser (Do not log out)
		closeBrowser();
		
	}

}