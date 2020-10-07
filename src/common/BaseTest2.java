package common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest2 {
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	public void login() throws Exception {
		// Create Driver
		driver = Config.navegadorEdge();
		wait = new WebDriverWait(driver, 5);
		
		
		// Login
		//driver.get(Config.URL_LOGOUT);
		driver.get(Config.URL_LOGIN);
        WebElement txtEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))); 
        txtEmail.sendKeys(Config.USUARIO);
		assertEquals(Config.USUARIO, txtEmail.getAttribute("value"), "ASSERT => txtEmail");

        WebElement txtContrasena = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("passwd")));  
        txtContrasena.sendKeys(Config.CONTRASENA);
		assertEquals(Config.CONTRASENA, txtContrasena.getAttribute("value"), "ASSERT => txtContrasena");

        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));   
        btnLogin.click();

        //valida que se muestra mi cuenta
        WebElement lblMyAccount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='My account']")));   
        boolean myAccountIsDisplay = lblMyAccount.isDisplayed();
        assertTrue(myAccountIsDisplay, "ASSERT => LOGIN.");

        
	}

	@AfterEach
	public void logout() throws Exception {
        // Logout
        WebElement lnkLogOut = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(), 'Sign out')])[1]"))); 
        lnkLogOut.click();
		
		//valida que se realize el logout
		WebElement lnkLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(), 'Sign in')])[1]")));  
		assertTrue(lnkLogin.isDisplayed(), "ASSERT => LOGOUT.");

		//cerrar session y navegador
		driver.quit();
	}

	protected WebDriver getDriver(){
		return this.driver;
	}

	protected WebDriverWait getWaiter(){
		return this.wait;
	}

}
