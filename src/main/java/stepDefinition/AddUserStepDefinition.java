package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddUserStepDefinition extends Xpath_locators{
	
	WebDriver driver;
	String addUser = "newuser";
	String deleteUser= "novak";
	
	@Given("^User is present on test page$")
		public void User_is_present_on_test_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		driver =  new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	@When("^Title of test page is Protractor practice website - WebTable$")
	public void title_of_test_page_is_Protractor_practice_website_WebTable() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
		
	    //throw new PendingException();
		
	}

	@Then("^Add a user$")
	public void add_a_user()  {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(addUserButton)).click();
		driver.findElement(By.xpath(firstName)).sendKeys("Sharif");
		driver.findElement(By.xpath(lastName)).sendKeys("uddin");
		driver.findElement(By.xpath(userName)).sendKeys(addUser);
		driver.findElement(By.xpath(newUserPassword)).sendKeys("111");
		driver.findElement(By.xpath(customerTypeButton)).click();
		WebElement element=driver.findElement(By.xpath(roleDropdown));
		
		Select sel = new Select(element);
		sel.selectByVisibleText("Admin");
		driver.findElement(By.xpath(userEmail)).sendKeys("email@email.com");
		driver.findElement(By.xpath(userPhone)).sendKeys("555666334");
		driver.findElement(By.xpath(addingNewUserBtn)).click();


		
	    //throw new PendingException();
	}

	@Then("^Validate the user has been added to the table$")
	public void validate_the_user_has_been_added_to_the_table() {
	    // Write code here that turns the phrase above into concrete actions
		String validateUser = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[3]")).getText();
		System.out.println("New user added and the user name is: "+validateUser);
		
		//boolean ans = (validateUser==addUser);
		//System.out.println(ans);
		boolean val=driver.getPageSource().contains(addUser);
		if (val==true) {
			System.out.println("validated");
		}
		else {
			System.out.println("User has not been added");
		}
	
	}
	@Then("^delte user novak$")
	public void delte_user_novak() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean deleteNovak = driver.getPageSource().contains(deleteUser);
		Thread.sleep(5000);
		if(deleteNovak==true) {
			driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[11]/button/i")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();//confirm 
		}
	    //throw new PendingException();
	}

	@Then("^validate the user novak deleted$")
	public void validate_the_user_novak_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean deleteNovakValidate = driver.getPageSource().contains(deleteUser);
		if (deleteNovakValidate==true) {
			System.out.println(deleteUser+" has not been deleted.");
		}
		else {
			System.out.println(deleteUser+ " has been deleted.");
		}
	    //throw new PendingException();
	}



	
	
	

}
