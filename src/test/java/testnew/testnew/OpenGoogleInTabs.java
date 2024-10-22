package testnew.testnew;



 
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import io.github.bonigarcia.wdm.WebDriverManager;

    public class OpenGoogleInTabs {
        public static void main(String[] args) {
            // Step 1: Set up WebDriver
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Step 2: Open Google in the first tab
            String googleUrl = "https://www.google.com";
            driver.get(googleUrl);
            System.out.println("Opened in first tab: " + driver.getTitle());

            // Step 3: Open Google in a new tab
            openNewTab(driver, googleUrl);
            System.out.println("Opened in second tab: " + driver.getTitle());

            // Step 3: Open Google in another new tab
            openNewTab(driver, googleUrl);
            System.out.println("Opened in third tab: " + driver.getTitle());

            // Step 5: Close the browser
            driver.quit();
        }

        // Method to open a new tab
        public static void openNewTab(WebDriver driver, String url) {
            ((JavascriptExecutor) driver).executeScript("window.open('" + url + "', '_blank');");
            
            // Switch to the new tab
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
        }
    

    }



