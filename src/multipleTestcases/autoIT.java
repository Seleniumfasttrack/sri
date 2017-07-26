package multipleTestcases;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class autoIT
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		d.findElementById("txtUsername").sendKeys("Admin");
		d.findElementById("txtPassword").sendKeys("admin");
		d.findElementById("btnLogin").click();
		d.findElementByLinkText("PIM").click();
		d.findElementByLinkText("Add Employee").click();
		d.findElementById("firstName").sendKeys("Rakkesh");
		d.findElementById("lastName").sendKeys("kumar");
		d.findElementById("photofile").click();
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\rak.exe");
		Thread.sleep(3000);
		d.findElementById("btnSave").click();
		
		if (d.findElementById("empPic").isDisplayed())
		{
			System.out.println("Pass");
			
		}
		else 
		{
		System.out.println("Fail");
			
		}

	}

}
