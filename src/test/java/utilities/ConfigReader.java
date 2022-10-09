package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {//her method dan önce çalışır
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); //fis in okuduğu bilgileri properities e yükledi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getProperty(String key) {
          /*
         test method'undan yolladığımız String key değeirni alıp
         Properties clasından getProperity() methodunu
         kullanarak bu key ait value yu bize getirir
         */

        return properties.getProperty(key);
    }


}
