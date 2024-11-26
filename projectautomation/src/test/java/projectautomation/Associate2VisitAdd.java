package projectautomation;
import org.testng.annotations.Test;

public class Associate2VisitAdd extends TestBase {
	Associate2Visit obj=null;
	@Test
	public void visitTestcase() throws Exception
	{
		

		obj=new Associate2Visit(driver);
		obj.setUsername("test2@ictkerala.org");
		obj.setPasswrd("@test#952");
		obj.login();
		obj.addVisit1();
		obj.institution("COT Thalassery");
		obj.addEmploee("Associate 2");
		obj.addDate("15-11-2024 14:50");
		obj.addPurpose("Test");
		obj.addContact("Anson (HoD)");
		obj.addNote("testing");
		//obj.disc();
		obj.submit();
		obj.closeAddvisit();
		

}
	}
