package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest1;
import common.Config;

public class Ej02_ExplicitWait2_ejercicio extends BaseTest1{
	
	@Test
	public void test() throws Exception {
		
		//INSTANCIA OBJETO WAIT PARA USAR EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 60);

		// Login
		driver.get(Config.URL_LOGIN);
        WebElement txtEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))); 
        txtEmail.sendKeys(Config.USUARIO);
		assertEquals(Config.USUARIO, txtEmail.getAttribute("value"), "ASSERT => txtEmail");

        WebElement txtContrasena = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("passwd")));  
        txtContrasena.sendKeys(Config.CONTRASENA);
		assertEquals(Config.CONTRASENA, txtContrasena.getAttribute("value"), "ASSERT => txtContrasena");

        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));   
        btnLogin.click();
        
        WebElement txtBuscar = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_query_top")));
        txtBuscar.sendKeys("dress");
        
        WebElement btnLupa = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("submit_search")));
        btnLupa.click();
        
        
        
        Thread.sleep(5000);
        //valida que se muestra mi cuenta
       // WebElement lblMyAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='My account']")));   
        //boolean myAccountIsDisplay = lblMyAccount.isDisplayed();
        //assertTrue(myAccountIsDisplay, "ASSERT => LOGIN.");

        
        
        // Logout
        //WebElement lnkLogOut = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(), 'Sign out')])[1]"))); 
        //lnkLogOut.click();
		
		//valida que se realize el logout
		//WebElement lnkLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(), 'Sign in')])[1]")));  
		//assertTrue(lnkLogin.isDisplayed(), "ASSERT => LOGOUT.");
		driver.quit();
	}

}
