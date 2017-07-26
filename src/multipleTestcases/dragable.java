package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragable {

	public static void main(String[] args) 
	{
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/draggable/");
		List<WebElement> frames=d.findElementsByTagName("Iframe");
		System.out.println(frames.size());
		d.switchTo().frame(0);
		WebElement drag=d.findElementByXPath(".//*[@id='draggable']");
		Actions act=new Actions(d);
		act.clickAndHold(drag).moveByOffset(70, 50).build().perform();
	}

}
