package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sortAble
{

	public static void main(String[] args) 
	{
		
		{
			FirefoxDriver d=new FirefoxDriver();
			 d.get("https://jqueryui.com/sortable/");
			 List<WebElement> frames=d.findElementsByTagName("iframe");
			 System.out.println(frames.size());
			 d.switchTo().frame(0);
			 List<WebElement> sort=d.findElementsByTagName("li");
			 System.out.println(sort.size());
			 for (int i = 0; i<sort.size(); i++) {
				 Actions act=new Actions(d);
				 WebElement scr=d.findElementByXPath(".//*[@id='sortable']/li[1]");
				 WebElement dest=d.findElementByXPath(".//*[@id='sortable']/li[6]");
				 
				 act.dragAndDrop(scr, dest).build().perform();
				 
				
			}

		}

	}
}