package pages;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CreateAccountPage {

	WebDriver driver;
	
	//initialization of Web elements
	By buttonSignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By emailCreate = By.id("email_create");
	By submitButton = By.id("SubmitCreate");
	By radio2 = By.id("id_gender2");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By pass = By.id("passwd");
	By address = By.id("address1");
	By city = By.id("city");
	By postcode = By.xpath("//input[@id='postcode']");
    By phoneMobile = By.xpath("//input[@id='phone_mobile']");
	By registerButton = By.xpath(" //*[@id=\"submitAccount\"]/span");
	
	
	
	//constructor
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//click on SingIn on the right side of header
	public void clickSignIn() {
		driver.findElement(buttonSignIn).click();
	}
			
	// assertion that user is on HomePage
	public void assertionHomePage() {
		String getActualTitle = driver.getTitle();				
		String ExpectedTitle = "My Store";
		Assert.assertEquals(getActualTitle, ExpectedTitle);
		System.out.println("***Assert 1 passed***");
		System.out.println(getActualTitle);

//		boolean goIma = driver.getPageSource().contains("Your order on My Store is complete.");
//		System.out.println(goIma);
	}
	
	//Random Email generator
	public void enterRandomEmail()
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(emailCreate).sendKeys("useruser987678"+ randomInt +"@gmail.com");
	}
	
	//Click on SubmitBTN
	public void clickSubmit()
	{
		driver.findElement(submitButton).click();
	}
	
	//Assertion that user is on Create Account Page
	public void assertionCreateAccountPage() {
		
		String getActualTitle = driver.getTitle();		
		String ExpectedTitle = "Login - My Store";		
		Assert.assertEquals(getActualTitle, ExpectedTitle);
		System.out.println("***Assert 2 passed***");
		System.out.println(getActualTitle);

	}

	//check Radio BTN
	public void checkRadio()
	{
		driver.findElement(radio2).click();
	}
	
	//Enter First Name
	public void enterFirstName(String imeto)
	{
		driver.findElement(firstName).sendKeys(imeto);
	}
	
	//Enter Last Name
	public void enterLastName(String prezimeto)
	{
		driver.findElement(lastName).sendKeys(prezimeto);
	}
	
	//Enter password
	public void enterPassword(String passwordo)
	{
		driver.findElement(pass).sendKeys(passwordo);
	}
	
	// Select day of Birth
	public void choseDay(int den)
	{
		Select days = new Select(driver.findElement(By.name("days")));
		days.selectByIndex(den);
		
	}
	
	//Select month
	public void choseMonth(int mesec)
	{
		Select month = new Select(driver.findElement(By.name("months")));
		month.selectByIndex(mesec);
		
	}
	
	//Select Year of birth
	public void choseYear(int godina)
	{
		Select year = new Select(driver.findElement(By.name("years")));
		year.selectByIndex(godina);
		
	}
	
	//Enter Address
	public void enterAddress(String adresata)
	{
		driver.findElement(address).sendKeys(adresata);
	}
	
	//Enter City 
	public void enterCity(String grad)
	{
		driver.findElement(city).sendKeys(grad);
	}
	
	//Select State from dropdown list
	public void choseState(int drzava)
	{
		Select state = new Select(driver.findElement(By.name("id_state")));
		state.selectByIndex(drzava);
		
	}
	
	//Enter postcode
	public void enterPostcode(String postenski)
	{
		driver.findElement(postcode).sendKeys(postenski);
	}
	
	//Enter phone number
	public void enterPhone(String telefon)
	{
		driver.findElement(phoneMobile).sendKeys(telefon);
	}
	
	//Click on register BTN
	public void clickRegisterButton()
	{
		driver.findElement(registerButton).click();
	}
	
	// assertion validating that account is succesfuly created
	public void assertionAccountCreated() {
		String getActualTitle = driver.getTitle();		
		String ExpectedTitle = "My account - My Store";
		Assert.assertEquals(getActualTitle, ExpectedTitle);
		System.out.println("***Assert 3 passed***");
		System.out.println(getActualTitle);

//		boolean goIma = driver.getPageSource().contains("Your order on My Store is complete.");
//		System.out.println(goIma);
	}
	
	public void populateMandatory() {
		checkRadio();
		enterFirstName("Aleksandar");
		enterLastName("Gacoski");
		enterPassword("Testing123");
		choseDay(3);
		choseMonth(5);
		choseYear(15);
		enterAddress("UlicaBrestova13");
		enterCity("Bitola");
		choseState(4);
		enterPostcode("12345");
		enterPhone("879838383");
	}
	
	
}
