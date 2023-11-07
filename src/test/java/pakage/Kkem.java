package pakage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Kkem {
	WebDriver driver;
	By Kkememail= By.id("email");
	By Kkempassword=By.id("password");
	By Kkemlogin=By.id("btnLogin");
	
	public Kkem(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(Kkememail).clear();
		driver.findElement(Kkememail).sendKeys(email);
		driver.findElement(Kkempassword).clear();
		driver.findElement(Kkempassword).sendKeys(password);
	}
	public void login()
	{
	driver.findElement(Kkemlogin).click();
	}
	public void element() throws Exception 
	{
		WebElement logoutelement=driver.findElement(By.xpath("//*[@id=\"offcanvasNavbar\"]/div[2]/div/div/a[10]"));
		File src1=logoutelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Scrnshot//Elementsscreenshot1.png"));
		
		
	}
	
	
}
