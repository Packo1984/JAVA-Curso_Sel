package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest2;

class EJ13_Keyboard extends BaseTest2{
	
	/*
	 * Enviar secuencia de teclas (keys) Keys.chord
	 */
	@Test
	void test01() throws Exception {
		String busqueda = "mi busqueda";
		WebElement txtBuscar = getDriver().findElement(By.name("search_query"));
		txtBuscar.sendKeys(Keys.chord(Keys.SHIFT, busqueda));
		assertEquals(busqueda.toUpperCase(), txtBuscar.getAttribute("value"), "Assert upper case title");
		Thread.sleep(2000);
	}
	
	/*
	 * Holding and releasing a key while other keystrokes are simulated
	 * Realizamos acciones con teclas (keys) Keys.{KEY} con ACTIONS
	 */
	@Test
	void test02() throws Exception {
		String busqueda = "mi busqueda";
		WebElement txtBuscar = getDriver().findElement(By.name("search_query"));
		
		//LOS 4 PASOS DE ACTIONS CHAINS, SIMPLIFICADOS
		Actions actions = new Actions(getDriver());
		actions.keyDown(Keys.SHIFT)
				.sendKeys(txtBuscar, busqueda)
				.keyUp(Keys.SHIFT)
				.pause(2000)
				.build()
				.perform();
		
		assertEquals(busqueda.toUpperCase(), txtBuscar.getAttribute("value"), "Assert upper case title");

	}
	
}
