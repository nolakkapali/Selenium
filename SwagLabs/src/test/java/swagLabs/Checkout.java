package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {
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

	    //yourcart
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		//Checkout
		driver.findElement(By.id("checkout")).click();
		
		
	}
	
	//user info submit with valid input
	@Test(priority=0)
	public void checkout1() {
		driver.findElement(By.id("first-name")).sendKeys("Md.Mamun Anwar");//first name
		driver.findElement(By.id("last-name")).sendKeys("D'Souza Van Hel-sing");//last name
		driver.findElement(By.id("postal-code")).sendKeys("3400");//postal code
		driver.findElement(By.id("continue")).click();

	}
	

	//user info submit with invalid First Name(no input)--Negative test
	@Test(priority=1)
	public void checkout2() {
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.id("last-name")).sendKeys("D'Souza Van Hel-sing");//last name
		driver.findElement(By.id("postal-code")).sendKeys("3400");//postal code
		driver.findElement(By.id("continue")).click();

	}
	
	//user info submit with invalid First Name--Negative test
		@Test(priority=2)
		public void checkout3() {
			driver.navigate().refresh();
			driver.findElement(By.id("first-name")).sendKeys("!~&*^%GFH528735fGghj{}\":><?|_+=");//first name
			driver.findElement(By.id("last-name")).sendKeys("Khan");//last name
			driver.findElement(By.id("postal-code")).sendKeys("1818");//postal code
			driver.findElement(By.id("continue")).click();

		}
	
		//user info submit with invalid Last Name(no input)--Negative test
		@Test(priority=3)
		public void checkout4() {
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.id("first-name")).sendKeys("Md.Mamun Anwar");//first name
			driver.findElement(By.id("postal-code")).sendKeys("1200");//postal code
			driver.findElement(By.id("continue")).click();

		}
		
		//user info submit with invalid Last Name--Negative test
			@Test(priority=4)
			public void checkout5() {
				driver.navigate().refresh();
				driver.findElement(By.id("first-name")).sendKeys("Erin");//first name
				driver.findElement(By.id("last-name")).sendKeys("56234875ETYgu!~!@#$&^*");//last name
				driver.findElement(By.id("postal-code")).sendKeys("2500");//postal code
				driver.findElement(By.id("continue")).click();

			}
			
			//user info submit with invalid Zip/Postal code(no input)--Negative test
			@Test(priority=5)
			public void checkout6() {
				driver.navigate().back();
				driver.navigate().refresh();
				driver.findElement(By.id("first-name")).sendKeys("Anwar");//first name
				driver.findElement(By.id("last-name")).sendKeys("Akhter");//last name
	            driver.findElement(By.id("continue")).click();

			}
			
			//user info submit with invalid Zip/Postal code--Negative test
				@Test(priority=6)
				public void checkout7() {
					driver.navigate().refresh();
					driver.findElement(By.id("first-name")).sendKeys("Rasha");//first name
					driver.findElement(By.id("last-name")).sendKeys("Rahman Khan");//last name
					driver.findElement(By.id("postal-code")).sendKeys("RYYK JCjhkdl!@#~#$@&  (*)+_=-}{}:\"|';><./?");//postal code
					driver.findElement(By.id("continue")).click();

				}	
				
			
			//checkout-Overview page--cancel button
			@Test(priority=7)	
			public void checkout9() {
				driver.findElement(By.id("cancel")).click();
			}
			
			//checkout-Information page--cancel button
			@Test(priority=8)
			public void checkout8() {
				//yourcart
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				//Checkout
				driver.findElement(By.id("checkout")).click();
				//cancel button
				driver.findElement(By.xpath("//button[@id=\"cancel\"]")).click(); 
			}
			
			//checkout-Overview page--finish button
			@Test(priority=9)
			public void checkout10() {
				//Checkout
				driver.findElement(By.id("checkout")).click();
				//input
				driver.findElement(By.id("first-name")).sendKeys("Unaa");//first name
				driver.findElement(By.id("last-name")).sendKeys("Fabiola");//last name
				driver.findElement(By.id("postal-code")).sendKeys("86592436");//postal code
				driver.findElement(By.id("continue")).click();

				driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
			}
			
			//checkout-Complete page--back to home button
			@Test(priority=10)
			public void checkout11() {
		        driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
			}
			
			@AfterTest
			public void endCheckoutTest() {
				driver.quit();
			}
}
