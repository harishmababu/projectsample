package projectautomation;

	import org.testng.annotations.Test;

	public class VisitAdd extends  TestBase
	{
	
	AddVisit obj=null;
@Test
	public void visitTestcase() throws Exception
	{
		
		
		obj=new AddVisit(driver);
		obj.setUser("manager1@ictkerala.org");
		obj.setPass("@manager#952");
		obj.login();
		obj.addVisit();
		obj.instiDropDown("COT Thalassery");
		//obj.addInst();
		//obj.cancel();
		obj.addEmp("Associate 2");
		obj.addDate("15-11-2024 14:50");
		obj.purpose("Test");
		obj.contact("Anson (HoD)");
		obj.addNote("testing");
		//obj.disc();
		obj.submit();
		obj.closeAddvisit();
		//obj.closeVisit(); 
	}








	}
	
	

