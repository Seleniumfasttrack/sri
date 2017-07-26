package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {

		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		WebElement drop= d.findElementById("searchDropdownBox");
		Select slt=new Select(drop);
		List<WebElement> dropList= slt.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			String dropName=dropList.get(i).getText();
			System.out.println(dropName);
		}
		
		
	}
		
}