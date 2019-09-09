package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarroCompra {
  
  public WebDriver driver;
  
  public CarroCompra(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }
  
  @FindBy(xpath = "//*[@class='fb-pod__normal-prices__from']")
  WebElement precioProducto2;
  
  public String obtenerPrecioProductoCarroCompra() {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOf(precioProducto2));
    String precio2 = precioProducto2.getText();
    System.out.println("Precio2: "+precio2);
    return precio2;
  }
}