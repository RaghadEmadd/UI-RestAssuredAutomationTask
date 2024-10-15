package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.browserDriver;

import java.time.Duration;

public class homePage extends browserDriver {
    public static String acceptAllCookiesButtonId = "onetrust-accept-btn-handler";
    public static String loginIconXpath = "//img[@alt='profile icon']";
    public static String mobileNumberFieldId = "username";
    public static String passwordFieldId = "password";
    public static String goToMyAccountButtonId = "submitBtn";
    public static String welcomeIconXpath = "//p[@class='userName']";
    public static String searchFieldId = "searchInput";
    public static String samsungInSmartPhonesResultxPath = "//body/vf-root/main[@class='vf-max-width-container']/section/vf-nav-bar/nav[@class='vf-z-index-12 main-navbar']/div[@class='search-bar']/div[@class='search-container']/vf-search-engine/div[@class='main-search-bar']/div[@class='search-results desktop-search-results']/div[3]/div[1]";
    public static String oppoTagXpath = "//div[normalize-space()='Oppo']";
    public static String oppoSmartPhoneA18Xpath = "//vf-product-box-featured[3]//div[1]//div[1]//div[3]//div[1]//div[1]//p[1]";


    public static void clickOnLoginIcon() throws InterruptedException {
//        driver.findElement(By.id(acceptAllCookiesButtonId)).click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(acceptAllCookiesButtonId)));
            if (acceptCookiesButton.isDisplayed()) {
                acceptCookiesButton.click();
                System.out.println("Accepted cookies.");
            }
        } catch (Exception e) {
            System.out.println("Cookie consent not displayed.");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginIconXpath)));
        driver.findElement(By.xpath(loginIconXpath)).click();

    }

    public static void login() throws InterruptedException {
        driver.findElement(By.id(mobileNumberFieldId)).click();
        driver.findElement(By.id(mobileNumberFieldId)).sendKeys("01020430242");
        driver.findElement(By.id(passwordFieldId)).click();
        driver.findElement(By.id(passwordFieldId)).sendKeys("Passwordvoda_1234");
        driver.findElement(By.id(goToMyAccountButtonId)).click();
//        String welcomeIcon= driver.findElement(By.xpath(welcomeIconXpath)).getText();
//        Thread.sleep(2000);

    }

    public static void searchForOppoPhone() {
        driver.findElement(By.id(searchFieldId)).click();
        driver.findElement(By.id(searchFieldId)).sendKeys("samsung");
        driver.findElement(By.xpath(samsungInSmartPhonesResultxPath)).click();
        driver.findElement(By.xpath(oppoTagXpath)).click();
        driver.findElement(By.xpath(oppoSmartPhoneA18Xpath)).click();
    }
}
