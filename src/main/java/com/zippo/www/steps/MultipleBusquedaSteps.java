package com.zippo.www.steps;

import com.zippo.www.pageObjects.HomePage;
import com.zippo.www.utils.LecturaExcel;
import com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;


public class MultipleBusquedaSteps extends MetodosSteps{
    HomePage homePage=new HomePage();
    Scroll scroll = new Scroll();

    @Step
    public void pasos(){
        scroll.scrollPixels();
        scroll.scrollAElemento(homePage.getBtnProdCombustible());
        clickear(homePage.getBtnProdCombustible());
        validacion(homePage.getLblProdCombustible(),LecturaExcel.validaciones.get(0).toString());
        clickear(homePage.getBtnHome());
        scroll.scrollPixels();
        scroll.scrollAElemento(homePage.getBntProdDispensador());
        clickear(homePage.getBntProdDispensador());
        validacion(homePage.getLblProdDispensador(),LecturaExcel.validaciones.get(1).toString());
        clickear(homePage.getBtnHome());
        scroll.scrollPixels();
        scroll.scrollAElemento(homePage.getBtnProdInsertoD());
        clickear(homePage.getBtnProdInsertoD());
        validacion(homePage.getLblProdInserto(),LecturaExcel.validaciones.get(3).toString());
        clickear(homePage.getBtnHome());
        scroll.scrollPixels();
        scroll.scrollAElemento(homePage.getBtnProdInsertoS());
        clickear(homePage.getBtnProdInsertoS());
        validacion(homePage.getLblProdInserto(),LecturaExcel.validaciones.get(2).toString());
        clickear(homePage.getBtnHome());
        scroll.scrollPixels();
        scroll.scrollAElemento(homePage.getBtnProdMecha());
        clickear(homePage.getBtnProdMecha());
        validacion(homePage.getLblProdMecha(),LecturaExcel.validaciones.get(4).toString());
    }
}
