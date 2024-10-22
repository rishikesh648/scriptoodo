package testnew.testnew;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        loginToOdoo(driver);
    }

    public static void loginToOdoo(WebDriver driver) throws InterruptedException, IOException {
        driver.get("https://janj-erp-purchase-v17-stage-15723240.dev.odoo.com/");
        driver.manage().window().maximize();
        
        // Login to Odoo
        WebElement userField = driver.findElement(By.xpath("//*[@id='login']"));
        userField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
        passwordField.sendKeys("@dminjnj");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='wrapwrap']/main/div/div/div/form/div[3]/button"));
        loginButton.click();
        Thread.sleep(1000);

        // Navigate to product section
        WebElement SaleButton = driver.findElement(By.xpath("//*[@id=\"result_app_2\"]/img"));
        SaleButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));              
        WebElement button = driver.findElement(By.xpath("//button[@data-menu-xmlid='sale.product_menu_catalog']"));
        button.click();
        
        WebElement button1 = driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[3]/div/a[1]"));
        button1.click();
        
        WebElement newbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/button"));
        newbtn.click();
        Thread.sleep(2000);
        
        WebElement prdctname = driver.findElement(By.xpath("//*[@id=\"name_0\"]"));
        prdctname.sendKeys("Tshirt test13");
        WebElement fileinput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/span/button"));
        WebElement pencil = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/span/button"));
        pencil.click();
        Runtime.getRuntime().exec("C:\\Users\\rishikesh.rajesh\\Desktop\\FileUpload4.exe");
        WebElement itemcode=driver.findElement(By.xpath("//*[@id=\"default_code_0\"]"));
        itemcode.sendKeys("ppsu991a");
        WebElement category=driver.findElement(By.xpath("//*[@id=\"pos_categ_ids_0\"]"));
        category.click();
        WebElement categorydrp=driver.findElement(By.xpath("//*[@id=\"pos_categ_ids_0_0_3\"]"));
        categorydrp.click();
        WebElement prdcttype=driver.findElement(By.xpath("//*[@id=\"detailed_type_0\"]"));
        prdcttype.sendKeys("Storable Product");
        Thread.sleep(5000);
        WebElement savebtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button[1]"));
        savebtn.click();
        WebElement prdctattribtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[1]/ul/li[2]/a"));
        prdctattribtn.click();
        Thread.sleep(500);
        WebElement addlinebtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[2]/a"));
        addlinebtn.click();
        WebElement addlinebtntxt=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div/div/input"));
        addlinebtntxt.sendKeys("COLOR");
        addlinebtntxt.sendKeys(Keys.ENTER);
        WebElement addlinebtntxt1=driver.findElement(By.xpath(" /html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[3]/div/div/div/div/div/input"));
        addlinebtntxt1.click();
        addlinebtntxt1.sendKeys("red");
        addlinebtntxt1.sendKeys(Keys.ENTER);
        WebElement spec=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[1]/ul/li[3]/a"));
        spec.click();
        WebElement spec1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td/a"));
        spec1.click();
        WebElement spec2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[1]/div/div[1]/div/div/input"));
spec2.sendKeys("size");
spec2.sendKeys(Keys.ENTER);
WebElement inv=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[1]/ul/li[6]/a"));
inv.click();
WebElement inv1=driver.findElement(By.id("checkbox-comp-88"));
inv1.click();
WebElement prdct3=driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/button/span"));
prdct3.click();
System.out.println("Product Created Successfully");
WebElement quo2=driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/div/a[1]"));
quo2.click();
//Locate the button using JavaScript Executor and force-click it
WebElement button3 = driver.findElement(By.xpath("//div[contains(@class, 'o_control_panel_collapsed_create')]//button[@class='btn btn-primary o_list_button_add' and normalize-space(text())='New']\r\n"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", button3);
WebElement cstmername=driver.findElement(By.xpath("//*[@id=\"partner_id_0\"]"));
cstmername.sendKeys("Akeem Henry");
cstmername.sendKeys(Keys.ENTER);
WebElement adline2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/a[1]"));
adline2.click();
WebElement adline3=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div/div/input"));
adline3.sendKeys("TEST");
adline3.sendKeys(Keys.ENTER);
WebElement quantity=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/div/input"));
quantity.clear();
quantity.sendKeys("20");
Thread.sleep(5000);
WebElement save3btn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/button[2]/span"));
save3btn.click();
WebElement beforeprdct=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/div/a/span"));
beforeprdct.click();
WebElement beforeohand=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/button[3]/div/span[1]/div[1]/span"));
String btext = beforeohand.getAttribute("innerText");
btext = btext.replaceAll(",", ""); 
double onHandQuantity1 = Double.parseDouble(btext);
System.out.println("On-hand quantity before delivery: " +onHandQuantity1 );
driver.navigate().back();
System.out.println("Quotation Created Successfully");
Thread.sleep(2000);
WebElement inv12=driver.findElement(By.xpath("//*[@id=\"create_invoice\"]/span"));
inv12.click();
WebElement rp=driver.findElement(By.xpath("//*[@id=\"create_invoice_open\"]/span"));
rp.click();
WebElement cnfm2 = driver.findElement(By.xpath("//div[contains(@class, 'o_statusbar_buttons')]//button[@name='action_post']"));
JavascriptExecutor js2 = (JavascriptExecutor) driver;

// Ensure visibility and force the click
js2.executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible';", cnfm2);

// Perform the click using Actions class
Actions actions = new Actions(driver);
actions.moveToElement(cnfm2).click().perform();
WebElement regp = driver.findElement(By.xpath("//*[@id=\"account_invoice_payment_btn\"]/span"));
regp.click();
WebElement regp1 = driver.findElement(By.xpath("//*[@id=\"dialog_1\"]/div/div/div/footer/footer/button[1]/span"));
regp1.click();
try {

    WebElement closeButton = driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/button"));
    closeButton.click();
    System.out.println("Popup closed.");
} catch (Exception e) {
    System.out.println("Popup did not appear.");}
    
WebElement invvalue=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/h1/div/span"));
String finalvalue=invvalue.getText();
System.out.println("the invoice num ="+finalvalue);
WebElement prdcttest=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/div/a/span"));
prdcttest.click();
driver.navigate().back();
WebElement dlvrybtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/button"));
dlvrybtn.click();
//After clicking on the quantity cell
WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement quantityCell = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@name='quantity']")));
js.executeScript("arguments[0].click();", quantityCell);
quantityCell.sendKeys("20");
WebElement validateButton = driver.findElement(By.xpath("//button[@name='button_validate' and @type='object']"));
//Step 2: Click the button
validateButton.click();
Thread.sleep(2000);
driver.navigate().back();
WebElement prdctcheck = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[2]"));
prdctcheck.click();
System.out.println("Product Delivered to customers Successfully");
WebElement ohandadlvry= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/button[3]/div/span[1]/div[1]/span"));
String onHandQuantityText = ohandadlvry.getAttribute("innerText");
onHandQuantityText = onHandQuantityText.replaceAll(",", ""); 
double onHandQuantity = Double.parseDouble(onHandQuantityText);

// Print the on-hand quantity
System.out.println("On-hand quantity after delivery: " + onHandQuantity);
WebElement backbtn= driver.findElement(By.xpath("/html/body/header/nav/a"));
backbtn.click();

    }}


    	
    	
    
    	

    	

    
