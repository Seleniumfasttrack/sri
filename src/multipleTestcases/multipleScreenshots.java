package multipleTestcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleScreenshots {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		List<WebElement> links=d.findElementsByTagName("a");
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			
			String Linkname=links.get(i).getText();
			links.get(i).click();
			
			TakesScreenshot ts=(TakesScreenshot)d;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Dell\\Desktop\\Newfolder\\"+Linkname+".png");
			FileUtils.copyFile(scr, dest);
			d.navigate().back();
			links=d.findElementsByTagName("a");
			
			
			
		}
		

	}

}
