package first_selTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdobeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://express.adobe.com/express-apps/animate-from-audio/?testSessionExpiration");
		driver.findElement(By.className("feds-login-text")).click();
		driver.manage().window().maximize();
		
		////Login With Face book ID
		driver.findElement(By.xpath("//a[@data-id='EmailPage-FacebookSignInButton']")).click();
		driver.findElement(By.id("email")).sendKeys("prx1255@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Adobe@261123");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//div[@id='outer-Jamie']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Background']")).click();
		driver.findElement(By.xpath("//div[@id='outer-Mountains']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Size']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("outer-Landscape-1.97:1")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("record-audio-component-button-toggle")).click();
		driver.findElement(By.className("Profile-thumbnail")).click();
		driver.findElement(By.className("Profile-header-cta")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.className("spectrum-Heading3 get-help-title"));
		driver.findElement(By.xpath("//a[@class=\"Profile-thumbnail\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=\"Sign Out\"]")).click();
		//div[text()="Sign Out"]
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='spectrum-Button_e2d99e is-hovered_e2d99e spectrum-button']//span[@class='spectrum-Button-label_e2d99e'][normalize-space()='Explore']")).click();
		
		//FileDrop
		//driver.findElement(By.id("file-drop-zone-browse-link")).click();
		
		
		//Slider
		//driver.findElement(By.id("_spectrum-Slider-handle_48d11")).sendKeys("150");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.findElement(By.xpath("//button[normalize-space()='Refresh']")).click();
		//Thread.sleep(120000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//span [text()='Next']")).click();
		
		
		
		/////Login with Adobe ID
		
		//driver.findElement(By.id("EmailPage-EmailField")).sendKeys("jon41686@adobe.com");
		//driver.findElement(By.className("spectrum-Button-label")).click();
		//driver.findElement(By.id("input43")).sendKeys("jon41686@adobe.com");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='Next']")).click();
	    //Thread.sleep(3000);
		//driver.findElement(By.id("input59")).sendKeys("iosExpress@123456");
		//driver.findElement(By.xpath("//input[@value='Verify']")).click();
		
		//driver.findElement(By.xpath("//div[@data-se='okta_verify-push']//a[@class='button select-factor link-button'][normalize-space()='Select']")).click();
		
		
		////Login with Google ID
		
		//driver.findElement(By.id("Signup-GoogleButton")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("shubhamknaik53@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}

	
	
}
