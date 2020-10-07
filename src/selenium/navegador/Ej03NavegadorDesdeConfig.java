package selenium.navegador;

import org.openqa.selenium.WebDriver;
import common.Config;

public class Ej03NavegadorDesdeConfig {
 	public static void main(String[] args) throws Exception {
        //WebDriver driver = Config.navegadorChrome();
        //WebDriver driver = Config.navegadorFireFox();
        WebDriver driver = Config.navegadorEdge();
        Thread.sleep(5000);
        driver.quit();
 	}
}

