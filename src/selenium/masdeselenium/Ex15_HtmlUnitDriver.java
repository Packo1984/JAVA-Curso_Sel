package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Config;
import common.Utils;


public class Ex15_HtmlUnitDriver {

	@Test
	public void runHtmlUnitDriver() {
		WebDriver driver = Config.navegadorHtmlUnitDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
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

        //valida que se muestra mi cuenta
        WebElement lblMyAccount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='My account']"))); 
        
        boolean myAccountIsDisplay = lblMyAccount.isDisplayed();
        assertTrue(myAccountIsDisplay, "ASSERT => LOGIN.");
        //Utils.imprimirInfoWebElement("lblMyAccount", lblMyAccount);
		driver.quit();
	}
}