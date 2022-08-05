package co.com.zippo.www.stepsDefinitions;

import co.com.zippo.www.driver.SeleniumWebDriver;
import co.com.zippo.www.steps.CategoriasSteps;
import co.com.zippo.www.utils.LecturaExcel;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CategoriaStepDefinitions {
    CategoriasSteps categoriasSteps = new CategoriasSteps();
    @Dado("^me dirijo al Homepage de Zippo$")
    public void meDirijoAlHomepageDeZippo() {
        LecturaExcel.obtenerDatos();
        SeleniumWebDriver.navegarA(LecturaExcel.url);
    }


    @Cuando("^elijo una categoria de busqueda y doy click al producto que quiero$")
    public void elijoUnaCategoriaDeBusquedaYDoyClickAlProductoQueQuiero() {
        categoriasSteps.buscarAcort();
    }

    @Entonces("^obtengo tengo certeza que estoy en la pagina del producto seleccionado$")
    public void obtengoTengoCertezaQueEstoyEnLaPaginaDelProductoSeleccionado() {
        categoriasSteps.cerrarNavegador();
    }
}
