package swagLabs;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	WebDriver driver;
	
	@BeforeTest
	
	public void precondition() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	
	public void checkURL() {
		String expectedURL= "https://www.saucedemo.com/";
		String actualURL=driver.getCurrentUrl();
		assertEquals(actualURL,expectedURL);
	}
	
	@Test(priority=1)
	
	public void checkTitle() {
		String expectedTitle = "Swag Labs";
		String actualTitle=driver.getTitle();
		assertEquals(actualTitle,expectedTitle);
	}
		
	@Test(priority=2)	
	public void login1() {
		
		//Positive Test-test data- username:standard_user,password:secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
    
	@Test(priority=3)	
	public void login2() {
		//test data- username:locked_out_user,password:secret_sauce
		driver.navigate().refresh();
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
	@Test(priority=4)
	public void login3() {
		//test data- username: problem_user,password:secret_sauce
		driver.navigate().refresh();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();		
	}
	
	@Test(priority=5)
	public void login4() {
		//test data- username:performance_glitch_user,password:secret_sauce
		driver.navigate().refresh();
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();	
	}
	
	@Test(priority=6)
	public void login5() {
		//test data- username:error_user,password:secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("error_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();	
	}
	
	@Test(priority=7)
	public void login6() {
		//test data- username:visual_user ,password:secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();				
	}	
	
	//Negative test case
	 @Test(priority=8)
		public void login7() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=9)
     public void login8() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("@$%   iuhoEW*()(*)&()&(  879");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     //Negative test case
	 @Test(priority=10)
     public void login9() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=11)
     public void login10() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
			driver.findElement(By.id("password")).sendKeys("247  79   890");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
   //Negative test case
	 @Test(priority=12)
     public void login11() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("problem_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=13)
     public void login12() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("problem_user");
			driver.findElement(By.id("password")).sendKeys("s     y            u");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=14)
     public void login13() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=15)
     public void login14() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
			driver.findElement(By.id("password")).sendKeys("FGFHGGFtuyr563$%");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=16)
     public void login15() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("error_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     //Negative test case
	 @Test(priority=17)
     public void login16() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("error_user");
			driver.findElement(By.id("password")).sendKeys("DEWSA~`123+=   yuhg 56");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
     
   //Negative test case
	 @Test(priority=18)
     public void login17() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("visual_user");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
     
   //Negative test case
	 @Test(priority=19)
     public void login18() {
	        driver.navigate().refresh();
			driver.findElement(By.id("user-name")).sendKeys("visual_user");
			driver.findElement(By.id("password")).sendKeys("ygiduf@#!$ t g  h h");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}
   //Negative test case
	 @Test(priority=20)
     public void login19() {
	        driver.navigate().refresh();
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}  
     //Negative test case
	 @Test(priority=21)
     public void login20() {
	        driver.navigate().refresh();
	        driver.findElement(By.id("user-name")).sendKeys("~!#@$@%$#@%$ DSADFA   &^*^%*hjugfuguks   ^&*(&^( 5632487547823*(*(    %$#{}\"|:?>");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		}  
     
     //Negative test case
	 @Test(priority=22)
     public void login21() {
	        driver.navigate().refresh();
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		} 
	
     //Negative test case
	 @Test(priority=23)
     public void login22() {
	        driver.navigate().refresh();
	        driver.findElement(By.id("user-name")).sendKeys("!#@$@%$#@%$ DSADFA   &^*^%*hjugfuguks   ^&*(&^( 5632487547823*(*(    %$#{}\"|:?>");
			driver.findElement(By.id("password")).sendKeys("667   FHfyvhdj  !@#$@$%$#%(*()){]][;|?/\\<>YU    uo  uouh  hjlijl625876524  ");
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		} 
	 
	 @AfterTest
     public void Loginendtest() {
    	 driver.quit();
     }
}
