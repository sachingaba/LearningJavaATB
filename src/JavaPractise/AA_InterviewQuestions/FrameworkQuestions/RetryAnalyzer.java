package JavaPractise.AA_InterviewQuestions.FrameworkQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private static final int max = 3;
  private   int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if(count<max){
            count++;
            return true;
        }
        return false;
    }
}
