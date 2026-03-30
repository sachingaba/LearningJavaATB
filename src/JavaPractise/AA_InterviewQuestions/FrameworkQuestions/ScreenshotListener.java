package JavaPractise.AA_InterviewQuestions.FrameworkQuestions;



import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String res = result.getName();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hhmm_MMyyyy");

        String formattedTime = LocalDateTime.now().format(formatter);

        String path = System.getProperty("user.dir")+ "src/JavaPractise/AA_InterviewQuestions/FrameworkQuestions/FailedScreesnohts/sc"
                + res + formattedTime + ".png";

      //  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

     //   FileUtils.copyFile(file,new File(path));

    }
}
