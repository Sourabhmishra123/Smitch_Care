package Smitch_test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Smitch_capabilities.Test1;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test1 extends Test1{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(enabled = true)
	public void login() throws InterruptedException {
		driver.findElement(MobileBy.id("com.mysmitch.care:id/txtLogin")).click();
		// We need to click on this login button to get into the application.
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.mysmitch.care:id/ivNext")).click();
		Thread.sleep(2000);
		
		int startX = 430;
        int startY = 1500;
        int endX = 500;
        int endY = 500;
        new TouchAction<>(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions
		.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endX, endY)).release().perform();
		
		driver.findElement(MobileBy.id("com.mysmitch.care:id/btn_start_journey")).click();
		
		int sX = 390;
        int sY = 600;
        int eX = 500;
        int eY = 500;
        new TouchAction<>(driver).press(PointOption.point(sX, sY)).waitAction(WaitOptions
		.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(eX, eY)).release().perform();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='Retake assessment']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Vegetarian']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='North Indian']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Yes']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Regular Junk Food Consumer']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Tried and found what works']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Very familiar, successful tracker']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Milk']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Sedentary']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='3 days']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='15 mins']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Morning']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Familiar but inconsistent']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Dumbbells']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Needs work, struggling with sleep habits']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Bedtime']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Not Satisfied']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Always']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Mostly on artificial light']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='All the time I constantly seek motivation to stick to my wellness routine']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Everyday']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Diabetes']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Next']")).click();
		
//		driver.findElement(MobileBy.xpath("//*[@text='']")).click();
		
	}
	
}
