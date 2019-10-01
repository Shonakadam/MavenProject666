package pune.com.org.MavenProject666;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertPop {
	 WebDriver driver;
  @Test
  public void f() {
	  WebElement CustomerId=driver.findElement(By.xpath("//input[@name='cusid']"));
	  CustomerId.sendKeys("ABCD123");
	  
	  WebElement submitbnt=driver.findElement(By.xpath("//input[@name='submit']"));
	  submitbnt.click();
	  
	  // Switching to Alert    
	  Alert alt=driver.switchTo().alert();
	  
	  // Capturing alert message.  
	  String Hello=alt.getText();
	  
	  // Displaying alert message	
	  System.out.println(Hello);
	  
	  // Accepting alert	
	  alt.accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
