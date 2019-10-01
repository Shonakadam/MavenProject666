package pune.com.org.MavenProject666;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHrm {
	 WebDriver driver;
  @Test
  public void f() {
	 WebElement UserName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	 UserName.sendKeys("Admin");
	 
	 WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	 Password.sendKeys("admin123");
	 
	 WebElement loginclickbnt=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	 loginclickbnt.click();
  
	
	 
	 WebElement Dashboard=driver.findElement(By.xpath("//b[text()='Dashboard']"));
	 Dashboard.click();
	 
	 WebElement Admin=driver.findElement(By.xpath("//b[text()='Admin']"));
	 Admin.click();
	 
	 WebElement UserManegement=driver.findElement(By.xpath("//a[text()='User Management']"));
	 UserManegement.click();
	 
	 WebElement Users=driver.findElement(By.xpath("//a[text()='Users']"));
	 Users.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
