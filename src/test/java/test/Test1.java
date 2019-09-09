package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import config.ConfiguracionBase;
import dataProvider.Dataprovider;
import entities.Sku;
import pages.CarroCompra;
import pages.DetalleProducto;
import pages.HomePage;

public class Test1 extends ConfiguracionBase{
  
  @Test(dataProvider = "producto", dataProviderClass = Dataprovider.class)
  public void prueba(Sku sku) {
    HomePage homePage = new HomePage(driver);
    homePage.buscarSku(sku.getSku());
    DetalleProducto detalleProducto = new DetalleProducto(driver); 
    String precio1 = detalleProducto.obtenerPrecioYContinuar();
    detalleProducto.clickVerBolsaCompra();
    CarroCompra carroCompra = new CarroCompra(driver);
    String precio2 = carroCompra.obtenerPrecioProductoCarroCompra();
    Assert.assertEquals(precio1, precio2, "Los precios no coinciden entre si!");
  }
}
