package selenium.elemento.acciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest1;
import common.Config;


public class Ejercicio2 extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
		
        
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
	
		
		
		js.executeScript("el = document.getElementById('email_create'); el.value = 'paco1984@test.com';");
		//js.executeScript("el = document.getElementById('passwd'); el.value = 'test1234';");
		
		WebElement btnCreate= (WebElement) js.executeScript("return btnCreate = document.getElementsByName('SubmitCreate')[0];");
		btnCreate.click();
		
		
		//WebElement rbtTitle=driver.findElement(By.id("uniform-id_gender1"));
		Thread.sleep(5000);	
		WebElement radio =driver.findElement(By.id("id_gender1"));
		radio.click();
		
		WebElement txtFirtsName=driver.findElement(By.id("customer_firstname"));
		txtFirtsName.sendKeys("Francisco");
		
		

		WebElement dia =driver.findElement(By.id("days"));
		dia.sendKeys("29");
		WebElement mes =driver.findElement(By.id("months"));
		mes.sendKeys("January");
		WebElement anio =driver.findElement(By.id("years"));
		anio.sendKeys("1984");
		
		WebElement seleccion =driver.findElement(By.id("newsletter"));
		seleccion.click();
		Thread.sleep(5000);
        
        
        
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return (JavascriptExecutor) this.driver;
	}


}
