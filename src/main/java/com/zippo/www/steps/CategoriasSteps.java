package com.zippo.www.steps;

import com.zippo.www.pageObjects.AccesoriosPage;
import com.zippo.www.pageObjects.EncendPage;
import com.zippo.www.pageObjects.HomePage;
import com.zippo.www.pageObjects.InsertoPage;
import com.zippo.www.utils.LecturaExcel;
import com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class CategoriasSteps extends MetodosSteps {
    EncendPage encendPage = new EncendPage();
    HomePage homePage = new HomePage();
    AccesoriosPage accesoriosPage = new AccesoriosPage();
    InsertoPage insertoPage = new InsertoPage();
    Scroll scroll = new Scroll();

    @Step
    public void buscarAcort() {
        By[] btnCategoria = {homePage.getBtnEncendedores(), homePage.getBtnAccesorios(), homePage.getBtnInserto()};
        By[] btnSubCategoria = {encendPage.getBtnEncViento(), accesoriosPage.getBtnSubCat(), insertoPage.getBtnSubCat()};
        By[] btnProducto = {encendPage.getBtnEncCarta(),accesoriosPage.getBtnEstucheCafe(),insertoPage.getBtnProdAmar()};
        By lblProducto = By.xpath("//h1[@class='product_title entry-title']");

        for (int i = 0; i < btnProducto.length; i++) {
            clickear(btnCategoria[i]);
            scroll.scrollAElemento(btnSubCategoria[i]);
            clickear(btnSubCategoria[i]);
            scroll.scrollAElemento(btnProducto[i]);
            clickear(btnProducto[i]);
            validacion(lblProducto, LecturaExcel.valCat.get(i).toString());
            clickear(homePage.getBtnHome());
        }

    }

}
