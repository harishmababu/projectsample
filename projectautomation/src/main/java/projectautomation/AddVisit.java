package projectautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddVisit {
WebDriver driver;



public AddVisit(WebDriver driver) {
	this.driver=driver;
}
public void setUser(String username) {
	
	WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
	uname.sendKeys(username);
}
public void setPass(String password) {
	

	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys(password);
}
public void login() {
	
	WebElement log=driver.findElement(By.xpath("//button[@class='bg-[#32b1dc] w-2/3 rounded-xl hover:bg-[#11a5d7] active:opacity-70 text-white font-bold py-2 px-4 mt-10 h-14 text-[20px] cursor-pointer']"));
	log.click();
    
}
public void addVisit() {
	WebElement visit=driver.findElement(By.xpath("//button[@class='relative w-full rounded-lg bg-[#3465eb] hover:bg-[#1d4ed8] p-0.5 shadow-lg focus:outline-none']"));
	visit.click();
	Set<String> windowHandles = driver.getWindowHandles();

    // Check the number of open windows
    System.out.println("Number of windows open: " + windowHandles.size());
    System.out.println("before select"); 
}
	public void instiDropDown(String optiontext) throws Exception {
		WebElement insti = driver.findElement(By.xpath("//div[@class='basic-single select-op css-b62m3t-container']//input[@id='react-select-8-input']"));
		insti.click();
		insti.sendKeys(optiontext);
		Thread.sleep(1000);
		insti.sendKeys(Keys.RETURN);
		}
//	public void addInst() throws Exception {
//		Thread.sleep(1000);
//		WebElement addcp = driver.findElement(By.xpath("//button[@class='bg-[#2a6fe7] hover:bg-[#1864e8] active:bg-[#1864e8] px-2 py-2 rounded-md text-white font-semibold w-[70px]']"));
//		addcp.click();
//		}
//	public void cancel() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		WebElement adc=driver.findElement(By.xpath("//button[@class='py-2.5 px-5 ms-3 text-sm font-medium text-gray-200 focus:outline-none bg-[#E8453B] rounded-lg border  hover:bg-[#E8453B]  focus:z-10 focus:ring-4 focus:ring-[#E8453B]   dark:border-red-600 dark:hover:text-white']"));
//	adc.click();
//	}
	public void addEmp(String employee) throws InterruptedException {
		Thread.sleep(1000);
		WebElement emp = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-9-input']"));
	emp.click();
		emp.sendKeys(employee);
		emp.sendKeys(Keys.RETURN);
	}
	
	public void addDate(String date) throws InterruptedException {	
		//System.out.println("done...");
		Thread.sleep(1000); 
		WebElement da=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[4]/div/input"));
		//WebElement da=driver.findElement(By.xpath("//input[@type='datetime-local']//input[@value='2024-12-26T20:05']"));
	da.click();
	
	da.sendKeys(date);		
		da.sendKeys(Keys.RETURN);
		//da.sendKeys(Keys.ENTER);
	}
	public void purpose(String purpose) throws InterruptedException {
		Thread.sleep(1000);
		WebElement dat=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[5]/div/input"));
		//WebElement dat=driver.findElement(By.xpath("//input[@id='purpose']//input[@value='quality check']"));
		dat.click();
		
		dat.sendKeys(purpose);
	}
	public void contact(String person) throws InterruptedException {
		Thread.sleep(1000);
		WebElement cont = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-10-input']"));
	cont.click();
		cont.sendKeys(person);
		cont.sendKeys(Keys.RETURN);	
	}
	public void addNote(String notes) throws InterruptedException {
		Thread.sleep(1000);
		WebElement note=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[7]/div/input"));
		//WebElement note = driver.findElement(By.xpath("//input[@id='additionalNotes']//input[@placeholder='Adding Note']"));
	note.click();
		note.sendKeys(notes);	
	}
	public void submit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement adc=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[11]/button[1]"));
		adc.click();
		
	}
	public void closeAddvisit() throws InterruptedException {
		Thread.sleep(1000);
		WebElement cav=driver.findElement(By.xpath("//button[@class='text-white  hover:ring-4 font-medium rounded-lg text-base inline-flex items-center px-3 py-2.5 text-center mr-2 bg-blue-600 hover:ring-blue-300 ']"));
		cav.click();

	}
//	public void closeVisit() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='bg-[#2563EB] cursor-pointer hover:bg-[#1657e3] active:bg-[#1657e3] text-gray-100 hover:text-white px-2 py-1 sm:px-5 sm:py-2 rounded-lg font-semibold']")).click();
//}
}


