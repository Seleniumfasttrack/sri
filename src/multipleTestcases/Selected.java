package multipleTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selected {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.findElementByLinkText("REGISTER").click();
		WebElement country=d.findElementByName("country");
		List<WebElement> countryList=country.findElements(By.tagName("option"));
		System.out.println(countryList.size());
		for (int i = 0; i<countryList.size(); i++)
		{
					countryList.get(i).click();
					if (countryList.get(i).isSelected())
						{
				
		
						System.out.println(countryList.get(i).getText()+"....."+"Selected");
						}
					else
					{
						System.out.println(countryList.get(i).getText()+"....."+"notSelected");	
					}
		}
	}

}
