package selenium.masdeselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import common.BaseTest2;

class Ej14_Cookies extends BaseTest2{
	
	@Test
	public void Cookies() throws Exception {
		// Obtener cookies e imprimir su informacion
		for (Cookie cookie: getDriver().manage().getCookies()) {
			System.out.println("Cookie information");
			System.out.println("Name: " + cookie.getName());
			System.out.println("Value: " + cookie.getValue());
			System.out.println("Domain: " + cookie.getDomain());
			System.out.println("Path: " + cookie.getPath());
			System.out.println("Secure?: " + cookie.isSecure());
			System.out.println("HttpOnly? : " + cookie.isHttpOnly());
			System.out.println("Full Text: " + cookie);
		}
		
		// Delete all cookies
		getDriver().manage().deleteAllCookies();
		
		// Refresh page - login page should appear as session is logged out.
		getDriver().navigate().refresh();
		
		// Como se cerro la sesion al eliminar COOKIES, 
		//		entonces el test falla en el AfterEach (logout)
	}

}
