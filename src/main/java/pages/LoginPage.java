package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}	

	// web elements

		@FindBy(xpath = "//input[@name='uid']") // with page factory
		WebElement userName;
		
	
		@FindBy(xpath= "//input[@name='password']")
		WebElement password ;
		
		@FindBy(xpath="//input[@name='btnLogin']")
		WebElement loginBtn;
		
		@FindBy(xpath="//input[@name='btnReset']")
		WebElement resetBtn;
		
		
		By pageHeader = By.xpath("//h2");

		public String getLoginButtonText() {
			//String text = driver.findElement(loginButton).getText();
			
				
			if(driver.findElement(pageHeader).isDisplayed())
				System.out.println("Located Page");
					
					
			String text = loginBtn.getAttribute("value"); 
			return text;
		}
		
		public void inputUsrName(String usrnme) {
			userName.sendKeys(usrnme);
		}
		
		public void inputPwd(String pwd) {
			password.sendKeys(pwd);
		}
				
		public void loginBtnClick() {
			loginBtn.click();
		}
		
		public void ResetBtnClick() {
			resetBtn.click();
		}
		
		public void performLogin(String usr, String pwd) {
			inputUsrName(usr);
			inputPwd(pwd);
			loginBtnClick();
		}
		
}

