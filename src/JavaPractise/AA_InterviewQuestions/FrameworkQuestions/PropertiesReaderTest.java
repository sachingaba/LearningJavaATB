package JavaPractise.AA_InterviewQuestions.FrameworkQuestions;

import org.testng.annotations.Test;

public class PropertiesReaderTest {

    @Test
    public void loginVerification(){

        String username = PropertiesReader.getKey("username");
    }
}
