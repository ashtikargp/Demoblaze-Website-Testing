package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Task_Demoblaze_Gargi 
{
	WebDriver driver;
	
  @Test(priority=1)
  public void SignUp() throws InterruptedException 
  {
	  driver.findElement(By.partialLinkText("Sig")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("sign-username")).sendKeys("GPA");
	  Thread.sleep(1500);
	  driver.findElement(By.id("sign-password")).sendKeys("GPA@123");
	  Thread.sleep(1500);
	  driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	  Thread.sleep(1500);
	  
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  
	  driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-secondary")).click();
	  
  }
  
  @Test(priority=2)
  public void Login() throws InterruptedException 
  {
	  driver.findElement(By.partialLinkText("Log")).click();
	  driver.findElement(By.id("loginusername")).sendKeys("GPA");
	  Thread.sleep(1000);
	  driver.findElement(By.id("loginpassword")).sendKeys("GPA@123");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
  }
  
  @Test(priority=3)
  public void AddtoCart() throws InterruptedException 
  {
	  //=============Add First Product==========================
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Samsung galaxy s6")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.linkText("Add to cart")).click();
	  Thread.sleep(1500);
	  
	//===========Accept Alert and go on Home page===============
	  handleAlert();
	  
	//=============Add Second Product==========================
	  driver.findElement(By.partialLinkText("Lapt")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Sony vaio i5")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Add to cart")).click();
	  Thread.sleep(1500);
	  
	  //===========Accept Alert and go on Home page===============
	  handleAlert();
	  
	//=============Add Third Product==========================
	  driver.findElement(By.partialLinkText("Moni")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Apple monitor 24")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Add to cart")).click();
	  Thread.sleep(1500);
	  
	  //===========Accept Alert and go on Home page===============
	  handleAlert();
	  
  }
  
  @Test(priority=4)
  public void PlaceOrder() throws InterruptedException 
  {
	  driver.findElement(By.partialLinkText("Car")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#page-wrapper > div > div.col-lg-1 > button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#name")).sendKeys("GPA");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#country")).sendKeys("India");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#city")).sendKeys("Nagpur");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#card")).sendKeys("CreditCard");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#month")).sendKeys("May");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#year")).sendKeys("2024");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	  Thread.sleep(1000);
	  
  }
  
  @Test(priority=5)
  public void Printmsg() throws InterruptedException 
  {
	  System.out.println(driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2")).getText());
	  System.out.println(driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > p")).getText());
	  driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
  }
  
  private void handleAlert() throws InterruptedException 
  {
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("Home")).click();
	  Thread.sleep(1000);
  }

@BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.demoblaze.com/");
	  Thread.sleep(1500);
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
