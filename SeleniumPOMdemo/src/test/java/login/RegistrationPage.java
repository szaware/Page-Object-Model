package login;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	WebDriver driver;
	Actions action;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	WebElement firstname;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	WebElement lastname;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
	WebElement address;

	@FindBy(xpath = "//*[@id=\"eid\"]/input")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement phone;

	@FindBy(xpath = "//input[@type='radio'and @name='radiooptions' and @value='Male']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//input[@type='radio'and @name='radiooptions' and @value='FeMale']")
	WebElement femaleRadioButton;

	@FindBy(xpath = "//input[@id='checkbox1']")
	WebElement Hobbies;

	@FindBy(id = "msdd")
	WebElement Languages;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]")
	WebElement English;

	@FindBy(xpath = "/html/body")
	WebElement OutsideElement;

	@FindBy(xpath = "//*[@id=\"Skills\"]")
	WebElement Skills;

	@FindBy(xpath = "//*[@id=\"Skills\"]/option[39]")
	WebElement Java;
	@FindBy(xpath = "//*[@id=\"Skills\"]/option[67]")
	WebElement Sql;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")
	WebElement Country;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	WebElement India;

	@FindBy(xpath = "//*[@id=\"yearbox\"]")
	WebElement Dobyear;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
	WebElement Dobmonth;
	
//	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[10]")

	@FindBy(xpath = "//*[@id=\"daybox\"]")
	WebElement Dobday;

	@FindBy(id = "firstpassword")
	WebElement Password;

	@FindBy(id = "secondpassword")
	WebElement Comfirm_Password;
	
	@FindBy(xpath = "//*[@id=\"submitbtn\"]")
	WebElement Submit;
	
	
	public void firstname(String user1) {
		firstname.sendKeys(user1);
	}

	public void lastname(String sirname) {
		lastname.sendKeys(sirname);
	}

	public void Address(String add) {
		address.sendKeys("pune");
	}

	public void Email(String emailId) {
		email.sendKeys("abcd@gmail.com");
	}

	public void Phone(String user) {
		phone.sendKeys("0987654321");
	}

	public void selectMaleRadioButton() {
		if (maleRadioButton.isSelected()) {
			maleRadioButton.click();
		}
	}

	public void selectFemaleRadioButton() {
		if (femaleRadioButton.isSelected()) {
			femaleRadioButton.click();
		}
	}

	public void Hobbies() {
		Hobbies.click();
	}

	public void Language() {
		Languages.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(English));

		Actions action = new Actions(driver);
		action.moveToElement(English).click().build().perform();
	}

	public void OutsideElement() {
		OutsideElement.click();
	}

	public void Skills() {
		Skills.click();
	}

	public void Java() {
		Java.click();
	}

	public void Country() {
		Country.click();
	}

	public void India() {
		India.sendKeys("India");
		India.sendKeys(Keys.ENTER);
	}

	public void Dobday(String year, String month, String day) {
		new 
		Select(Dobyear).selectByVisibleText(year);
		new
		Select(Dobmonth).selectByVisibleText(month);
		new
		Select(Dobday).selectByVisibleText(day);
	}

	public void Password() {
		Password.sendKeys("Zaware");
	}

	public void Comfirm_Password() {
		Comfirm_Password.sendKeys("Zaware");
	}
	
	public void SubmitButton() {
		Submit.click();
	}
}
