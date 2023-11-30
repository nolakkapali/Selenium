package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class YourCart {
	
	WebDriver driver;
	
	@BeforeTest
	public void precondition() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//username and password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//adding products to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	    //yourcart
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		
		
	}
	
	@Test(priority=0)
    public void yourCart1() {
    	//remove button click for T-Shirt (Red)
    	driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).click();
    }
    
	@Test(priority=1)
    public void yourCart2() {
    	//remove button click for Sauce Labs Onesie
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
    }
    
	@Test(priority=2)
    public void yourCart3() {
    	//remove button click for Sauce Labs Fleece Jacket
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
    }
    
	@Test(priority=3)
	public void yourCart4() {
    	//remove button click for Sauce Labs Bolt T-Shirt
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
    }
    
	@Test(priority=4)
	public void yourCart5() {
    	//remove button click for Sauce Labs Bike Light
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
    }
    
	@Test(priority=5)
    public void yourCart6() {
    	//remove button click for Sauce Labs Backpack
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
    }
    
    
	@Test(priority=6)
    public void yourCart7() {
    	//click checkout button--with no product--Negative Test
    	driver.findElement(By.id("checkout")).click();
    	driver.findElement(By.id("cancel")).click();
    }
	
	@Test(priority=7)
    public void yourCart8() {
    	//click continue shopping button
    	driver.findElement(By.id("continue-shopping")).click();
    }
    
	
	@Test(priority=8)
    public void yourCart9() {
    	//click checkout with a product add
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
    	driver.findElement(By.id("checkout")).click();
    	
    }
	
	
	@AfterTest
    public void yourCartEndtest() {
    	driver.quit();
    }
}
