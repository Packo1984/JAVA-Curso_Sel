package selenium.elemento.acciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest1;
import common.Config;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejercicio3 extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
		
		//Maximiza Nivel Navegador
		driver.manage().window().maximize();
		
		//Ir a la URL Nivel Navegador
		//driver.get("https://www.google.com.mx/");
		
		/*
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
        
		
		WebElement Contacto=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact-link")));
		Contacto.click();
		Thread.sleep(5000);	
		//WebElement lista1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select")));
		//lista1.sendKeys("Customer service");
		
		WebElement correo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		correo.sendKeys("Pruebas@test.com");
		
		
		WebElement orden=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_order")));
		orden.sendKeys("1234566");
		
		
	

		//regresa Nivel navegador
		driver.navigate().back();

		//Continua NiveL navegador
		driver.navigate().forward();
	
		WebElement correo2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		correo2.sendKeys("Pruebas@test.com");
				
		WebElement orden1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_order")));
		orden1.sendKeys("1234566");
		

		//actualiza Nivel Navegador
		driver.navigate().refresh();


		//Nivel Pagina
		String url;
		url=driver.getCurrentUrl();
		assertEquals("http://automationpractice.com/index.php?controller=contac", url,"Verificando titulo");
		System.out.println("la URL actual es: " + url);
		System.out.println("El titulo de la pagina es: " + driver.getTitle());
	//System.out.println("El Origen de la pagina es: " + driver.getPageSource());
		*/
		
		
		WebElement txt=driver.findElement(By.id("search_query_top"));
		txt.sendKeys("test");
		
		Thread.sleep(3000);
		System.out.println("su atributo id es: " + txt.getAttribute("id"));
		System.out.println("su etiqueta es: " + txt.getTagName());
		System.out.println("su texto es: " + txt.getText());
		System.out.println("es visible: " + txt.isDisplayed());
		System.out.println("esta hbilitado: " + txt.isEnabled());
		WebElement ident=driver.findElement(By.cssSelector(cssSelector))
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return (JavascriptExecutor) this.driver;
	}


}
