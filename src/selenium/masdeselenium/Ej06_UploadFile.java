package selenium.masdeselenium;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest1;
import common.Config;

public class Ej06_UploadFile  extends BaseTest1{

	@Test
	public void uploadFile() throws InterruptedException {
		//maximizar navegador
		driver.manage().window().maximize();
		// ir a pagina de subida de archivo
		driver.get(Config.URL_FILE_UPLOAD);

		//obtener archivo a subir
		String pathArchivoSubida = Config.ARCHIVOS_DIR() + "archivo_subida.txt";
		
		//sendkeys al objeto de subida input file
		WebElement txtUploadFile = driver.findElement(By.name("myFile"));	
		txtUploadFile.sendKeys(pathArchivoSubida);	
		Thread.sleep(5000);	

		//click boton subir
		WebElement btnSubirArchivo = driver.findElement(By.id("uploadFile"));
		btnSubirArchivo.click();
		Thread.sleep(5000);
		
	}

}
