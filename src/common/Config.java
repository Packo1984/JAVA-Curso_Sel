package common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Config {
	
	public static String DRIVER_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "drivers"
			+ File.separator;
			
	public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
	public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";
	public static String EDGE_DRIVER_PATH = DRIVER_DIR + "msedgedriver";
	
	private static String URL_BASE = "http://automationpractice.com/index.php";
	public static String URL_LOGIN = URL_BASE + "/index.php?controller=authentication&back=my-account";
	public static String URL_LOGOUT = URL_BASE + "/index.php?mylogout=";
	public static String URL_PRODUCTO = URL_BASE + "/index.php?id_product=7&controller=product";
	public static String URL_FILE_UPLOAD = ARCHIVOS_DIR() + "upload_file.html";
	public static String URL_FRAMES = ARCHIVOS_DIR() + "frames.html";
	
	public static String USUARIO = "test.0@test.com";
	public static String CONTRASENA = "test1234";
	
	public static String ARCHIVOS_DIR() {
		return System.getProperty("user.dir") 
				+ File.separator
				+ "archivos"
				+ File.separator;
	}
		
	public static String EVIDENCIA_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "evidencia"
			+ File.separator;
	
	//esto me permite mandar el directorio, si el 
	// sistema es windows le agrega el .exe al nombre
	//del driver
	private static String modifyIfWindows(String inPath) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")){
			return inPath + ".exe";
		} else {
			return inPath;
		}
	}
	
	public static WebDriver navegadorChrome() {
		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
		return new ChromeDriver();
	}
	
	public static WebDriver navegadorFireFox() {
		System.setProperty("webdriver.gecko.driver", modifyIfWindows(GECKO_DRIVER_PATH));
		return new FirefoxDriver();
	}
	
	public static WebDriver navegadorEdge() {
		System.setProperty("webdriver.edge.driver", modifyIfWindows(EDGE_DRIVER_PATH));
		return new EdgeDriver();
	}
	
	public static WebDriver navegadorHtmlUnitDriver() {
		// To enable JavaScript, pass true as argument
		return new HtmlUnitDriver(true);
	}

}
