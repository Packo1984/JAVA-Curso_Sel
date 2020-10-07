package selenium.masdeselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;


import common.BaseTest2;

public class Ej10_Alertas extends BaseTest2{

    @Test
    public void alerts() throws InterruptedException{
    	//INSTANCIA DEL OBJETO JS
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
        // aceptar alert
		js.executeScript("alert('TEST ALERT');");
		getWaiter().until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		getDriver().switchTo().alert().accept();

        
        // dimiss alert + getText
		js.executeScript("alert('TEST ALERT');");
		getWaiter().until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		String textAlert =  getDriver().switchTo().alert().getText();
		System.out.println("TEXTO ALERTA = " + textAlert);
        getDriver().switchTo().alert().dismiss();
                
        
    }
}
