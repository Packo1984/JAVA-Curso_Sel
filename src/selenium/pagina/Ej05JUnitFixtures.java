package selenium.pagina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Config;

class Ej05JUnitFixtures {
	WebDriver driver = null;
	
	@BeforeEach
	void precondicion() {
        driver = Config.navegadorEdge();	
	}
	
	@Test
	void irALogin() throws Exception{
        driver.get(Config.URL_LOGIN);
	}

	@Test
	void verificarTitulo() throws Exception{
        driver.get(Config.URL_LOGIN);
        String tituloEsperado = "MI TITULO";
        String tituloActual = driver.getTitle();
        assertEquals(tituloEsperado, tituloActual, "Validar Titulo de Página");
	}
	
	@AfterEach
	void closeBrowser() {
        driver.quit();		
	}
}
