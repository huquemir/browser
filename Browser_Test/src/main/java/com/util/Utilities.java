package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.basepage.BaseClass;
import com.google.common.io.Files;

public class Utilities extends BaseClass{
	
	
	
	public static void takeScreenShot() throws IOException {
		
		File srcFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "//screenshot/screenshot.png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
		
		
	}
	
	public static byte [] getByteScreenShot() throws IOException {
		File src = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}

}
