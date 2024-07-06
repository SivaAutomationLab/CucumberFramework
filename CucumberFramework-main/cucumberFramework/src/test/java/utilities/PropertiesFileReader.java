package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {


    private static PropertiesFileReader propertiesFileReader;
    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");
    static String url;


    public PropertiesFileReader() {
        PropertiesFileReader.loadProperties();
    }

    public static void loadProperties() {
        try {
            FileInputStream input = new FileInputStream(projectPath + "/src/test/resources/configs/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getAppurl() {
        if (propertiesFileReader == null) {
            propertiesFileReader = new PropertiesFileReader();
            url = prop.getProperty("organgeHRMurl");
        }
        return url;
    }


}
