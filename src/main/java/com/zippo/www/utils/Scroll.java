package com.zippo.www.utils;

import com.zippo.www.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
    public void scrollAElemento(By localizador){
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        jse.executeScript("arguments[0].scrollIntoView()",localizador);
        try{Thread.sleep(1000);}
        catch (InterruptedException e){Thread.currentThread().interrupt();}
    }

    public void scrollPixels(){
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,400)");
        try{Thread.sleep(1000);}
        catch (InterruptedException e){Thread.currentThread().interrupt();}
    }
}
