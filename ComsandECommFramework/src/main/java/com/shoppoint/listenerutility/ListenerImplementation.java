package com.shoppoint.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.shoppoint.generic.webdriverutility.Utilityclassobject;
import com.shoppoint.genericutility.Baseclass;

public class ListenerImplementation implements ITestListener,ISuiteListener{
	public ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	@Override
	public void onFinish(ISuite suite) {
		
		Reporter.log(" Report Backup ");
		report.flush();
	}

	@Override
	public void onStart(ISuite suite) {
		
		String sysTime= new Date().toString().replace(":","_").replace(" ","_");
		// spark report config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvancedReports/report_"+sysTime+".html");
		spark.config().setDocumentTitle("shoppoint Test Suite Results");
		spark.config().setReportName("Shoppoint Report");
		spark.config().setTheme(Theme.DARK);
		
		//Add environment information and create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Operating System", "Windows-10");
		report.setSystemInfo("Browser", "Chrome 100");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String sysTime= new Date().toString().replace(":","_").replace(" ","_");
		String name = result.getMethod().getMethodName();
		TakesScreenshot t=(TakesScreenshot) Baseclass.sdriver;
		String src = t.getScreenshotAs(OutputType.BASE64);
		
		test.addScreenCaptureFromBase64String(src,name+"_"+sysTime);
		test.log(Status.FAIL, name+"== Failed ===");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		test.log(Status.INFO, name +" test case execution started");
		Utilityclassobject.setTest(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

}
