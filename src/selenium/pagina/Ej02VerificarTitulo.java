package selenium.pagina;

import org.openqa.selenium.WebDriver;

import common.Config;

public class Ej02VerificarTitulo {

	public static void main(String[] args) throws Exception {
        WebDriver driver = Config.navegadorEdge();
        driver.get(Config.URL_LOGIN);
       
        String tituloEsperado = "Login - My Stor"; //Login - My Store //login - my Store
        String tituloActual = driver.getTitle();
        //if(!tituloEsperado.equals(tituloActual)){
         if(!tituloEsperado.equals(tituloActual)) {
        	throw new Exception(
        			"FAIL TEST => Titulo no coincide. Esperado: " + tituloEsperado + 
        			" Actual: " + tituloActual
        			);
        }
        driver.quit();
	}
}
