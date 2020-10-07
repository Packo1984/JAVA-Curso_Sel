package selenium.navegador;

import org.openqa.selenium.WebDriver;

import common.Config;

public class Ej04NivelNavegador {
 	public static void main(String[] args) throws Exception {
        WebDriver driver = Config.navegadorEdge();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com.mx");
        driver.get(Config.URL_LOGIN);
        
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        
        System.out.println("Window Handle: " + driver.getWindowHandle());
        
        for (String win: driver.getWindowHandles()){
                System.out.println("HADLE : " + win);
        }
        
        for(int i=0; i < driver.getWindowHandles().size(); i++) {
        	System.out.println("HANDLE = " + driver.getWindowHandles().iterator().next() );
        }
        
        driver.quit();
 	}
}

