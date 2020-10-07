package selenium.pagina.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Utils;



/*
 * RECOMENDADO USAR EN CHROME PLUGIN "CSS SELECTOR TESTER" PARA EVALUAR EXPRESIONES CSS
 */


class Ej04FindByXpath extends BaseTest1{

	/*
	 * XPATH ABSOLUTO ""
	 */
	@Test
	void test01() throws Exception {
        WebElement element = driver.findElement(By.xpath("/html/body[@id='authentication']/div[@id='page']"
        		+ "/div[@class='columns-container']/div[@id='columns']/div[@class='row'][2]/div[@id='center_column']"
        		+ "/div[@class='row']/div[@class='col-xs-12 col-sm-6'][2]/form[@id='login_form']/"
        		+ "div[@class='form_content clearfix']/div[@class='form-group form-ok']"
        		+ "/input[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH ABSOLUTO", element);
	}

	/*
	 * XPATH RELATIVO - TAG con multiatributo y valores de atributos
	 */
	@Test
	void test02_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELATIVO MULTI ATRIBUTO ", element);
	}
	

	/*
	 * XPATH RELATIVO - TAG con multiatributo y valores de atributos
	 */
	@Test
	void test02_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='email' and @name='email' and @data-validate='isEmail']"));
        Utils.imprimirInfoWebElement("XPATH RELATIVO MULTI ATRIBUTO OTRA VERSION ", element);
	}
	

	/*
	 * XPATH RELATIVO - Cualquier TAG
	 */
	@Test
	void test03() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELATIVO CUALQUIER TAG ", element);
	}


	/*
	 * XPATH RELATIVO - Text
	 */
	@Test
	void test04() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[text()='Authentication']"));
        Utils.imprimirInfoWebElement("XPATH TEXTO ", element);
	}

	
	/*
	 * XPATH Relaciones - Padre-Hijos
	 */
	@Test
	void test05() throws Exception {
        WebElement element = driver.findElement(By.xpath("//div/input[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELACION - PADRE-HIJO", element);
	}

	
	/*
	 * XPATH Relaciones - Hermano siguiente
	 */
	@Test
	void test06() throws Exception {
        WebElement element = driver.findElement(By.xpath("//label/following-sibling::input[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELACION - HERMANO SIGUIENTE", element);
	}

	
	/*
	 * XPATH Relaciones - Hermano anterior
	 */
	@Test
	void test07() throws Exception {
        WebElement element = driver.findElement(By.xpath("//div/preceding-sibling::div/input[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELACION - HERMANO ANTERIOR", element);
	}

	
	/*
	 * XPATH Relaciones - PARENTS (ANTERIORES)
	 */
	@Test
	void test08() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@id='email']/../.."));
        Utils.imprimirInfoWebElement("XPATH RELACION - PARENT", element);
	}


	
	/*
	 * XPATH Relaciones - DESCENDIENTES
	 */
	@Test
	void test09() throws Exception {
        WebElement element = driver.findElement(By.xpath("//form//input[@id='email']"));
        Utils.imprimirInfoWebElement("XPATH RELACION - DESCENDIENTES", element);
	}


	/*
	 * XPATH Relaciones - ANCESTROS
	 */
	@Test
	void test10() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@id='email']/ancestor::form"));
        Utils.imprimirInfoWebElement("XPATH RELACION - ANCESTROS", element);
	}



	/*
	 * XPATH Match - contains
	 */
	@Test
	void test11() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[contains(@id, 'ass')]"));
        Utils.imprimirInfoWebElement("XPATH RELACION - ANCESTROS", element);
	}


	/*
	 * XPATH Match - starts with
	 */
	@Test
	void test12() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[starts-with(@id, 'pas')]"));
        Utils.imprimirInfoWebElement("XPATH RELACION - ANCESTROS", element);
	}


	/*
	 * XPATH Match - contains - text
	 */
	@Test
	void test13() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'registered')]"));
        Utils.imprimirInfoWebElement("XPATH RELACION - ANCESTROS", element);
	}



	/*
	 * XPATH POSICION
	 */
	@Test
	void test14() throws Exception {
        WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        Utils.imprimirInfoWebElement("XPATH RELACION - ANCESTROS", element);
	}

}
