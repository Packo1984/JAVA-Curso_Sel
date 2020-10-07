package selenium.pagina.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Utils;



/*
 * RECOMENDADO USAR EN CHROME PLUGIN "CSS SELECTOR TESTER" PARA EVALUAR EXPRESIONES CSS
 */


class Ej03FindByCSS extends BaseTest1{

	/*
	 * CSS - Tag con atributo y valor en el atributo
	 */
	@Test
	void test01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[name='email']"));
        Utils.imprimirInfoWebElement("CSS ATRIBUTO Y VALOR ATRIBUTO - TEXT EMAIL", element);
	}

	
	/*
	 * CSS - SIMBOLOS ESPECIALES - ID Elemento 
	 */
	@Test
	void test_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("#email"));
        Utils.imprimirInfoWebElement("CSS ID - TEXT EMAIL", element);
	}


	/*
	 * CSS - SIMBOLOS ESPECIALES - CLASE Elemento 
	 */
	@Test
	void test03() throws Exception {
        WebElement element = driver.findElement(By.cssSelector(".account_input#email"));
        Utils.imprimirInfoWebElement("CSS CLASE - TEXT EMAIL", element);
	}


	/*
	 * CSS - SIMBOLOS ESPECIALES - cualquier TAG
	 */
	@Test
	void test04() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("*[id='email']"));
        Utils.imprimirInfoWebElement("CSS * TAG - TEXT EMAIL", element);
	}
	
	
	/*
	 * CSS - RELACIONES - Padre-Hijo (notacion >)
	 */
	@Test
	void test05() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("div > #email"));
        Utils.imprimirInfoWebElement("CSS RELACION PADRE-HIJO - TEXT EMAIL", element);
	}
	
	
	/*
	 * CSS - RELACIONES - Hermano (notacion +)
	 */
	@Test
	void test06() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("label + #email"));
        Utils.imprimirInfoWebElement("CSS RELACION HERMANO - TEXT EMAIL", element);
	}
	

	/*
	 * CSS - MATCH'S - Contains *=
	 */
	@Test
	void test07() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id *= 'assw']"));
        Utils.imprimirInfoWebElement("CSS MATCH - CONTAINS TEXT PASSWORD", element);
	}

	/*
	 * CSS - MATCH'S - Start with - ^=
	 */
	@Test
	void test08() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id *= 'pass']"));
        Utils.imprimirInfoWebElement("CSS MATCH - STAR WITH TEXT PASSWORD", element);
	}

	/*
	 * CSS - MATCH'S - ENDS with - $=
	 */
	@Test
	void test09() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id $= 'swd']"));
        Utils.imprimirInfoWebElement("CSS MATCH - ENDS WITH TEXT PASSWORD", element);
	}

	/*
	 * CSS - MATCH'S - Contains Word - ~=
	 */
	@Test
	void test10() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[class ~= 'validate'][id='passwd']"));
        Utils.imprimirInfoWebElement("CSS MATCH - ENDS WITH TEXT PASSWORD", element);
	}
	

	/*
	 * CSS - OPERADOR LOGICO - OR ,
	 */
	@Test
	void test11() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[type='password'], *[name='password']"));
        Utils.imprimirInfoWebElement("CSS MATCH - OP LOGICO OR TEXT PASSWORD", element);
	}
	

	/*
	 * CSS - OPERADOR LOGICO - AND 
	 * 	"." => Despues del . se pone una clase de esta manera uno los css. Ej. input.require (valida un tag input donde su clase sea require)
	 * 	"#" => Despues del # se pone un id esta manera une los css. Ej. input#email (valida un tag input donde su id es email)
	 */
	@Test
	void test12() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input.validate#passwd"));
        Utils.imprimirInfoWebElement("CSS MATCH - OP LOGICO OR TEXT PASSWORD", element);
	}


	/*
	 * CSS - Tag con multiple atributo y valores de atributos
	 */
	@Test
	void test13() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[name='email'][type='text']"));
        Utils.imprimirInfoWebElement("CSS ATRIBUTO Y VALOR ATRIBUTO - TEXT EMAIL", element);
	}

}
