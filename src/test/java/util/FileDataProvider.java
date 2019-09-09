package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider {
  
  public static String asString(final String path) throws IOException {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(path, new String[0])));
    return data;
  }
}
