package multipleTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {

	public static void main(String[] args)
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms10.htm ");
		WebElement radio=d.findElementByXPath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
		List<WebElement> radioList=radio.findElements(By.tagName("input"));
		System.out.println(radioList.size());
		for (int i = 0; i < radioList.size(); i++) {
			System.out.println(radioList.get(i).getAttribute("checked")+"..."+radioList.get(i).getAttribute("value"));

		}
		List<WebElement> radioList1=radio.findElements(By.name("group1"));
		{
			System.out.println(radioList1.size());
		}
			for (int i = 0; i < radioList1.size(); i++)
			{
				System.out.println(radioList1.get(i).getAttribute("checked")+"..."+radioList1.get(i).getAttribute("value"));
			}
			for (int j = 0; j < radioList1.size(); j++) {
				
				if (radioList1.get(j).getAttribute("value").equals("Milk"))
					
				{
					radioList1.get(j).click();
				}
				System.out.println(radioList1.get(j).getAttribute("checked")+"...."+radioList1.get(j).getAttribute("value"));
			}
			
			d.close();
		}
	}
		

