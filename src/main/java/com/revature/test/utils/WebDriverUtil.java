package com.revature.test.utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

	private static WebDriver chromeDriver = null;
	
	private WebDriverUtil() {
		
	}
	
	public static WebDriver getChromeDriver() {
		if (chromeDriver == null) {
			//doesnt work, for some reason i have to put it in \sts-3.9.1-RELEASE\src\main\resources
			//like the actual installation of sts
			File f1 = new File("C:\\Users\\Su\\Desktop\\GitHub_Repos\\project3_testing\\src\\main\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
			return new ChromeDriver();
		}
		else 
			return chromeDriver;
	}
	
}