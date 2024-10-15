package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.browserDriver;

import java.time.Duration;
import java.util.List;

public class SearchPage extends browserDriver {
    public static String colorSwitcherXpath = "//div[@class='color-switcher color-switcher-desktop']";
    public static String outOfStockLabelXpath = "//p[@class='variants-options-invalid']";
    public static String AddToCartButtonXpath = "//button[@aria-label='add-to-cart button']";
    public static String itemAddedToCartSuccessfullyXpath = "//p[normalize-space()='Item added to cart successfully!']";


    public static void checkIfProductOutOfStock() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,350)", "");
        List<WebElement> colorCheckboxes = driver.findElements(By.xpath(colorSwitcherXpath));

        for (WebElement colorCheckbox : colorCheckboxes) {
            // Click on each color
            colorCheckbox.click();

            // Check if the product is out of stock
            WebElement outOfStockLabel;
            try {
                outOfStockLabel = driver.findElement(By.xpath(outOfStockLabelXpath));
                if (outOfStockLabel.isDisplayed()) {
                    System.out.println("This color is out of stock.");
                    continue; // Skip to the next color
                }
            } catch (Exception e) {
                // No out-of-stock label found, proceed to add to cart
            }

            // If in stock, click on the "Add to Cart" button
            WebElement addToCartButton = driver.findElement(By.xpath(AddToCartButtonXpath));
            if (addToCartButton.isEnabled()) {
                addToCartButton.click();

                // Validate that the product has been added successfully
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemAddedToCartSuccessfullyXpath)));
                System.out.println("Product added successfully!");
                break; // Exit the loop once a product is successfully added
            }
        }


    }
}
