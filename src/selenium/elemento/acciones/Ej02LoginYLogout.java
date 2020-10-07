package selenium.elemento.acciones;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Config;

class Ej02LoginYLogout extends BaseTest1{

	@Test
	public void test() throws InterruptedException  {
		
		// Login
		driver.get(Config.URL_LOGIN);
		Thread.sleep(2000);
        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys(Config.USUARIO);
        WebElement txtContrasena = driver.findElement(By.name("passwd"));
        txtContrasena.sendKeys(Config.CONTRASENA);
        WebElement btnLogin = driver.findElement(By.id("SubmitLogin"));
        btnLogin.click();
        Thread.sleep(2000);
        
        //valida que se muestra mi cuenta
        WebElement lblMyAccount = driver.findElement(By.xpath("//*[text()='My account']"));
        boolean myAccountIsDisplay = lblMyAccount.isDisplayed();
		esperaDinamica(lblMyAccount, 5);
        assertTrue(lblMyAccount.isDisplayed(), "ASSERT => LOGIN.");

        Thread.sleep(2000);
        // Logout
        WebElement lnkLogOut = driver.findElement(By.xpath("(//a[contains(text(), 'Sign out')])[1]"));
        lnkLogOut.click();
		Thread.sleep(1000);
		
		//valida que se realize el logout
		WebElement lnkLogin = driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]"));
		assertTrue(lnkLogin.isDisplayed(), "ASSERT => LOGOUT.");
		driver.quit();
		
		esperaDinamica(lnkLogin, 10);
		
	}
	
	void esperaDinamica(WebElement element, int timeout) throws InterruptedException {
		int intentos = 0;
		int maxIntentos = 10;
	
		while(!element.isDisplayed()) {
			intentos++;
			Thread.sleep(1000);
			if(element.isDisplayed()) {
				break;
			}
			if(intentos > maxIntentos) {
				fail("No esta visible el elemento");
			}
		}
	}
	
	void enterText(WebElement elemento, String texto) {
		
	}
	
	void pausa() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
