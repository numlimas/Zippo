package co.com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class BasePage {
    private By lblProducto = By.xpath("//h1[@class='product_title entry-title']");

    public By getLblProducto() {
        return lblProducto;
    }
}
