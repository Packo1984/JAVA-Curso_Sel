package selenium.masdeselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.BaseTest2;

public class Ej07_JavaScript  extends BaseTest2{

    @Test
    public void javaScript() throws InterruptedException{
    	
    	//INSTANCIA DEL OBJETO JS
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		// 1- Usar JS para Localizar 1 elemento y realizar 1 acción
		js.executeScript("el = document.getElementById('search_query_top'); el.value = 'MI BUSQUEDA DESDE JS';");
		Thread.sleep(5000);	
		
		// 2- Usar WebDriver para localizar 1 elemento y realizar 1 acción usando JS
		WebElement txtBuscar = getDriver().findElement(By.id("search_query_top"));
		js.executeScript("arguments[0].value = ''; "
						+ "arguments[0].value = 'MI 2DA BUSQUEDA DESDE JS';", txtBuscar);
		Thread.sleep(5000);	

		
		// 3- Usar JS para localizar 1 elemento y realizar 1 acción usando WebDriver
		WebElement btnBuscar = (WebElement) js.executeScript("return btn_buscar = document.getElementsByName('submit_search')[0];");
		btnBuscar.click();
		Thread.sleep(5000);	
		
		// 3- variante de técnica 3
		//retonar 1 valor con JS
		String textoBuscar = (String) js.executeScript("return 'VESTIDOS';");
		this.getDriver().navigate().back();
		//identificar elementos
		WebElement txtBuscar2 = getDriver().findElement(By.id("search_query_top"));
		//usar valor obtenido desde JS
		txtBuscar2.sendKeys(textoBuscar);
		txtBuscar2.submit();
		Thread.sleep(5000);	


    }
}
