package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Products {
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
	}
	
	@Test(priority=0)
	public void products1() {
		driver.findElement(By.id("react-burger-menu-btn")).click();//clicking three lines to view sidebar
		
	}
	
	@Test(priority=1)
	public void products2() {
		//all items option
		driver.findElement(By.id("inventory_sidebar_link")).click();
	}
	
	@Test(priority=2)
	public void products3(){
		//about option
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
	}	
	
	@Test(priority=3)
	public void products4(){
		//reset 
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]")).click();
	}	
	
	public void products5() {
		//closing sidebar by clicking cross logo
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-cross-btn\"]")).click();
	}
	@Test(priority=4)
	public void products6(){
		//logout option
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
	@Test(priority=5)
    public void products7() {
    	//clicking add to cart logo of "Sauce Labs Backpack"
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
	@Test(priority=6)
    public void products8() {
    	//clicking name and image of "Sauce Labs Backpack" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=7)
    public void products9() {
    	//clicking add to cart logo of "Sauce Labs Bike Light"
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }
	
	@Test(priority=8)
    public void products10() {
    	//clicking name and image of "Sauce Labs Bike Light" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=9)
    public void products11() {
    	//clicking add to cart logo of "Sauce Labs Bolt T-Shirt"
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    }
	
	@Test(priority=10)
    public void products12() {
    	//clicking name and image of "Sauce Labs Bolt T-Shirt" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=11)
    public void products13() {
    	//clicking add to cart logo of "Sauce Labs Fleece Jacket"
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }
	
	@Test(priority=13)
    public void products14() {
    	//clicking name and image of "Sauce Labs Fleece Jacket" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=14)
    public void products15() {
    	//clicking add to cart logo of "Sauce Labs Onesie"
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    }
	
	@Test(priority=15)
    public void products16() {
    	//clicking name and image of "Sauce Labs Onesie" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=16)
    public void products17() {
    	//clicking add to cart logo of "T-Shirt (Red)"
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    }
	
	@Test(priority=17)
    public void products18() {
    	//clicking name and image of "T-Shirt (Red)" to view the product in details
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=18)
    public void products19() {
    	//clicking filter dropdown menu
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span")).click();
		//clicking Name(A to Z) filter
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[1]")).click();
		//clicking Name(Z to A) filter
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[2]")).click();
		//clicking Price(low to high) filter
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[3]")).click();
		//clicking Price(high to low) filter
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[4]")).click();
    }
	
	@AfterTest
	public void productsEndtest() {
	
		driver.quit();
	}	
	

}
