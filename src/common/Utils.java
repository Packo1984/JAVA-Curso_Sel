package common;

import org.openqa.selenium.WebElement;

public class Utils {

	public static void imprimirInfoWebElement(String nombre, WebElement elemento) {
		String marker = "*************************************";
		System.out.println(marker);
		System.out.println("Elemento Nombre: " + nombre);
		System.out.println(marker);
		System.out.println("WebElement object:: " + elemento);
		System.out.println("Outer HTML:: " + elemento.getAttribute("outerHTML"));
		System.out.println("Inner HTML:: " + elemento.getAttribute("innerHTML"));
        System.out.println("Value::" + elemento.getAttribute("value"));
		System.out.println("Text:: " + elemento.getText());
        System.out.println("Tag:: " + elemento.getTagName());
		System.out.println("Class:: " + elemento.getClass());
		System.out.println("Location:: " + elemento.getLocation());
		System.out.println("Size:: " + elemento.getSize());
        System.out.println("Displayed?:: " + elemento.isDisplayed());
        System.out.println("Selected?:: " + elemento.isSelected());
        System.out.println("Enabled?:: " + elemento.isEnabled());
        System.out.println(marker);
	}
}