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

public class Ejercicio5 extends BaseTest1{

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
	
		
		

		
		
		//WebElement rbtTitle=driver.findElement(By.id("uniform-id_gender1"));
		Thread.sleep(5000);	
		
        
        
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return (JavascriptExecutor) this.driver;
	}


}
