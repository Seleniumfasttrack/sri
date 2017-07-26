package multipleTestcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links
{

	public static void main(String[] args)
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		d.findElementById("txtUsername").sendKeys("Admin");
		d.findElementById("txtPassword").sendKeys("admin");
		d.findElementById("btnLogin").click();
		List<WebElement> link=d.findElementsByTagName("a");
		System.out.println(link.size());
		for (int i = 0; i < link.size(); i++) 
		{
			String linkName=link.get(i).getText();
			if (!linkName.isEmpty()) {
				System.out.println(linkName);
			}
			
		}
	}

}
