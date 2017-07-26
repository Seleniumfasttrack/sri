package multipleTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dateSelection 
{

	public static void main(String[] args)
	{
		String date="25/Nov/2020";
		String[] dtsplit=date.split("/");
		String dt,month,year;
		dt=dtsplit[0];
		month=dtsplit[1];
		year=dtsplit[2];
		
		
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		d.findElementById("txtUsername").sendKeys("Admin");
		d.findElementById("txtPassword").sendKeys("admin");
		d.findElementById("btnLogin").click();
		d.findElementByLinkText("Leave").click();
		d.findElementByLinkText("Leave List").click();
		d.findElementByClassName("ui-datepicker-trigger").click();
		
		Select smon=new Select(d.findElementByClassName("ui-datepicker-month"));
		smon.selectByVisibleText(month);
		
		Select syear=new Select(d.findElementByClassName("ui-datepicker-year"));
		syear.selectByVisibleText(year);
		
		List<WebElement> rows=d.findElementsByXPath(".//*[@id='ui-datepicker-div']/table/tbody/tr");
		for (int i = 0; i < rows.size(); i++) {
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				
				String caldate=cols.get(j).getText();
				
				if (caldate.equals(dt)) {
					cols.get(j).click();
					
				}
				
			}
			
			
			
			
		}
		
		
		
		

	}

}
