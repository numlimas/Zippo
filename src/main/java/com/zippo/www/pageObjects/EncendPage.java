package com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class EncendPage {



    private By btnEncViento = By.xpath("(//a[@href='https://zippo.com.co/product-category/encendedores/a-prueba-de-viento/'])[3]");

    private By btnEncCarta = By.xpath("//a[@href='https://zippo.com.co/product/encendedor-zippo-calavera-naipe/']");

    private By lblEncCarta = By.xpath("//h1[contains(text(),'Encendedor')]");

    private By btnEncUtilidades = By.xpath("(//a[@href='https://zippo.com.co/product-category/encendedores/utilitario/'])[1]");

    private By btmEncVelas = By.xpath("(//a[@href='https://zippo.com.co/product-category/encendedores/velas/'])[1]");


    public By getBtnEncViento() {
        return btnEncViento;
    }

    public By getBtnEncCarta() {
        return btnEncCarta;
    }

    public By getLblEncCarta() {
        return lblEncCarta;
    }
}
