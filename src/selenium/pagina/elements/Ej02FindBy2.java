package selenium.pagina.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Utils;

class Ej02FindBy2 extends BaseTest1{

	@Test
	public void buscarId() throws Exception{
        WebElement txtEmail = driver.findElement(By.id("email"));
        Utils.imprimirInfoWebElement("ELEMENT BY ID", txtEmail);
	}

	@Test
	public void buscarName() throws Exception{
        WebElement element = driver.findElement(By.name("email"));
        Utils.imprimirInfoWebElement("ELEMENT BY NAME", element);
	}

	@Test
	public void buscarTag() throws Exception{
        WebElement element = driver.findElement(By.tagName("input"));
        Utils.imprimirInfoWebElement("ELEMENT BY TAG", element);
	}

	@Test
	public void buscarClass() throws Exception{
		//buscar por 1 sola clase, de las multiples que tenga el elemento
        WebElement element = driver.findElement(By.className("is_required"));
        Utils.imprimirInfoWebElement("ELEMENT BY CLASSNAME", element);
	}

	@Test
	public void buscarLinkText() throws Exception{
        WebElement element = driver.findElement(By.linkText("Contact us"));
        Utils.imprimirInfoWebElement("ELEMENT BY LINK TEXT", element);
	}

	@Test
	public void buscarPartialLinkText() throws Exception{
        WebElement element = driver.findElement(By.partialLinkText("Sign"));
        Utils.imprimirInfoWebElement("ELEMENT BY PARTIAL LINK TEXT", element);
	}


	
}
