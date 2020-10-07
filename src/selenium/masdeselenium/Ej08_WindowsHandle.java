package selenium.masdeselenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest2;
import common.Config;

public class Ej08_WindowsHandle  extends BaseTest2{

	@Test
    public void manejoVentanas() throws InterruptedException{

		String ventanaPrincipalHandle = getDriver().getWindowHandle();
        String ventanaPrincipalTitulo = getDriver().getTitle();
        System.out.println("VENTANA PRINCIPAL TITULO = " + ventanaPrincipalTitulo);
        System.out.println("VENTANA PRINCIPAL HANDLE = " + ventanaPrincipalHandle);

        
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        // abrir nueva ventana
        js.executeScript("window.open(arguments[0], 'NUEVA VENTANA', 'width=300, height=200');", Config.URL_PRODUCTO);
        Thread.sleep(5000);

        for (String handle: getDriver().getWindowHandles()) {
            if (!handle.equals(ventanaPrincipalHandle)) {
                getDriver().switchTo().window(handle);
                System.out.println("2DA VENTANA TITULO = " + getDriver().getTitle());
                System.out.println("2DA VENTANA HANDLE = " + handle);
                Dimension ventanaTamanio = new Dimension(800,600);
                getDriver().manage().window().setSize(ventanaTamanio);
                Thread.sleep(5000);
                getDriver().manage().window().maximize();
                Thread.sleep(5000);
                getDriver().close();
            }
        }
        
        Thread.sleep(5000);
        
        getDriver().switchTo().window(ventanaPrincipalHandle);
        System.out.println("VENTANA PRINCIPAL TITULO = " + getDriver().getTitle());
        System.out.println("VENTANA PRINCIPAL HANDLE = " + getDriver().getWindowHandle());
                
        // Assert validar que se cerro la 2da ventana y solo existe 1
        assertEquals(getDriver().getWindowHandles().size(), 1, "ASSERT => SE CERRO LA 2DA VENTANA");
    }
}
