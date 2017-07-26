package multipleTestcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class hard {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://ebc.thehartford.com/");
		String homepage=d.getWindowHandle();
		System.out.println(homepage);
		d.findElementById("login-id").sendKeys("Testqti1");
		d.findElementById("login-password").sendKeys("winter4$");
		d.findElementById("login-submit").click();
		d.findElementByXPath(".//*[@id='newbusiness-main']/dl/dt[1]/a").click();
		
		Set <String> mw=d.getWindowHandles();
		System.out.println(mw);
		Iterator<String> it=mw.iterator();
		while (it.hasNext()) {
			String cw=it.next().toString();
			if (!homepage.equals(cw)) {
				d.switchTo().window(cw);
				d.manage().window().maximize();
				Thread.sleep(10000);
				List<WebElement> frames=d.findElementsByTagName("frame");
				System.out.println(frames.size());
				//d.switchTo().frame(1);
			WebElement tab=d.findElementByClassName("ui-tabs-panel ui-corner-bottom ui-widget-content");
			System.out.println(tab.getText());
			Thread.sleep(3000);
			tab.findElement(By.id(".//*[@id='namedInsuredQueryLastName']")).sendKeys("rakesh");
				
			}
			
		}
		

	}

}
