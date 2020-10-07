package selenium.masdeselenium;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Config;

public class Ej09_HandlingFrames extends BaseTest1{

	/*
	 *	Switch Frames
	 * 		- FRAME A 
	 * 		- FRAME B
	 * 		- FRAME C (Existe dentro del frame B)
	 */
	@Test
    public void switchFrames() throws InterruptedException{
		//maximizar navegador
		driver.manage().window().maximize();
		// ir a pagina de subida de archivo
		driver.get(Config.URL_FRAMES);
		
		//switch frame A by id
        driver.switchTo().frame("id_frame_a");       
        String textFrameA = "ESTO ESTA EN FRAME A";
        WebElement txtFrameA = driver.findElement(By.id("id_input-frame_a"));
        txtFrameA.sendKeys(textFrameA);
        Thread.sleep(3000);

        //regresar a contenido default
        driver.switchTo().defaultContent();

		//switch frame B by name
        driver.switchTo().frame("name_frame_b");
        String textFrameB = "ESTO ESTA EN FRAME B";
        WebElement txtFrameB= driver.findElement(By.id("id_input-frame_b"));
        txtFrameB.sendKeys(textFrameB);
        Thread.sleep(3000);

        //obtener frame C as WebElement
        WebElement FrameC = driver.findElement(By.id("id_frame_c"));
     
        //switch frame C by WebElement
        driver.switchTo().frame(FrameC);
        String textFrameC = "ESTO ESTA EN FRAME C";
        WebElement txtFrameC= driver.findElement(By.id("id_input-frame_c"));
        txtFrameC.sendKeys(textFrameC);
        Thread.sleep(3000);

        //regresar a contenido default
        driver.switchTo().defaultContent();
       
        //interactuar con contenido default
        String textContenidoDefault = "ESTO ES EL CONTENIDO DEFAULT";
        WebElement txtContenidoDefault= driver.findElement(By.id("id_input-default"));
        txtContenidoDefault.sendKeys(textContenidoDefault);
        Thread.sleep(3000);        

	}
	
	
	/*
	 *	Si 2 Frames existen en el mismo nivel del DOM 
	 * 		- FRAME A 
	 * 		- FRAME B
	 * 	Y se hace swich a un Frame.
	 * 	No es posible cambiarse al otro marco, sin antes cambiar al contenido default
	 */
	@Test
    public void NOSwitch_FrameB_Desde_FrameA() throws InterruptedException{
		//maximizar navegador
		driver.manage().window().maximize();
		// ir a pagina de subida de archivo
		driver.get(Config.URL_FRAMES);
		
		//switch frame
        driver.switchTo().frame("id_frame_a");       
        String textFrameA = "ACCESO A FRAME A";
        WebElement txtFrameA = driver.findElement(By.id("id_input-frame_a"));
        txtFrameA.sendKeys(textFrameA);
        Thread.sleep(3000);
        

		//switch frame
        driver.switchTo().frame("id_frame_b");
        Thread.sleep(3000);
              
    }
	

	/*
	 *	No es posible acceder a un elemento contenido en 1 Frame
	 *	sin antes hacer switch a dicho frame
	 *		- si se esta en otro frame no se tendra acceso
	 *		- si se esta en el contenido default no se tendra acceso
	 */
	@Test
    public void NOEncuentraElementoEn_FrameB_EstandoEn_FrameA() throws InterruptedException{
		//maximizar navegador
		driver.manage().window().maximize();
		// ir a pagina de subida de archivo
		driver.get(Config.URL_FRAMES);
		
		//switch frame A
        driver.switchTo().frame("id_frame_a");       
       
		//buscar elemento que existr en frame B
        String textFrameB = "ESTO ESTA EN FRAME B";
        WebElement txtFrameB = driver.findElement(By.id("id_input-frame_b"));
        txtFrameB.sendKeys(textFrameB);
        Thread.sleep(3000);

              
    }
	
	
}
