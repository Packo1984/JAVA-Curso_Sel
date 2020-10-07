package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Config;

public class Ej01_ImplicitWait extends BaseTest1{
	
	@Test
	public void test() throws Exception {

		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Login
		driver.get(Config.URL_LOGIN);
        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys(Config.USUARIO);
        WebElement txtContrasena = driver.findElement(By.name("passwd"));
        txtContrasena.sendKeys(Config.CONTRASENA);
        WebElement btnLogin = driver.findElement(By.id("SubmitLogin"));
        btnLogin.click();
        
        //valida que se muestra mi cuenta
        WebElement lblMyAccount = driver.findElement(By.xpath("//*[text()='My account']"));
        boolean myAccountIsDisplay = lblMyAccount.isDisplayed();
        assertTrue(myAccountIsDisplay, "ASSERT => LOGIN.");

        // Logout
        WebElement lnkLogOut = driver.findElement(By.xpath("(//a[contains(text(), 'Sign out')])[1]"));
        lnkLogOut.click();
		
		//valida que se realize el logout
		WebElement lnkLogin = driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]"));
		assertTrue(lnkLogin.isDisplayed(), "ASSERT => LOGOUT.");
		driver.quit();
	}

}
