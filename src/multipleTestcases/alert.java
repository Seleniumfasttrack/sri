package multipleTestcases;

import org.openqa.selenium.firefox.FirefoxDriver;


public class alert 
{

	public static void main(String[] args)
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.tsrtconline.in/oprs-web/");
		d.findElementById("searchBtn").click();
		String alt=d.switchTo().alert().getText();
		d.switchTo().alert().accept();
		System.out.println(alt);
		
		

	}

}
