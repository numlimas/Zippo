package com.zippo.www.stepsDefinitions;

import com.zippo.www.driver.SeleniumWebDriver;
import com.zippo.www.steps.CategoriasSteps;
import com.zippo.www.utils.LecturaExcel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class CategoriaStepDefinitions {
    CategoriasSteps categoriasSteps = new CategoriasSteps();
    @Dado("^me dirijo al Homepage de Zippo$")
    public void meDirijoAlHomepageDeZippo() {
        LecturaExcel.obtenerDatos();SeleniumWebDriver.navegarA(LecturaExcel.url);
    }


    @Cuando("^elijo una categoria de busqueda y doy click al producto que quiero$")
    public void elijoUnaCategoriaDeBusquedaYDoyClickAlProductoQueQuiero() {
        categoriasSteps.buscarCategoria();
    }

    @Y("^valido datos del producto$")
    public void validoDatosDelProducto() {
        categoriasSteps.validarProducto();
    }

    @Entonces("^obtengo tengo certeza que estoy en el producto seleccionado$")
    public void obtengoTengoCertezaQueEstoyEnElProductoSeleccionado() {
        categoriasSteps.cerrarNavegador();
    }
}
