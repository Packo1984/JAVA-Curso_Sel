package selenium.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Config;

public class Ej01NivelPagina {
 	public static void main(String[] args) throws Exception {
        WebDriver driver = Config.navegadorEdge();
        driver.get(Config.URL_LOGIN);
        Thread.sleep(3000);
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source: " + driver.getPageSource());
        driver.quit();
        
        
        //1- MAXIMIZAR EL BROWSER ANTES DE EMPEZAR A INTERACTURA
        //2- AGREGAR IR A PAGINA DE PRODUCTO Y LEER URL, TITULO DE PAGINA
        //3- REGRESAR A PAGINA DE LOGIN 
        
        
 	}
}

