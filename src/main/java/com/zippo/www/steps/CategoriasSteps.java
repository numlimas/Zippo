package com.zippo.www.steps;

import com.zippo.www.pageObjects.AccesoriosPage;
import com.zippo.www.pageObjects.EncendPage;
import com.zippo.www.pageObjects.HomePage;
import com.zippo.www.pageObjects.InsertoPage;
import com.zippo.www.utils.LecturaExcel;
import com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;

public class CategoriasSteps extends MetodosSteps{
    EncendPage encendPage = new EncendPage();
    HomePage homePage = new HomePage();
    AccesoriosPage accesoriosPage = new AccesoriosPage();
    InsertoPage insertoPage = new InsertoPage();
    Scroll scroll = new Scroll();

    @Step
    public void buscarCategoria(){
        clickear(homePage.getBtnEncendedores());
        scroll.scrollAElemento(encendPage.getBtnEncViento());
        clickear(encendPage.getBtnEncViento());
        scroll.scrollAElemento(encendPage.getBtnEncCarta());
        clickear(encendPage.getBtnEncCarta());
        validacion(encendPage.getLblEncCarta(),LecturaExcel.valCat.get(0).toString());
        clickear(homePage.getBtnHome());
        clickear(homePage.getBtnAccesorios());
        scroll.scrollAElemento(accesoriosPage.getBtnSubCat());
        clickear(accesoriosPage.getBtnSubCat());
        scroll.scrollAElemento(accesoriosPage.getBtnEstucheCafe());
        clickear(accesoriosPage.getBtnEstucheCafe());
        validacion(accesoriosPage.getLblEstucheCafe(),LecturaExcel.valCat.get(1).toString());
        clickear(homePage.getBtnHome());
        clickear(homePage.getBtnInserto());
        scroll.scrollAElemento(insertoPage.getBtnSubCat());
        clickear(insertoPage.getBtnSubCat());
        scroll.scrollAElemento(insertoPage.getBtnProdAmar());
        clickear(insertoPage.getBtnProdAmar());
        validacion(insertoPage.getLblProdAmar(),LecturaExcel.valCat.get(2).toString());

    }

}
