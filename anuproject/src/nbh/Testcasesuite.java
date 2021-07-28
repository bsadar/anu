package nbh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcasesuite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\browserexe\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	    JavascriptExecutor js = (JavascriptExecutor) bo;
	    js.executeScript("window.scrollBy(0,1000)"); 
	    //verify Start button and click on it
	    if(bo.findElement(By.xpath("//input[@id='next-button']")).isDisplayed()) {

	    	System.out.println("Start button displayed");
	    	bo.findElement(By.xpath("//input[@id='next-button']")).click();
	  
	    }
	    else {
	    	System.out.println("Start button not displayed");
	    }
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	    
	    //verifying title of the page and country radio button and click on it
	    System.out.println(bo.getTitle());
	    String titlepagecountry="Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA";
	    if (bo.getTitle().equals(titlepagecountry)&&bo.findElement(By.xpath("//label[@id='label-wales']")).isDisplayed()) {
	    	
	    	System.out.println("wales radio button displayed ands selected ");
	    	bo.findElement(By.xpath("//label[@id='label-wales']")).click();
	    	
	    }
	    else {
	    	System.out.println("England radio button not displayed");
	    }
	    //verify next vutton and clicking on it 
	    if(bo.getTitle().endsWith(titlepagecountry)&&bo.findElement(By.xpath("//input[@id='next-button']")).isDisplayed()) {
	    	System.out.println("Next button is displayed and click on it");
	    	bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    	
	    }
	    else {
	    	System.out.println("Next button not displayed");
	    }
	    
	    Thread.sleep(2000);
	    
	    // 
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //verify GP page and yes radio button
	    System.out.println(bo.getTitle());
	    String titlepagegp="Is your GP practice in Scotland or Wales? - Check what help you could get to pay for NHS costs - NHSBSA";
	    if(bo.getTitle().equals(titlepagegp)&&bo.findElement(By.xpath("//label[@id='label-yes']")).isDisplayed()) {
	    	System.out.println("yes radio button is displayed and selected");
	    	bo.findElement(By.xpath("//label[@id='label-yes']")).click();
	    	
	    }
	    else {
	    	System.out.println("yes radio button not displayed");
	    }
	    // checking Next button and click on it 
	    if(bo.findElement(By.xpath("//input[@id='next-button']")).isDisplayed()) {
	    	System.out.println("Next button is displayed and clic on it ");
	    	bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    }
	    else {
	    	System.out.println("Next button not displayed and not working in GP apge");
	    }
	    
	    Thread.sleep(2000);
	    
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //date fields
	    bo.findElement(By.xpath("//input[@id='dob-day']")).sendKeys("10");
	    bo.findElement(By.xpath("//input[@id='dob-month']")).sendKeys("9");
	    bo.findElement(By.xpath("//input[@id='dob-year']")).sendKeys("2000");
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //partener page
	    //selecting yes rbutton
	    bo.findElement(By.xpath("//label[@id='label-yes']")).click();
	    //click on next button
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //partner claim page
	    //selecting yes rbutton
	    bo.findElement(By.xpath("//label[@id='label-yes']")).click();
	    //click on next button
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //parntr get paid page
	    //selecting yes rbutton
	    bo.findElement(By.xpath("//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")).click();
	    //click on next button
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	   
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	    
	    //joint universwal page 
	    //selecting yes rbutton
	    bo.findElement(By.xpath("//label[@id='label-yes']")).click();
	    //click on next button
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,1000)"); 
	    Thread.sleep(2000);
	    
	    //combine take home pay
	    //selecting yes rbutton
	    bo.findElement(By.xpath("//label[@id='label-yes']")).click();
	    //click on next button
	    bo.findElement(By.xpath("//input[@id='next-button']")).click();
	    
	    //verifying test case
	    System.out.println(bo.getTitle());
	    String ExpectedResult="Because you or your partner get qualifying universal credit you get help paying NHS costs - Check what help you could get to pay for NHS costs - NHSBSA";
	    if(bo.getTitle().equals(ExpectedResult)) {
	    	System.out.println("test case pass");
	    	
	    }
	    else {
	    	System.out.println("test case fail");
	    }
	   
	   Thread.sleep(2000);
	   bo.close();
	    
	}

}
