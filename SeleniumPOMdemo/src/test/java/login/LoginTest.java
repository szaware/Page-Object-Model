package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	RegistrationPage reg;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		reg=new RegistrationPage(driver);
	}
	@Test 
	public void firstnamereg() {
		
		reg.firstname("Swapnil");
	}
	@Test
	public void lastname() {
		reg.lastname("Zaware");
	}
	@Test
	public void Address() {
		reg.Address("pune");
	}
	@Test
	public void Email() {
		reg.Email("abcd@gmail.com");
	}
	@Test
	public void Phone() {
		reg.Phone("0987654321");
	}
	@Test
	public void selectMaleRadioButton() {
		reg.selectMaleRadioButton();
	}
	@Test
	public void selectFemaleRadioButton() {
		reg.selectFemaleRadioButton();
	}
	@Test
	public void Hobbies() {
		reg.Hobbies();
	}
	@Test
	public void Language()
	{
		reg.Language();
	}	
	@Test
	public void OutsideElement() {
		reg.OutsideElement();
	}
	@Test
	public void Skills() {
		reg.Skills();
	}
	@Test
	public void Dobday() {
		reg.Dobday(null, null, null);
	}
	@Test
	public void Password() {
		reg.Password();
	}
	@Test
	public void Comfirm_Password() {
		reg.Comfirm_Password();
	}
	@Test
	public void SubmitButton() {
		reg.SubmitButton();
	}
}
