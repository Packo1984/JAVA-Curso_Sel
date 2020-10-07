package selenium.masdeselenium;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xml.internal.serializer.utils.Utils;

import common.Config;



public class DES {
 	public static void main(String[] args) throws Exception {
        WebDriver driver = Config.navegadorEdge();
        //Ingresa a la pagina de DES
        driver.get("https://qa.des.metlife.com/siteminderagent/forms/login.fcc?TYPE=33554433&REALMOID=06-000b658e-e0b3-1cd1-9874-676cac18f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-bn0XuXYLjMjbjG7rOQsvMxqyJML9f1COY95TRujXyImDZja2DrQ%2bNsBaVPwHDRZC&TARGET=-SM-https%3a%2f%2fqa%2edes%2emetlife%2ecom%2fdes%2f");
        Thread.sleep(3000);
        
        
        
       //Maximiza Pantalla 
       driver.manage().window().maximize();

       //Creamos instacía wait
       WebDriverWait wait = new WebDriverWait(driver, 60);
       
       
       //LOGIN
       //Busca campo Usuario y envia el texto
       WebElement txtUsuario=driver.findElement(By.id("UserIdInput"));
       txtUsuario.sendKeys("N3250232f");
        //Busca campo Contraseña y envia texto
       WebElement txtPwd=driver.findElement(By.cssSelector("div#passwordfield > input#PASSWORD"));
       common.Utils.imprimirInfoWebElement("imprime", txtPwd);
         txtPwd.sendKeys("MetMex31");
     
        //Busca Botón  Ingresar y manda Clic.
      // WebElement btnIngresar=driver.findElement(By.id("btn"));
       //btnIngresar.click();
       Thread.sleep(3000);

        
        
 	}
}

