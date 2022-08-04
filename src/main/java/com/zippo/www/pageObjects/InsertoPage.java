package com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class InsertoPage {
    private By btnSubCat = By.xpath("//a[@href='https://zippo.com.co/product-category/inserto/insertos-butano/']");
    private By btnProdAmar = By.xpath("//a[@href='https://zippo.com.co/product/inserto-zippo-llama-amarilla/']");
    private By lblProdAmar= By.xpath("//h1[contains(text(),'Amarilla')]");

    public By getBtnSubCat() {
        return btnSubCat;
    }

    public By getBtnProdAmar() {
        return btnProdAmar;
    }

    public By getLblProdAmar() {
        return lblProdAmar;
    }
}
