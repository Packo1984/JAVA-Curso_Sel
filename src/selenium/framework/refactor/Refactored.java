package selenium.framework.refactor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class Refactored extends BaseTest{

	@Test
	void logout() {
		//llenar formulario
		UiElement lnkLogout = this.getAutomator().find(By.cssSelector("a[class='logout']"));
		lnkLogout.click();
	}
	

	@Test
	void buscarProducto() {
		//introducir producto a buscar
		UiElement txtBuscar = this.getAutomator().find(By.cssSelector("input#search_query_top"));
		txtBuscar.enterText(Config.PRODUCTO);
		//click en boton buscar, y se evalua que aparesca el texto "Seach" (quiere decir que se realizo la busqueda)
		UiElement btnBuscar = this.getAutomator().find(By.name("submit_search"));
		btnBuscar.click(By.xpath("//h1[contains(@class, 'product-listing') and contains(text(), 'Search')]"));
	}

	@Test
	void compartirFacebook() throws InterruptedException {
		//ir a url del producto
		this.getAutomator().goTo(Config.URL_PRODUCTO, By.cssSelector("img#bigpic"));
		//click boton compartir en facebook
		UiElement btnCompartirFacebook = this.getAutomator().find(By.cssSelector("button[onclick='socialsharing_facebook_click();']"));
		btnCompartirFacebook.click();

		//hacer switch a ventana facebook
		String VentanaFaceTitulo = "Facebook";
		this.getAutomator().switchWindowByTitle(VentanaFaceTitulo);
		
		//llenar formulario login facebook
		UiElement txtFaceEmail = this.getAutomator().find(By.id("email"));
		txtFaceEmail.enterText("test.selenium@test.com");
		UiElement txtFacePassw = this.getAutomator().find(By.id("pass"));
		txtFacePassw.enterText("123456");
		
		//pausa para apreciar el manejo de ventanas
		Thread.sleep(5000);
		
	}

}
