package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {

	WebDriver driver;
	
	//consructur
	Login(WebDriver driver ){
	this.driver=driver;	
	}
	//*[@id="basicBootstrapForm"]/div[1]/div[1]
	
	//locators
private	By firstname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
private	By lastname= By.xpath("////*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
private	By address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
private	By email=By.xpath("//*[@id=\"eid\"]/input");
private	By phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
private	By maleRadioButton=By.xpath("//input[@type='radio'and @name='radiooptions' and @value='Male']");
private	By femaleRadioButton =By.xpath("//input[@type='radio'and @name='radiooptions' and @value='FeMale']");
private	By Hobbies=By.xpath("//input[@type='checkbox' and @id='checkbox and @value 'Cricket']");
private	By Languages=By.id("msdd");
private	By Skills=By.id("Skills");
private	By Country= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
private	By dobday= By.xpath("//*[@id=\"yearbox\"]");
private	By dobmonth= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
private	By dobyear=By.xpath("//*[@id=\"daybox\"]");
private	By Password = By.id("firstpassword");
private	By Comfirm_Password = By.id("secondpassword");
	
	// Action methods
	 public void firstname(String first) {
		 driver.findElement(firstname).sendKeys("Swapnil");
	 }
	 public void lastname(String user) {
		 driver.findElement(lastname).sendKeys("Zaware");
	 }
	 
	 public void Address(String add) {
		 driver.findElement(address).sendKeys("Pune"); 
	 }
	 
	 public void Email(String emailId) {
		 driver.findElement(email).sendKeys("abcd@gmail.com");
	 }
	 
	 public void Phone(String phoneNo) {
		 driver.findElement(phone).sendKeys("98765432");
	 }
	 
	 public void selectMaleRadioButton(String radioButn) {
		 WebElement maleRadioButtonElement=driver.findElement(maleRadioButton);
		 if (maleRadioButtonElement.isSelected()) {
			 maleRadioButtonElement.click();
//		 maleRadioButtonElement.click();
		 
	 } }
	 
	 
	 public void selectFemaleRadioButton() {
		 WebElement femaleRadioButtonElement=driver.findElement(femaleRadioButton);
		 if (femaleRadioButtonElement.isSelected()) {
			 femaleRadioButtonElement.click();
		 }
	 }
	 

	 public void Hobbies() {
		 driver.findElement(Hobbies).click();
	 }
	 
	 public void selectLanguages(String visibleText) {
		 WebElement dropdown = driver.findElement(Languages);
		 Select select = new Select (dropdown);
		 select.selectByVisibleText(visibleText);}
		 
	public void selectSkills(String visibleSkills) {
		 WebElement dropdown1 = driver.findElement(Skills);
		 Select select1 = new Select (dropdown1);
		 select1.selectByVisibleText(visibleSkills);}
		  
	 public void selectCountrys(String visibleCountry) {
		 WebElement dropdown = driver.findElement(Country);
		 Select select2 = new Select (dropdown);
		 select2.selectByVisibleText(visibleCountry);}
	 
	 public void DOB(String day, String month, String year) {
		 driver.findElement(dobday).sendKeys("29");
		 driver.findElement(dobmonth).sendKeys("09");
		 driver.findElement(dobyear).sendKeys("1997");}
	 
	 public void Password_text(String pass) {
		 driver.findElement(Password).sendKeys("1234");
		 driver.findElement(Comfirm_Password).sendKeys("1234");
	 }
}
