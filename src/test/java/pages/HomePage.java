package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.ConfiguracionBase;

public class HomePage extends ConfiguracionBase{
  
  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }
  
  @FindBy(id = "searchQuestionSolr")
  WebElement buscarProductoInpt;
  
  public void buscarSku(String sku) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(buscarProductoInpt));
    buscarProductoInpt.sendKeys(sku);
    buscarProductoInpt.submit();
  } 
}