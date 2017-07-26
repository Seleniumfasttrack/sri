package multipleTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBox {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement list=d.findElementByXPath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
		List<WebElement> checkList=list.findElements(By.tagName("input"));
		System.out.println(checkList.size());
		for (int i = 0; i <checkList.size(); i++)
		{
			System.out.println(checkList.get(i).getAttribute("checked")+"..."+checkList.get(i).getAttribute("Value"));
	
		}
		for (int j = 0; j < checkList.size(); j++) {
			

			if (checkList.get(j).getAttribute("Value").equals("Milk")) 
       {
				checkList.get(j).click();
				
			}
			System.out.println(checkList.get(j).getAttribute("checked")+"..."+checkList.get(j).getAttribute("Value"));
				d.close();
		}
	
		}
	
}
