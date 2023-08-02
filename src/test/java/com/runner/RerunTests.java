package com.runner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunTests implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxCount =3;
    /**
     * Returns true if the test method has to be retried, false otherwise.
     *
     * @param result The result of the test method that just ran.
     * @return true if the test method has to be retried, false otherwise.
     */
    @Override
    public boolean retry(ITestResult result) {
        if(retryCount < maxCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
