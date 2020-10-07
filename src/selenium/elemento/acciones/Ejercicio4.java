package selenium.elemento.acciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest1;
import common.Config;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejercicio4 extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 60);
        
		
		WebElement usuario=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		usuario.sendKeys("test.0@test.com");;

		
		WebElement pass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
		pass.sendKeys("test1234");
		
		WebElement txtBuscar=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
		txtBuscar.sendKeys("dress");
		
		WebElement btnBuscar=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit_search")));
		btnBuscar.click();
	
		
		WebElement lista = driver.findElement(By.id("selectProductSort"));
		lista.click();
		WebElement option = driver.findElement(By.xpath("//option[text()='Price: Lowest first']")); 
		option.click();
		Thread.sleep(3000);	
	
		WebElement lista2 = driver.findElement(By.id("selectProductSort"));
		lista2.click();
		WebElement option2 = driver.findElement(By.xpath("//option[text()='Price: Highest first']")); 
		option2.click();
		Thread.sleep(3000);	
		

		
		
		//WebElement rbtTitle=driver.findElement(By.id("uniform-id_gender1"));
		Thread.sleep(5000);	
		
        
        
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return (JavascriptExecutor) this.driver;
	}


}
