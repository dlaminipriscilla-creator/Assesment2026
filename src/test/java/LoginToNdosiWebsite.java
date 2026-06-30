import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToNdosiWebsite {
    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() {
        driver.get("https://ndosisimplifiedautomation.vercel.app");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void clickLoginButton() {
        driver.findElement(By.xpath("//span[text()='Login']")).click();
    }

    @Test(priority = 2)
    public void enterUsername() {
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("dlamini@gmail.com");
    }

    @Test(priority = 3)
    public void enterPassword() {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@12345678");
    }

    @Test(priority = 4)
    public void clickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@name='loginSubmit']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void verifyLoginSuccess() {
        driver.findElement(By.xpath("//h2[@style='font-size: 2rem; margin: 0px 0px 6px; color: rgb(30, 58, 138); letter-spacing: -0.02em; font-weight: 800;']")).isDisplayed();
    }

    @Test(priority = 6)
    public void clickLearnButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Learn']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void clickLearningMaterialsButton() {
        driver.findElement(By.xpath("(//span[text()='Learning Materials'])[1]")).click();
    }

    @Test(priority = 8)
    public void clickWebAutomationAdvanceButton() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='tab-label'])[2]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void selectDevice() throws InterruptedException {
        driver.findElement(By.xpath("//select[@name='deviceType']")).sendKeys("phone");
        Thread.sleep(2000);
    }
@Test (priority = 10)
    public void selectDeviceType() throws InterruptedException {
        driver.findElement(By.xpath("//select[@name='brand']")).sendKeys("apple");
        Thread.sleep(2000);
    }

    @Test (priority = 11)
    public void clickStorageType(){
        driver.findElement(By.xpath("//*[@id='storage-128GB']")).click();
    }
    @Test (priority = 12)
    public void selectColour(){
        driver.findElement(By.xpath("//select[@name='color']")).sendKeys("blue");
    }
@Test (priority = 13)
    public void enterQuantity(){
        driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("2");
    }
@Test (priority = 14)
    public void enterAddress() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Test Street");
        Thread.sleep(2000);
    }
@Test (priority = 15)
    public void clickNextButton(){
   driver.findElement(By.id("inventory-next-btn")).click();
    }
@Test (priority = 16)
    public void selectShippingMethod(){
        driver.findElement(By.id("shipping-option-express")).click();
    }
    }


    // @AfterTest
    //public void closeBrowser() {
      //  driver.quit();
    //}
//}

