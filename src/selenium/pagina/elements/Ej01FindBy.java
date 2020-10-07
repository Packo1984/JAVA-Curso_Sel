package selenium.pagina.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Utils;

class Ej01FindBy extends BaseTest1{


	@Test
	public void test() throws Exception{
		//buscar elemento y almacenarlo en objeto WebElement
        WebElement txtEmail = driver.findElement(By.id("email"));
        
        
        //solo buscar elemento
       // driver.findElement(By.id("email"));
        //imprimir elemento, solo se muestra la info como un web element
        System.out.println("WebElement txtEmail = " + txtEmail);
        //se imprime información del elemento (información del DOM HTML del elemento)
        Utils.imprimirInfoWebElement("Input Text Email", txtEmail);
        
	}
	
}
