package pune.com.org.MavenProject666;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandle_Demo {
	 WebDriver driver;
  @Test
  public void f() {
	  WebElement clickbnt=driver.findElement(By.xpath("//a[text()='Click Here']"));
	  clickbnt.click();
	  
	  String Mainwindow=driver.getWindowHandle();
	  
	  Set<String>multiplewindow=driver.getWindowHandles();
	  System.out.println(multiplewindow.size());
	  for (String window : multiplewindow) {
		  System.out.println(window);
		  
		  if (!window.equals(Mainwindow)) {
			 driver.switchTo().window(Mainwindow);
		
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	   driver= new ChromeDriver();
	  driver.get("http://demo.guru99.com/popup.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
