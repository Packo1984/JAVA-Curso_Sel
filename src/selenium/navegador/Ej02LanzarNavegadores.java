package selenium.navegador;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Ej02LanzarNavegadores {
 	public static void main(String[] args) throws Exception {
 		
 		//String nombreDriver = "geckodriver.exe";
 		//String nombreDriver = "chromedriver.exe";
 		//String nombreDriver = "IEDriverServer.exe";
 		String nombreDriver = "msedgedriver.exe";
 		
 		//String driverPath = "C:\\devenv\\Selenium\\drivers\\Edge\\msedgedriver.exe";

 		String driverPath = System.getProperty("user.dir") 
 									+ File.separator
 									+ "drivers"
 									+ File.separator
 									+ nombreDriver; // add .exe for windows
 		
        //FIREFOX
        //System.setProperty("webdriver.gecko.driver", driverPath);
        //FirefoxDriver driver = new FirefoxDriver();
        
        //WEBDRIVER => FIREFOX
        //System.setProperty("webdriver.gecko.driver", driverPath);
        //WebDriver driver = new FirefoxDriver();
        
        //WEBDRIVER => CHROME
 		//System.setProperty("webdriver.chrome.driver", "d:/drivers/chromdedriver.exe");
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //WebDriver driver = new ChromeDriver();
 		

        //WEBDRIVER => IE
        //System.setProperty("webdriver.ie.driver", driverPath);
        //WebDriver driver = new InternetExplorerDriver();
        
        //WEBDRIVER => EDGE
        System.setProperty("webdriver.edge.driver", driverPath);
      
        WebDriver driver = new EdgeDriver();
 
      //5 segundos
        Thread.sleep(5000); 
        
        driver.quit();
 	
}
 	
}

