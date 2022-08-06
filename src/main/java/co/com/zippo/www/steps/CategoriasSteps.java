package co.com.zippo.www.steps;

import co.com.zippo.www.pageObjects.*;
import co.com.zippo.www.utils.LecturaExcel;
import co.com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class CategoriasSteps extends MetodosSteps {
    EncendPage encendPage = new EncendPage();
    HomePage homePage = new HomePage();
    BasePage basePage = new BasePage();
    AccesoriosPage accesoriosPage = new AccesoriosPage();
    InsertoPage insertoPage = new InsertoPage();
    Scroll scroll = new Scroll();

    @Step
    public void buscarAcort() {
        By[] btnCategoria = {homePage.getBtnEncendedores(), homePage.getBtnAccesorios(), homePage.getBtnInserto()};
        By[] btnSubCategoria = {encendPage.getBtnEncViento(), accesoriosPage.getBtnSubCat(), insertoPage.getBtnSubCat()};
        By[] btnProducto = {encendPage.getBtnEncCarta(), accesoriosPage.getBtnEstucheCafe(), insertoPage.getBtnProdAmar()};

        for (int i = 0; i < btnProducto.length; i++) {
            clickear(btnCategoria[i]);
            scroll.scrollAElemento(btnSubCategoria[i]);
            clickear(btnSubCategoria[i]);
            scroll.scrollAElemento(btnProducto[i]);
            clickear(btnProducto[i]);
            validacion(LecturaExcel.valCat.get(i).toString(), basePage.getLblProducto());
            clickear(homePage.getBtnHome());
        }

    }
}

