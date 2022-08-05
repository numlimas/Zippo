package co.com.zippo.www.pageObjects;

import org.openqa.selenium.By;

public class HomePage {
    private By txtBusqueda = By.id("woocommerce-product-search-field-0");
    private By btnHome = By.xpath("//a[@href='https://zippo.com.co/']");
    private By btnAccesorios = By.xpath("(//a[@href='https://zippo.com.co/product-category/accesorios/'])[1]");
    private  By btnEncendedores = By.xpath("(//a[@href='https://zippo.com.co/product-category/encendedores/'])[1]");
    private By btnInserto = By.xpath("(//a[@href='https://zippo.com.co/product-category/inserto/'])[1]");


    private By btnProdCombustible = By.xpath("//a[@href='https://zippo.com.co/product/combustible-para-encendedor-zippo-4oz-cod-3141laex/']");

    private By bntProdDispensador = By.xpath("//a[@href='https://zippo.com.co/product/dispensador-guarda-combustible-zippo-cod-121503/']");

    private By btnProdInsertoD = By.xpath("//a[@href='https://zippo.com.co/product/inserto-encendedor-zippo-butano-llama-doble-cod-65827/']");

    private By btnProdInsertoS = By.xpath("//a[@href='https://zippo.com.co/product/inserto-encendedor-zippo-butano-llama-sencilla-cod-65826/']");

    private By btnProdMecha = By.xpath("//a[@href='https://zippo.com.co/product/mecha-para-encendedor-zippo-cod-2425/']");


    public By getTxtBusqueda() {
        return txtBusqueda;
    }
    public By getBtnHome() {
        return btnHome;
    }


    public By getBtnAccesorios() {
        return btnAccesorios;
    }
    public By getBtnEncendedores() {
        return btnEncendedores;
    }

    public By getBtnInserto() {
        return btnInserto;
    }


    public By getBtnProdCombustible() {
        return btnProdCombustible;
    }

    public By getBntProdDispensador() {
        return bntProdDispensador;
    }

    public By getBtnProdInsertoD() {
        return btnProdInsertoD;
    }

    public By getBtnProdInsertoS() {
        return btnProdInsertoS;
    }

    public By getBtnProdMecha() {
        return btnProdMecha;
    }
}
