package selenium.elemento.acciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Config;

public class Ejercicio1_ extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
       
        
JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
	
		
		
		js.executeScript("el = document.getElementById('email'); el.value = 'test.0@test.com';");
		js.executeScript("el = document.getElementById('passwd'); el.value = 'otro';");
		
		WebElement btnLogin = (WebElement) js.executeScript("return btnLogin = document.getElementsByName('SubmitLogin')[0];");
		btnLogin.click();
		
		
		WebElement txtCuenta = driver.findElement(By.xpath("//li[text()='Authentication failed.']"));
        assertTrue(txtCuenta.isDisplayed(),"ASSERT =>NO LOGIN");
     
        String Cuenta = txtCuenta.getAttribute("value");
              assertEquals(txtCuenta, Cuenta, "ASSERT => No login");
		
      
		Thread.sleep(5000);	
		

     
               
        
        
        
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return (JavascriptExecutor) this.driver;
	}


}
