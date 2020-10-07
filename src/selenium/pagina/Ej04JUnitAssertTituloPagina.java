package selenium.pagina;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Config;

class Ej04JUnitAssertTituloPagina {

	@Test
	void verificarTitulo() throws Exception{
		WebDriver driver = Config.navegadorEdge();
        driver.get(Config.URL_LOGIN);
        String tituloEsperado = "MI TITULO";
        String tituloActual = driver.getTitle();
        assertEquals(tituloEsperado, tituloActual);
        driver.quit();	
	}

	@Test
	void verificarTituloMsjEspecifico() throws Exception{
		WebDriver driver = Config.navegadorEdge();
        driver.get(Config.URL_LOGIN);
        String tituloEsperado = "MI TITULO";
        String tituloActual = driver.getTitle();
        assertEquals(tituloEsperado, tituloActual, "VALIDAR => TITULO DE PAGINA => ");
        driver.quit();	
	}
	
	@Test
	void validaAssertTrue() throws Exception{
        Boolean resultado = false;
        assertTrue(resultado, "resultado es falso, se espera verdadero");
	}
	
	@Test
	void validaAssertFalse() throws Exception{
		Boolean resultado = true;
        assertFalse(resultado, "resultado es verdadero, se espera falso");
	}
	
}
