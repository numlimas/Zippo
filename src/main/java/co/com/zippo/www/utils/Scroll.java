package co.com.zippo.www.utils;

import co.com.zippo.www.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Scroll {
    public void scrollAElemento(By localizador) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        WebElement element = SeleniumWebDriver.driver.findElement(localizador);
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollPixels() {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,400)");
    }

}