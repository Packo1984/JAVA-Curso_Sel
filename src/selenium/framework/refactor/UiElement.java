package selenium.framework.refactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UiElement {
	private WebAutomator automator;
	private WebElement element;

	public UiElement(WebAutomator automator, WebElement element) {
		this.automator = automator;
		this.element = element;
	}
	
	public void enterText(String text) {
		this.element.sendKeys(text);
		assertEquals(text, this.element.getAttribute("value"), "ASSERT => Texto ingresado es correcto.");
	}

	public void submit(By by) {
		this.element.submit();
		this.automator.assertPresent(by);
	}

	public String getLink() {
		return this.element.getAttribute("href");
	}
	
	public void click() {
		this.element.click();
	}

	public void click(By by) {
		this.element.click();
		this.automator.assertPresent(by);
	}

	
	
}
