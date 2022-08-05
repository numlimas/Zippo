package com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class AccesoriosPage {
    private By btnSubCat = By.xpath("(//a[@href='https://zippo.com.co/product-category/accesorios/estuches/'])[3]");
    private By btnEstucheCafe = By.xpath("//a[@href='https://zippo.com.co/product/estuche-zippo-cuero-cafe-correa-cod-lplb/']");

    public By getBtnSubCat() {
        return btnSubCat;
    }
    public By getBtnEstucheCafe() {
        return btnEstucheCafe;
    }
}
