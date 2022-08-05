package co.com.zippo.www.steps;

import co.com.zippo.www.driver.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class MetodosSteps {


    public void escribirEnter(By localizador, String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void limpiar(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }

    public void clickear(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).click();
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public String getTextelement(By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }

    public void validacion(String texto,By localizador){
        assertEquals(texto,getTextelement(localizador));
    }

    public void cerrarNavegador(){SeleniumWebDriver.driver.quit();}

}
