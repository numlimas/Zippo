package com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class HomePage {
    private By txtBusqueda = By.id("woocommerce-product-search-field-0");

    private By btnCatEncendedores = By.xpath("//li[@id='menu-item-66']/a[@href='https://zippo.com.co/product-category/encendedores/']");

    private By bntCatAccesorios = By.xpath("//li[@id='menu-item-68']/a[@href='https://zippo.com.co/product-category/accesorios/']");



    public By getTxtBusqueda() {
        return txtBusqueda;
    }
}
