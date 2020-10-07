package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import com.sun.tools.javac.util.List;

import common.BaseTest2;
import common.Config;
import common.Utils;

class Ej05_ElementosAnidados extends BaseTest2{

	@Test
	void test() throws Exception{		
		//maximizar navegador
		this.getDriver().manage().window().maximize();
		// ir a pagina de producto
		this.getDriver().get(Config.URL_PRODUCTO);

		//elemento padre
		WebElement frmProductoImagenes = getDriver().findElement(By.id("thumbs_list_frame"));
		//elemento hijo dentro del padre
		WebElement img1erImagen = frmProductoImagenes.findElement(By.xpath("//img[starts-with(@id, 'thumb_')]"));
		
		//List<WebElement> imgProductosList = frmProductoImagenes.findElements(By.xpath("//img[starts-with(@id, 'thumb_')]"));
		//System.out.println("CANTIDAD DE IMAGENES DE PRODUCTO: " + imgProductosList.size());
		//Utils.imprimirInfoWebElement("1ER IMAGEN", imgProductosList.get(0));
		

		
		Utils.imprimirInfoWebElement("1ER IMAGEN PRODUCTO", img1erImagen);
		img1erImagen.click();
		Thread.sleep(2000);
		
		//boton close imagen de producto
		WebElement imgCloseImagen = getDriver().findElement(By.cssSelector("a[title='Close']"));
		imgCloseImagen.click();
		Thread.sleep(2000);
	
	}

}
