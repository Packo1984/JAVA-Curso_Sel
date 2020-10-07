package selenium.framework.refactor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;

public class BaseTest {

	private WebAutomator automator;

	protected WebAutomator getAutomator(){
		return this.automator;
	}
	
	
	@BeforeEach
	public void before() throws Exception {
		// Create Driver
		automator = new WebAutomator(Navegador.EDGE);

		// Login
		UiElement txtEmail = automator.goTo(Config.URL_LOGIN, By.id("email"));
		txtEmail.enterText(Config.USUARIO);
        UiElement txtContrasena = automator.find(By.id("passwd"));
        txtContrasena.enterText(Config.CONTRASENA);
        UiElement btnLogin = automator.find(By.id("SubmitLogin"));
        btnLogin.click();
	}

	@AfterEach
	public void after() throws Exception {
		automator.clearCookies();
		automator.closeAll();
	}


}
