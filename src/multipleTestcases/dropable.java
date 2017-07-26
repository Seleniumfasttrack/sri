package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dropable {

	public static void main(String[] args) 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/droppable/");
		List<WebElement> frames=d.findElementsByTagName("iframe");
		System.out.println(frames.size());
		d.switchTo().frame(0);
		WebElement drop=d.findElementByXPath(".//*[@id='draggable']");
		Actions act=new Actions(d);
		act.clickAndHold(drop).moveToElement(d.findElementByXPath(".//*[@id='droppable']")).build().perform();

	}

}
