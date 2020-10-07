package selenium.framework.refactor;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebAutomator {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public WebAutomator(Navegador navegodor) throws Exception {
		switch (navegodor) {
		
		case CHROME:
			System.setProperty("webdriver.chrome.driver", modifyIfWindows(Config.CHROME_DRIVER));
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", modifyIfWindows(Config.FIREFOX_DRIVER));
			driver = new FirefoxDriver();
			break;
		case EDGE:
			System.setProperty("webdriver.edge.driver", modifyIfWindows(Config.EDGE_DRIVER));
			driver = new EdgeDriver();
			break;
		case HTMLUNIT:
			driver = new HtmlUnitDriver(true);
			break;
		default:
			throw new Exception("NAVEGADOR NO SOPORTADO: " + navegodor);
		}
		wait = new WebDriverWait(driver, Config.MAX_WAIT_TIME);
	}
	
	public WebAutomator() throws Exception{
		this(Navegador.HTMLUNIT);
	}
	
	private static String modifyIfWindows(String inPath) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")){
			return inPath + ".exe";
		} else {
			return inPath;
		}
	}

	private UiElement wait(ExpectedCondition<WebElement> condition) {
		Config.LOGGER.debug("Waiting for expected condition: " + condition.toString());
		return new UiElement(this, wait.until(condition));
	}
	
	public UiElement waitUntilPresent(By by) {
		return wait(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public UiElement waitUntilClickable(By by) {
		return wait(ExpectedConditions.elementToBeClickable(by));
	}
	
	public UiElement find(By by) {
		return waitUntilPresent(by);
	}
	
	public UiElement goTo(String url, By by) {
		Config.LOGGER.info("Go to URL:" + url);
		driver.get(url);
		return waitUntilPresent(by);
	}

	public void closeAll() {
		
		driver.quit();
	}
	
	public void assertPresent(By by) {
		try {
			waitUntilPresent(by);
		} catch (Exception e) {
			Config.LOGGER.error("ASSERT => Exception al comprobar la presensia de elemento, findBy: " + by.toString());
			throw new AssertionError("Elemento no presente" + e.getMessage());
		}
	}
	

	public void clearCookies() {
		
		driver.manage().deleteAllCookies();
	}
	
	public void switchWindowByTitle(String title) {
		try {
			Boolean valida = false;

	        for (String handle: driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	            System.out.println("2DA VENTANA TITULO = " + driver.getTitle());
	            System.out.println("2DA VENTANA HANDLE = " + handle);
	       
	        	if (driver.getTitle().toString().contains(title)) {
	        		valida = true;
	        		break;
	        	}
	        }
		}
		catch(Exception ex) {
			Config.LOGGER.debug("Imposible hacer switch a la ventana con titulo: " + title 
					+ "Exception: " +  ex.toString());
		}
        
        
	}
	

	public void closeCurrentWindow() {
		try {
			driver.close();
		}
		catch(Exception ex) {
			Config.LOGGER.debug("Imposible cerrar la ventana actual: " + driver.getTitle()
					+ "Exception: " +  ex.toString());
		}
        
        
	}
	

}
