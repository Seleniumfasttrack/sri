package multipleTestcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class chainAction {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://ceoandhra.nic.in/home.aspx");
		WebElement pdf=d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/a");
		WebElement council=d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/a");
		WebElement grad=d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/ul/li[1]/a");
		Actions act=new Actions(d);
		act.moveToElement(pdf).moveToElement(council).moveToElement(grad).click().build().perform();
		

	}

}
