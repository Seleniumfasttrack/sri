 package multipleTestcases;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindows {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.online.citibank.co.in/");
		String homepage=d.getWindowHandle();
		System.out.println(homepage);
		d.findElementByClassName("txtSign").click();
		Set<String> mw=d.getWindowHandles();
		System.out.println(mw);
		Iterator<String> it=mw.iterator();
		while (it.hasNext()) {
			String cw = it.next();
			if (!homepage.equals(cw)) {
				d.switchTo().window(cw);
				d.findElementById("User_Id").sendKeys("12345678 ");
				
			}
			
		}
	
		

	}

}
