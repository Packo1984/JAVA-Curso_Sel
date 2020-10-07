package selenium.masdeselenium;


import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.Config;
import common.Utils;

class Ej04_FindElements extends BaseTest2{

	@Test
	void selectAllCategories() throws Exception{
		//maximizar navegador
		this.getDriver().manage().window().maximize();
		// ir a pagina de producto
		this.getDriver().get(Config.URL_PRODUCTO);
		
		//obtiene todas las imagenes del producto
		List<WebElement> imgProductosList = getDriver().findElements(By.xpath("//img[starts-with(@id, 'thumb_')]"));
		
		System.out.println("imgProductosList count:" + imgProductosList.size());
		
		//iteramos cada imagen
		for(WebElement element: imgProductosList) {
			Utils.imprimirInfoWebElement("Imagen de Producto", element);
			element.click();
			Thread.sleep(2000);
			//creamos para cada iteracion 1 webelement, el boton close imagen de producto
			WebElement imgCloseImagen = getDriver().findElement(By.cssSelector("a[title='Close']"));
			imgCloseImagen.click();
			Thread.sleep(2000);
		}
		
		//otra forma de iterar
		for(int i=0; i < imgProductosList.size(); i++) {
			Utils.imprimirInfoWebElement("Imagen de Producto", imgProductosList.get(i));
			imgProductosList.get(i).click();
			Thread.sleep(1000);
			//creamos para cada iteracion 1 webelement, el boton close imagen de producto
			WebElement imgCloseImagen = getDriver().findElement(By.cssSelector("a[title='Close']"));
			imgCloseImagen.click();
			Thread.sleep(2000);
		}
		
	}
	
}
