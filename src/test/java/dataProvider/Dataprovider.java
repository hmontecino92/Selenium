package dataProvider;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import entities.Sku;
import util.FileDataProvider;


public class Dataprovider {

  @DataProvider
  public static Object[][] producto() throws JsonSyntaxException, IOException {
    Gson gson = new Gson();
    Sku sku = gson.fromJson(
        FileDataProvider.asString(String.format("src/test/resources/data/sku.json")), Sku.class);
    return new Object[][] {{sku}};
  }
}
