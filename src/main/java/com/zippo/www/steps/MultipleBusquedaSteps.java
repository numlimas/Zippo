package com.zippo.www.steps;

import com.zippo.www.pageObjects.HomePage;
import com.zippo.www.utils.LecturaExcel;
import com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class MultipleBusquedaSteps extends MetodosSteps{
    HomePage homePage=new HomePage();
    Scroll scroll = new Scroll();

    @Step
    public void pasosAcort(){
        By[] btnProducto = {homePage.getBtnProdCombustible(),homePage.getBntProdDispensador(),homePage.getBtnProdInsertoS(),homePage.getBtnProdInsertoD(),homePage.getBtnProdMecha()};
        By lblProducto = By.xpath("//h1[@class='product_title entry-title']");
        for (int i = 0; i < btnProducto.length; i++) {
            scroll.scrollPixels();
            scroll.scrollAElemento(btnProducto[i]);
            clickear(btnProducto[i]);
            validacion(lblProducto,LecturaExcel.validaciones.get(i).toString());
            clickear(homePage.getBtnHome());
        }

    }
}
