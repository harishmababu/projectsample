package projectautomation;

import org.testng.annotations.Test;

public class AssociateVIsitAdd extends TestBase
{
	Associate1Visit obj=null;
	@Test
	public void visitTestcase() throws Exception
	{
		
		
		obj=new Associate1Visit(driver);
		obj.setUsername("test1@ictkerala.org");
		obj.setPasswrd("@test#951");
		obj.login();
		obj.addVisit1();
		obj.institution("COT Thalassery");
		obj.addEmploee("Associate 1");
		obj.addDate("15-11-2024 14:50");
		obj.addPurpose("Test");
		obj.addContact("Anson (HoD)");
		obj.addNote("testing");
		obj.submit();
		obj.closeAddvisit();
		
	}



}
