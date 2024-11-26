package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Associate1Visit {
	WebDriver driver;
	public Associate1Visit(WebDriver driver) {
		this.driver=driver;
	}

	public void setUsername(String  username) {
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
		uname.sendKeys(username);
		
	}

	public void setPasswrd(String password) {
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		
	}

	public void login() {
		WebElement log=driver.findElement(By.xpath("//button[@class='bg-[#32b1dc] w-2/3 rounded-xl hover:bg-[#11a5d7] active:opacity-70 text-white font-bold py-2 px-4 mt-10 h-14 text-[20px] cursor-pointer']"));
		log.click();
		
	}
//adding visit
	public void addVisit1() {
		WebElement visit=driver.findElement(By.xpath("//button[@class='relative w-full rounded-lg bg-[#3465eb] hover:bg-[#1d4ed8] p-0.5 shadow-lg focus:outline-none']"));
		visit.click();
		
	}
//selecting institution
	public void institution(String  instoption1) throws InterruptedException {
		WebElement insti = driver.findElement(By.xpath("//div[@class='basic-single select-op css-b62m3t-container']//input[@id='react-select-8-input']"));
		insti.click();
		insti.sendKeys(instoption1);
		Thread.sleep(1000);
		insti.sendKeys(Keys.RETURN);
	}
//adding employee
	public void addEmploee(String employee1) throws InterruptedException {
		Thread.sleep(1000);
		WebElement emp = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-9-input']"));
		emp.click();
		emp.sendKeys(employee1);
		emp.sendKeys(Keys.RETURN);
	}
//adding date for visit
	public void addDate(String date1) throws InterruptedException {
		Thread.sleep(1000); 
		WebElement da=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[4]/div/input"));
		da.click();
		da.sendKeys(date1);		
		da.sendKeys(Keys.RETURN);	
	}
//adding purpose
	public void addPurpose(String purpose1) throws InterruptedException {
		Thread.sleep(1000);
		WebElement dat=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[5]/div/input"));
		dat.click();
		dat.sendKeys(purpose1);
		
	}
//adding contact person
	public void addContact(String person1) throws InterruptedException {
		Thread.sleep(1000);
		WebElement cont = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-10-input']"));
	cont.click();
		cont.sendKeys(person1);
		cont.sendKeys(Keys.RETURN);	
		
	}
//adding additional notes
	public void addNote(String notes1 ) throws InterruptedException {
		WebElement note=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[7]/div/input"));
		note.click();
		note.sendKeys(notes1);	
	}
//submit visit
	public void submit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement adc=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[11]/button[1]"));
		adc.click();
		
	}
//close visit
	public void closeAddvisit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement cav=driver.findElement(By.xpath("//button[@class='text-white  hover:ring-4 font-medium rounded-lg text-base inline-flex items-center px-3 py-2.5 text-center mr-2 bg-blue-600 hover:ring-blue-300 ']"));
		cav.click();
		
	}

}
