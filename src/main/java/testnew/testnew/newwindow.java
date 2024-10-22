package testnew.testnew;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newwindow {
	 public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
	          
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://janj-erp-purchase-v17-stage-15723240.dev.odoo.com/web/login");
	        ((JavascriptExecutor) driver).executeScript("window.open('https://janj-erp-purchase-v17-stage-15723240.dev.odoo.com/web/login');");
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1)); 
	        System.out.println("Switched to second tab: " + driver.getTitle());
	        Thread.sleep(2000); 
	        driver.switchTo().window(tabs.get(0)); 
	        System.out.println("Switched back to first tab: " + driver.getTitle());
	        Thread.sleep(2000);  

	        // Close the driver
	        driver.quit();
	    }
	
	        
	        
}
