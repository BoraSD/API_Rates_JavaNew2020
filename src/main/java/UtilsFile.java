//import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilsFile {

    public String getBaseURL(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\PropertiesFile.properties");
        System.out.println(fis);
        prop.load(fis);
        return prop.getProperty(key);

    }
}
