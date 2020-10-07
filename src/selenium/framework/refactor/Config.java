package selenium.framework.refactor;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Config {
	
	/*
	 * DIRECTORIOS
	 */
	
	private static String ROOT_DIR = System.getProperty("user.dir") + File.separator;
	
	private static String DRIVERS_DIR = ROOT_DIR + "drivers" + File.separator;
	
	public static String EVIDENCIA_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "evidencia"
			+ File.separator;	

	
	
	/*
	 * DRIVERS
	 */
	
	public static String CHROME_DRIVER = DRIVERS_DIR + "chromedriver";
	public static String FIREFOX_DRIVER = DRIVERS_DIR + "geckodriver";
	public static String EDGE_DRIVER = DRIVERS_DIR + "msedgedriver";

	
	
	/*
	 * CONFIGURACIONES
	 */

	public static final long MAX_WAIT_TIME = 5;
	public final static Logger LOGGER = LogManager.getLogger("CSE");

	
	
	/*
	 * DATOS
	 */
	
	private static String URL_BASE = "http://automationpractice.com/index.php";
	public static String URL_LOGIN = URL_BASE + "/index.php?controller=authentication&back=my-account";
	public static String URL_PRODUCTO = URL_BASE + "/index.php?id_product=7&controller=product";

	public static final String USUARIO = "test.0@test.com";
	public static final String CONTRASENA = "test1234";
	public static final String PRODUCTO = "DRESS";
	

}
