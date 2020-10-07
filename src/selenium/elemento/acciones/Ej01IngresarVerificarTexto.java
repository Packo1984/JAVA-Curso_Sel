package selenium.elemento.acciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Config;

public class Ej01IngresarVerificarTexto extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
        String emailEsperado = Config.USUARIO;
        String Contra = Config.CONTRASENA;
        WebElement txtEmail = driver.findElement(By.id("email"));
        
        assertTrue(txtEmail.isEnabled(), "Assert that user name text box is enabled.");
        txtEmail.sendKeys(emailEsperado);        
        String emailActual = txtEmail.getAttribute("value");
        assertEquals(emailEsperado, emailActual, "ASSERT => TEXTO INGRESADO EN INPUT TEXT EMAIL");
        
        WebElement txtPW = driver.findElement(By.id("passwd"));
        txtPW.sendKeys(Contra);
        
        WebElement Login = driver.findElement(By.id("SubmitLogin"));
        Login.click();
        
        WebElement txtCuenta = driver.findElement(By.xpath("//h1[text()='My account']"));
          assertTrue(txtCuenta.isDisplayed(),"ASSERT => LOGIN");
       
          String Cuenta = txtCuenta.getAttribute("value");
                assertEquals(txtCuenta, Cuenta, "ASSERT => TEXTO INGRESADO EN INPUT TEXT EMAIL");
        
               
        Thread.sleep(5000);

        
        
	}

}
