package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropDown
{

	public static void main(String[] args)
	{
		 
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		d.findElementById("searchDropdownBox").click();
		List<WebElement> dropList=d.findElementsByTagName("option");
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			String dropListname=dropList.get(i).getText();
			System.out.println(dropListname);
		}
		d.close();

	}

}
