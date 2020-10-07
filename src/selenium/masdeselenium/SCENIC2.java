package selenium.masdeselenium;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import common.Config;



public class SCENIC2 {
 	public static void main(String[] args) throws Exception {
        WebDriver driver = Config.navegadorChrome();
        //Ingresa a la pagina de SCENIC
        driver.get("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
        Thread.sleep(3000);
        
        
        
       //Maximiza Pantalla 
       driver.manage().window().maximize();

       //Creamos instacía wait
       WebDriverWait wait = new WebDriverWait(driver, 90);
       
       
       //LOGIN
       //Busca campo Usuario y envia el texto
       WebElement txtUsuario=driver.findElement(By.id("login_usuario"));
       txtUsuario.sendKeys("N3409378");
       WebElement txtPwd=driver.findElement(By.id("login_contrasenya"));
       txtPwd.sendKeys("MetMex12");
       WebElement btnIngresar=driver.findElement(By.id("btn"));
       btnIngresar.click();
     
       
       WebElement btnCliente=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_crearCte")));
       btnCliente.click();
       WebElement btnSol=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_crearSol")));
       btnSol.click();
       Thread.sleep(3000);
       WebElement btnConfi=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dijit_form_Button_36")));
       btnConfi.click();
       
       
      /* WebElement btnSol2=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_crearSol")));
       btnSol2.click();
       
       
      */
       
       WebElement SolListaLN=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.lineaNegocio']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       SolListaLN.click();
       WebElement SolTxtLN=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.lineaNegocio']")));
       SolTxtLN.sendKeys("INDIVIDUAL PRIVADO");
       
       WebElement SolListaRamo=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.ramo']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       SolListaRamo.click();
       WebElement SolTxtRamo=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.ramo']")));
       SolTxtRamo.sendKeys("VIDA");
       
       WebElement SolListaProducto=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.producto']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       SolListaProducto.click();
       WebElement SolTxtProducto=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoProducto.producto']")));
       SolTxtProducto.sendKeys("OTROS PRODUCTOS VIDA INDIVIDUAL");
       
       WebElement btnSiguiente=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='dijit_form_Button_0']")));
      btnSiguiente.click();
       

       Thread.sleep(3000);
         
       /*
       txtUsuario.sendKeys("N3250232");
        //Busca campo Contraseña y envia texto
       WebElement txtPwd=driver.findElement(By.id("login_contrasenya"));
       txtPwd.sendKeys("MetMex30");
        //Busca Botón  Ingresar y manda Clic.
       WebElement btnIngresar=driver.findElement(By.id("btn"));
       btnIngresar.click();
       
       //Preisona botón CLiente
       WebElement btnCliente=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_crearCte")));
       btnCliente.click();

       //llena Criterios para Determinar Datos Mínimos de Captura
       WebElement listaLineaNegocio=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lineaNegocioSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       listaLineaNegocio.click();
      //WebElement txtLineaNegocio=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lineaNegocioSlct']")));
       //txtLineaNegocio.sendKeys("INDIVIDUAL PRIVADO");
       WebElement txtOpcion1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='INDIVIDUAL PRIVADO']")));
       txtOpcion1.click();
       
       WebElement listaRamo=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='ramoSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       listaRamo.click();
       WebElement txtOpcion2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='VIDA']")));
       txtOpcion2.click();
       
       WebElement listaProducto=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='productoSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       listaProducto.click();
       WebElement txtOpcion3=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='OTROS PRODUCTOS VIDA INDIVIDUAL']")));
       txtOpcion3.click();
       
       WebElement listaROL=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='rolesSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       listaROL.click();
       WebElement txtOpcion4=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='CONTRATANTE']")));
       txtOpcion4.click();
       
       WebElement btnPF=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span [id='btnDatoPF']")));
      btnPF.click();
      
      //Datos Generales
      WebElement listaTitulo=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tituloID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
      listaTitulo.click();
      WebElement txtOpcionTitulo=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='SR.']")));
      txtOpcionTitulo.click();

      WebElement txtNombre=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='nombreID']")));
      txtNombre.sendKeys("Jeser Eliam");
      
      WebElement txtAPaterno=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='aPatID']")));
      txtAPaterno.sendKeys("De la Cruz");
      
      WebElement txtAMaterno=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='aMatID']")));
      txtAMaterno.sendKeys("Hernandez");

      WebElement txtFechNac=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='fNacID']")));
      txtFechNac.sendKeys("29/01/1984");
      
      WebElement txtRFC=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='rfcID']")));
      txtRFC.sendKeys("JEDH8401294T7");
      
      WebElement txtCURP=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='curpID']")));
      txtCURP.sendKeys("JEDH840129HHGRRR03");
      
      WebElement listaGenero=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='generoID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
      listaGenero.click();
      WebElement txtOpcionGenero=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='MASCULINO']")));
      txtOpcionGenero.click();
      
      WebElement listaEdoCivil=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='edoCivID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
      listaEdoCivil.click();
      WebElement txtOpcionEdoCivil=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='SOLTERO (A)']")));
      txtOpcionEdoCivil.click();
      
      WebElement listaIdentificacion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='tipoIdID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
      listaIdentificacion.click();
      WebElement txtOpcionIdentificacion=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='CREDENCIAL PARA VOTAR']")));
      txtOpcionIdentificacion.click();
      
      WebElement txtNumIdent=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='numIdID']")));
      txtNumIdent.sendKeys("ABCD1234");
      
      WebElement txtNSS=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='nssID']")));
      txtNSS.sendKeys("198401239");
      
      //---Seccion Lugar de nacimiento----
      WebElement SeccionLugarNacimiento=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='lugarNacId']")));
      SeccionLugarNacimiento.click();
      
      WebElement listaPaisNac=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='paisNacID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
      listaPaisNac.click();
      WebElement txtOpcionPaisNac=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='MEXICO']")));
      txtOpcionPaisNac.click();
      
      WebElement txtEstado=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='edoNacID']")));
      txtEstado.sendKeys("HIDALGO");
      
      WebElement txtCiudad=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='mpioNacID']")));
      txtCiudad.sendKeys("PACHUCA");
      
      //WebElement btnAgregarNacionalidad=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span [@id='btnAgregarDomicilio_label']")));
     //btnAgregarNacionalidad.click();
       
    // WebElement boton=driver.findElement(By.cssSelector("#btnAgregarTel2"));
    // boton.click();
     
     WebElement SeccionDomicilio=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='direccionId_titleBarNode']")));
     SeccionDomicilio.click();
     
     WebElement btnAgregarDomi=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span [@id='btnAgregarDomicilio_label']")));
    btnAgregarDomi.click();
     
     
       //WebElement listaNacionalidad=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='dijit_form_ComboBox_0']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input")));
       //listaNacionalidad.click();
       //WebElement txtOpcionNacionalidad=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='MEXICO']")));
       //txtOpcionNacionalidad.click();
       
       //WebElement btnNacionalidad=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[id='dijit_form_Button_121']")));
       //btnNacionalidad.click();
      //  driver.quit();
     
     //cick a lista
       
     	
        //1- MAXIMIZAR EL BROWSER ANTES DE EMPEZAR A INTERACTURA
        //2- AGREGAR IR A PAGINA DE PRODUCTO Y LEER URL, TITULO DE PAGINA
        //3- REGRESAR A PAGINA DE LOGIN 
        
        */
 	}
}

