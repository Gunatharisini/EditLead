package leads;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.ProjectMethod;


public class CreateLeadSe extends ProjectMethod {
	@Test
	public void cleads() throws InterruptedException  {
		// TODO Auto-generated method stub
		login();

		//Click on the link Create Leads;
		click(locateElement("linktext","Create Lead"));

		//Enter the company name
		type(locateElement("id", "createLeadForm_companyName"), "CTS");

		//Enter the first name
		type(locateElement("id", "createLeadForm_firstName"), "Gunatharisini");

		//Enter the last name
		type(locateElement("id", "createLeadForm_lastName"), "Natarajan");

		//click on create lead button
		click(locateElement("class","smallSubmit"));

		//To close the current window
		//closeBrowser();
	}

}
