package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/slider/");
		List<WebElement> frames=d.findElementsByTagName("iframe");
		System.out.println(frames.size());
		d.switchTo().frame(0);
		WebElement slide=d.findElementByXPath(".//*[@id='slider']/span");
		Actions act=new Actions(d);
		act.clickAndHold(slide).moveByOffset(70, 0).build().perform();
		

	}

}
