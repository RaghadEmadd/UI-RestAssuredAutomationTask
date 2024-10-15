package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.browserDriver;

import java.time.Duration;

import static pages.SearchPage.itemAddedToCartSuccessfullyXpath;
import static pages.homePage.samsungInSmartPhonesResultxPath;
import static pages.homePage.searchFieldId;

public class CartPage extends browserDriver {
    public static String itemTobeAddedToCartXpath = "//vf-product-box-featured[3]//div[1]//div[1]//div[2]//img[1]";
    public static String addToCartButtonXpath = "//button[@aria-label='add-to-cart button']";
    public static String cartIconXpath = "//div[@class='showCart']//img[1]";
    public static String goToCheckoutButtonXpath = "//button[@class='checkout-btn']";
    public static String addNewAddressIconXpath = "//img[@src='/assets/icon-center/add.svg']";
    public static String cityDropDownListXpath = "//select[@formcontrolname='city']";
    public static String districtDropDownListXpath = "//select[@class='ng-untouched ng-pristine ng-invalid']";
    public static String streetNameFieldXpath = "//input[@formcontrolname='streetName']";
    public static String buildingNumberFieldXpath = "//input[@formcontrolname='buildingNo']";
    public static String floorNumberXpath = "//input[@formcontrolname='floorNo']";
    public static String apartmentNumberXpath = "//input[@class='ng-untouched ng-pristine ng-invalid']";
    public static String saveAddressButtonXpath = "//button[@type='button']";
    public static String errorMessageXpath = "//div[@class='location-form']//div[1]//p[1]";

    public static void clickOnSearchField() {
        driver.findElement(By.xpath(searchFieldId)).click();
    }

    public static void sendKeysInSearchField() {
        driver.findElement(By.xpath(searchFieldId)).sendKeys("samsung");
    }

    public static void selectSamsungInSmartPhonesTab() {
        driver.findElement(By.xpath(samsungInSmartPhonesResultxPath)).click();
    }

    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,350)", "");
    }

    public static void selectItemToBeAddedToCart() {
        driver.findElement(By.xpath(itemTobeAddedToCartXpath)).click();
    }

    public static void clickOnAddToCartButton() {
        driver.findElement(By.xpath(addToCartButtonXpath)).click();
    }

    public static void assertItemAddedSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemAddedToCartSuccessfullyXpath)));
    }

    public static void clickOnCartIcon() {
        driver.findElement(By.xpath(cartIconXpath)).click();
    }

    public static void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
    }

    public static void clickOnGoToCheckoutButton() {
        driver.findElement(By.xpath(goToCheckoutButtonXpath)).click();

    }

    public static void clickOnAddNewAddressIcon() {
        driver.findElement(By.xpath(addNewAddressIconXpath)).click();
    }

    public static void selectCityFromDropDownList() {
        Select dropdown = new Select(driver.findElement(By.xpath(cityDropDownListXpath)));
        dropdown.selectByIndex(1);
    }

    public static void selectDistrictFromDropDownList() {
        Select dropdown = new Select(driver.findElement(By.xpath(districtDropDownListXpath)));
        dropdown.selectByIndex(1);
    }

    public static void sendKeysInStreetNameField() {
        driver.findElement(By.xpath(streetNameFieldXpath)).click();
        driver.findElement(By.xpath(streetNameFieldXpath)).sendKeys("New Cairo");
    }

    public static void sendKeysInBuildingNumberField() {
        driver.findElement(By.xpath(buildingNumberFieldXpath)).click();
        driver.findElement(By.xpath(buildingNumberFieldXpath)).sendKeys("tttt");
    }

    public static void sendKeysInFloorNumberField() {
        driver.findElement(By.xpath(floorNumberXpath)).click();
        driver.findElement(By.xpath(floorNumberXpath)).sendKeys("ytrf");
    }

    public static void sendKeysInApartmentNumberField() {
        driver.findElement(By.xpath(apartmentNumberXpath)).click();
        driver.findElement(By.xpath(apartmentNumberXpath)).sendKeys("utrd");
    }

    //    public static void clickOnSaveAddressButton(){
//        driver.findElement(By.xpath(saveAddressButtonXpath)).click();
//    }
    public static void assertErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorMessageXpath)));
    }

    public static void assertSaveButtonIsDimmed() {
        WebElement e = driver.findElement(By.xpath(saveAddressButtonXpath));

        boolean actualValue = e.isEnabled();
        if (actualValue)
            System.out.println("Button is enabled");
        else
            System.out.println("Button is disabled");

    }


}
