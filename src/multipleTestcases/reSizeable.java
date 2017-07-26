package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class reSizeable {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/resizable/");
		List<WebElement> frames=d.findElementsByTagName("iframe");
		System.out.println(frames.size());
		d.switchTo().frame(0);
		WebElement size=d.findElementByXPath(".//*[@id='resizable']/div[3]");
		Actions act=new Actions(d);
		act.clickAndHold(size).moveByOffset(80, 90).build().perform();
	}

}
