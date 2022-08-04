package com.zippo.www.steps;

import com.zippo.www.pageObjects.EncendPage;
import com.zippo.www.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class CategoriasSteps extends MetodosSteps{
    EncendPage encendPage = new EncendPage();
    Scroll scroll = new Scroll();

    @Step
    public void buscarCategoria(){
        clickear(encendPage.getBtnCategoria());
        //scroll.scrollAElemento(encendPage.getBtnEncViento());
        scroll.scrollPixels();
        clickear(encendPage.getBtnEncViento());
        scroll.scrollPixels();
        clickear(encendPage.getBtnEncCarta());
    }

    public void validarProducto(){
        scroll.scrollPixels();
        validacion(encendPage.getLblEncCarta(),"Encendedor Zippo Calavera Naipe");
    }



}
