package config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfiguracionBase {
  
  public WebDriver driver;
  //public EnvironmentConfig env;
  
  @BeforeMethod()
  public void beforeMethodSetup() {
    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.falabella.com/falabella-cl/");
  }
  
  //@AfterMethod()
  public void afterMethodSetup() {
  driver.quit();
  }
}
