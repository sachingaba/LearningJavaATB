package JavaPractise.AA_InterviewQuestions.FrameworkQuestions;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {


    public static String getKey(String Key){
        Properties p;

        String path = System.getProperty("user.dir")+ "src/JavaPractise/AA_InterviewQuestions/FrameworkQuestions/data.properties";

        try {
            FileInputStream fis= new FileInputStream(path);

            p = new Properties();
            p.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

return p.getProperty(Key);
    }
}
