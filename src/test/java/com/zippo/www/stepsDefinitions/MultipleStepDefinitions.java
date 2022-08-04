package com.zippo.www.stepsDefinitions;

import com.zippo.www.driver.SeleniumWebDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class MultipleStepDefinitions {
    @Dado("^Estoy en la Homepage de Zippo$")
    public void estoyEnLaHomepageDeZippo() {

    }


    @Cuando("^quiero un (\\d+) le doy click$")
    public void quieroUnLeDoyClick(int arg1) {

    }

    @Cuando("^valido que me encuentro en la pagina con Mecha Para Encendedor Zippo – Cod (\\d+)$")
    public void validoQueMeEncuentroEnLaPaginaConMechaParaEncendedorZippoCod(int arg1) {

    }

    @Entonces("^me aseguro que el producto esta listado$")
    public void meAseguroQueElProductoEstaListado() {

    }

    @Cuando("^valido que me encuentro en la pagina con Dispensador Guarda Combustible Zippo – Cod (\\d+)$")
    public void validoQueMeEncuentroEnLaPaginaConDispensadorGuardaCombustibleZippoCod(int arg1) {

    }

    @Cuando("^valido que me encuentro en la pagina con Combustible Para Encendedor Zippo (\\d+)oz – Cod (\\d+)laex$")
    public void validoQueMeEncuentroEnLaPaginaConCombustibleParaEncendedorZippoOzCodLaex(int arg1, int arg2) {

    }

    @Cuando("^valido que me encuentro en la pagina con Encendedor Zippo Dorado Espejo – Cod (\\d+)b$")
    public void validoQueMeEncuentroEnLaPaginaConEncendedorZippoDoradoEspejoCodB(int arg1) {

    }

    @Cuando("^valido que me encuentro en la pagina con Inserto Encendedor Zippo Butano Llama Sencilla Cod (\\d+)$")
    public void validoQueMeEncuentroEnLaPaginaConInsertoEncendedorZippoButanoLlamaSencillaCod(int arg1) {

    }
}
