 package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectable
{

	public static void main(String[] args) 
	{
		FirefoxDriver d=new FirefoxDriver();
		 d.get("https://jqueryui.com/selectable/");
		 List<WebElement> frames=d.findElementsByTagName("iframe");
		 System.out.println(frames.size());
		 d.switchTo().frame(0);
		 List<WebElement> selectAble=d.findElementsByTagName("li");
		 System.out.println(selectAble.size());
		 for (int i = 0; i < selectAble.size(); i++)
		 {
			 selectAble.get(i).click();
		 }
	
}
	}


