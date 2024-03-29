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
	public WysiwygEditorPage clickWysiwygEditor() {
		clickLink("WYSIWYG Editor");
		return new WysiwygEditorPage(driver);
		
	}
	public DynamicLoadingPage clickDynamicLoading() {
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver);
		
	}
	public HorizontalSliderPage clickHorizontalPage() {
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}
	public AlertsPage clickJavaScriptAlerts() {
		clickLink("JavaScript Alerts");
		return new AlertsPage(driver);
	}
	public FileUploadPage clickFileUpload() {
		clickLink("File Upload");
		return new FileUploadPage(driver);	
	}
	public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
	public MultipleWindowsPage clickMultipleWindows(){
		clickLink("Multiple Windows");
		return new MultipleWindowsPage (driver);
	}
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
		clickLink("Large & Deep DOM");
		return new LargeAndDeepDomPage(driver);
	}
    public InfiniteScrollPage clickInfiniteScroll(){
		clickLink("Infinite Scroll");
		return new InfiniteScrollPage(driver);
	}
}
