package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage clickFormAuthentication() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}
	public DropdownPage dropdown() {
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}
	public KeyPressesPage clickKeyPresses() {
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}
	public HoversPage clickHovers() {
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	public void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}
