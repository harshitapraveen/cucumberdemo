package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.sjavac.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automationsteps {
	public WebDriver driver;
	
	//Examplesteps
	
	@Given("^user navigates to the Pharmeasy website$")
	public void user_navigates_to_the_Pharmeasy_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	      driver = new ChromeDriver(); 
	      driver.navigate().to("https://pharmeasy.in/"); 
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("^user clicks on select pincode$")
	public void user_clicks_on_select_pincode()  {
	    driver.findElement(By.xpath("//div[@title='Select Pincode']")).click();
	}

	@When("^User enter the pincode as \"([^\"]*)\" and clicks on check$")
	public void user_enter_the_pincode_as_and_clicks_on_check(String arg1) throws Exception 
	{
	   driver.findElement(By.xpath("//input[@placeholder='Enter PIN Code']")).sendKeys(arg1);
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//button[text()='Check']")).click();
	   Thread.sleep(2000);
	}

	@Then("^user will be displayed with the medical products$")
	public void user_will_be_displayed_with_the_medical_products() throws Throwable {
		WebElement logo=driver.findElement(By.xpath("//img[@alt='PharmEasy logo']"));
		Assert.assertTrue("Verify wether the pharmeasy logo is being displayed",logo.isDisplayed());
		
		//img[@alt='PharmEasy logo']
	}
	
	@When("^user clicks on HealthCare products$")
	public void user_clicks_on_HealthCare_products() {
	   driver.findElement(By.xpath("//a[text()='Healthcare Products' and @href='/health-wellness?src=homecard']")).click();
	    //	    driver.findElement(By.xpath("(//*[text()='Healthcare Products'])[2]")).click();
	 //   (//a[text()='Healthcare Products'])[2]
	    
	}

	@When("^clicks on Personal Care$")
	public void clicks_on_Personal_Care() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@class='_3nEAy' and @href='/health-care/personal-care-44']")).click();
	    Thread.sleep(5000);
	}

	@Then("^the Personal Care products will be displayed$")
	public void the_Personal_Care_products_will_be_displayed() throws Throwable {
	    WebElement personalcare =driver.findElement(By.xpath("//div[text()='Personal Care']"));
	    Assert.assertTrue("Verify wether the personal care products page is displayed",personalcare.isDisplayed());
	   System.out.println(personalcare.getText());
		
	}


     @When("^clicked on sort and selects low to high$")
     public void clicked_on_sort_and_selects_low_to_high() throws Throwable {
     //driver.findElement(By.xpath("//*[@class='css-17f04i8-indicatorContainer']")).click();
     driver.findElement(By.xpath("//*[text()='Popularity']")).click();
     driver.findElement(By.xpath("//*[text()='Price low to high']")).click();
     //lowtohigh.selectByIndex(1);
     //driver.findElement(By.xpath("//*[@class='css-17lmhlp-singleValue']")).click();
     Thread.sleep(3000);
     //driver.findElement(By.xpath("//*[@class='_2FE4Z _2Jc-Z _2Jc-Z _1UAyE _3LBfS']")).click();
     }

     @Then("^the products should be displayed in a sorted manner$")
     public void the_products_should_be_displayed_in_a_sorted_manner() throws Throwable {
    
     }

	
	@When("^clicked on the required medicine and clicks adds it to cart$")
	public void clicked_on_the_required_medicine_and_clicks_adds_it_to_cart() throws Throwable {
	    driver.findElement(By.xpath("(//*[@class='_1ceZh'])[1]")).click();
	    	    Thread.sleep(3000);
	   // driver.findElement(By.xpath("//*[text()='Add To Cart']")).click();
	    //Thread.sleep(5000);
	   // driver.close();
	}
	@When("^selects quantity and clicks on the cart$")
	public void selects_quantity_and_clicks_on_the_cart() throws Throwable {
	   driver.findElement(By.xpath("//*[text()='Add To Cart']")).click();
	    driver.findElement(By.xpath("//*[@class='_7S2fq']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='lbgdE _32Xuq']")).click();
	   //driver.findElement(By.xpath("(//*[@class='_2tdEn _3gYvk'])[2]")).click();
	    Thread.sleep(3000);
	    
	}

	@Then("^the cart will be displayed with the added products$")
	public void the_cart_will_be_displayed_with_the_added_products() throws Throwable {
	   WebElement product= driver.findElement(By.xpath("//*[text()='Digene Ultra Fizz Lemon Flavour Sachet Of 6.25gm Powder']"));
	   Assert.assertTrue("Verify wether the item is present in the card", product.isDisplayed());
	   System.out.println(product.getText());
	   driver.close();
	}
	//*[text()='Abzorb Anit Fungal Powder - 100 Gm']
	//*[@class='lbgdE _32Xuq']
	//*[@class='css-1hwfws3']



///LoginSteps


@Given("^user navigates to the desired webpage$")
public void user_navigates_to_the_desired_webpage() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
    driver = new ChromeDriver(); 
    driver.navigate().to("https://www.amazon.in/"); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}

@When("^user clicks on bestsellers$")
public void user_clicks_on_bestsellers() throws Throwable {
 driver.findElement(By.xpath("//*[text()='Best Sellers']")).click();
 Thread.sleep(5000);
}

@Then("^the Bestsellers items should be displayed$")
public void the_Bestsellers_items_should_be_displayed() throws Throwable {
	WebElement bestseller=driver.findElement(By.xpath("//*[text()='Amazon Bestsellers']"));
	Assert.assertTrue("Verify the bestsellers page is being displayed", bestseller.isDisplayed());
	System.out.println(bestseller.getText());
	//*[text()='Amazon Bestsellers']
}

@When("^user clicks on the required item$")
public void user_clicks_on_the_required_item() throws Throwable {
	driver.findElement(By.xpath("//div[text()='Ikigai: The Japanese secret to a long and happy life']")).click();;
	Thread.sleep(2000);
}

@When("^clicks on add to cart$")
public void clicks_on_add_to_cart() throws Throwable {
	driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
	driver.findElement(By.xpath("//*[@id='hlb-view-cart-announce']")).click();
	//input[@name='submit.add-to-cart']
	Thread.sleep(3000);

}

@Then("^the item will be displayed in the cart$")
public void the_item_will_be_displayed_in_the_cart() throws Throwable {
	//WebElement item=driver.findElement(By.xpath("//*[@class='a-size-medium sc-product-title a-text-bold']"));
	//Assert.assertTrue("Verify wether item is present in cart",item.isDisplayed());
	//System.out.println(item.getText());
	driver.close();
}

	//*[@class='a-size-medium sc-product-title a-text-bold']

}

//*[text()='Sort' and @class='rcjnH']--sort
//*[@value='price:0' and @class='jss190']--low to high
//*[@class='_2FE4Z _2Jc-Z _2Jc-Z _1UAyE _3LBfS']--apply







