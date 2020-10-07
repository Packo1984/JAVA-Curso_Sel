package selenium.masdeselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest2;
import common.Utils;

public class Ej12_ActionChains extends BaseTest2{
	
	@Test
	public void actionChains() throws Exception {
 
        WebElement menu = getDriver().findElement(By.xpath("//a[text()='Women']"));
        WebElement subMenu = getDriver().findElement(By.xpath("(//a[text()='Blouses'])[1]"));
        Utils.imprimirInfoWebElement("MENU", menu);
        Utils.imprimirInfoWebElement("SUBMENU", subMenu);
        
		Thread.sleep(2000);

        //	1- crear objeto Action
        Actions acciones = new Actions(getDriver());

        //	2- concanter acciones
        acciones.moveToElement(menu)
        		.pause(1500)
        		.moveToElement(subMenu)
        		.click(subMenu);
        
 					
		//	3- Build 
		Action buildAccion = acciones.build();
		
		//	4- Perform Action 
		buildAccion.perform();
		

	}

}
