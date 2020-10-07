package common;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest1 {
	
	protected static WebDriver driver = null;
	
	@BeforeAll
	public static void lanzarNavegador() throws Exception {
        driver = Config.navegadorEdge();	
        driver.get(Config.URL_LOGIN);
        Thread.sleep(2000);
	}

	@AfterAll
	public static void cerrarNavegador() {
        driver.quit();		
	}
}
