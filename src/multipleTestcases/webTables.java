package multipleTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTables 
{

	public static void main(String[] args)
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		d.findElementById("txtUsername").sendKeys("Admin");
		d.findElementById("txtPassword").sendKeys("admin");
		d.findElementById("btnLogin").click();
		d.findElementByLinkText("PIM").click();
		d.findElementByLinkText("Employee List").click();
		List<WebElement> rows=d.findElementsByXPath(".//*[@id='resultTable']/tbody/tr");
		System.out.println(rows.size());
		List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
		System.out.println(cols.size());
	}
			
}
		
	


