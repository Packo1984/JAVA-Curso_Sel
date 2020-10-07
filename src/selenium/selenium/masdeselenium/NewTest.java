package selenium.masdeselenium;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;
import common.Config;
import common.Utils;


public class NewTest {
  @Test
  public void f() {
	  JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
      // aceptar alert
		js.executeScript("alert('TEST ALERT');");
		getWaiter().until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		getDriver().switchTo().alert().accept();

      
      // dimiss alert + getText
		js.executeScript("alert('TEST ALERT');");
		getWaiter().until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		String textAlert =  getDriver().switchTo().alert().getText();
		System.out.println("TEXTO ALERTA = " + textAlert);
      getDriver().switchTo().alert().dismiss();
  }
}
