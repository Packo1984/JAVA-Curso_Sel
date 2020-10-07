package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;
import common.Config;
import common.Utils;


/*
 * Select Week start as Monday on Wordpress Settings Page. Assert correct selection.
*/
public class Ej03_SelectListas extends BaseTest2{
	
	/*
	 * NO RECOMENDADO
	 * LISTAS CON CLICKS
	 */
	
	@Test
	public void listasConClicks() {
		// ir a pagina de producto
		this.getDriver().get(Config.URL_PRODUCTO);
		
		
		//cick a lista
		WebElement lista = this.getDriver().findElement(By.id("group_1"));
		lista.click();
		
		//opcion que se desea seleccionar
		String opcionEsperada = "L";
		String opcionABuscar = String.format("//option[text()='%s']", opcionEsperada, opcionEsperada);
		
		//cick a opcion
		WebElement option = this.getDriver().findElement(By.xpath(opcionABuscar)); 
		option.click();
		
		assertTrue(option.isSelected(), "ASSERT => LISTA CON CLICKS");
	}
	
	/*
	 * MANEJO DE LISTA ACEPTABLE 
	 * LISTA CON SENDKEYS
	 */
	
	@Test
	public void listasConSendKeys() {
		this.getDriver().get(Config.URL_PRODUCTO);
		
		//opcion que se desea seleccionar
		String opcionEsperada = "L";
		
		WebElement lista = this.getDriver().findElement(By.id("group_1"));
		lista.sendKeys(opcionEsperada);
	}
	
	/*
	 * RECOMENDADO
	 * LISTAS CON CLASE SELECT
	 */
	@Test
	public void listasUsandoSelect() throws InterruptedException {
		this.getDriver().get(Config.URL_PRODUCTO);

		//opcion que se desea seleccionar
		String opcionEsperada = "L";
		
		WebElement lista = this.getDriver().findElement(By.id("group_1"));
		Select selectLista = new Select(lista);
		selectLista.selectByVisibleText(opcionEsperada);
		Thread.sleep(3000);
		selectLista.selectByValue("2");
		Thread.sleep(3000);
		selectLista.selectByIndex(0);
		Thread.sleep(3000);
		selectLista.selectByVisibleText(opcionEsperada);
		
		Utils.imprimirInfoWebElement( "OPCION 1", selectLista.getOptions().get(0) );
		Utils.imprimirInfoWebElement( "OPCION 2", selectLista.getOptions().get(1) );
		Utils.imprimirInfoWebElement( "OPCION 3", selectLista.getOptions().get(2) );

		//assert
		String opcionActual = selectLista.getFirstSelectedOption().getText();
		assertEquals(opcionEsperada, opcionActual, "ASSERT => OPCION SELECCIONADA");		
	}

}
