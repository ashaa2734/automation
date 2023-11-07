package test;
import java.time.Duration;

import org.testng.annotations.Test;
import basepakage.baseclass;
import pakage.Kkem;
import utilities.Kkemutilities;


@Test
	public class Kkemtest extends baseclass{
	public void kkemlog()throws Exception
	{
		driver.manage().window().maximize();
	Kkem k1=new Kkem(driver);
		
		String xl="D:\\kkem.xlsx";
		String Sheet="Sheet1";
		int rowCount = Kkemutilities.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String email=Kkemutilities.getCellValue(xl, Sheet, i,0);
			System.out.println("email---"+email);
			String password=Kkemutilities.getCellValue(xl, Sheet, i,1);
			System.out.println("password---"+password);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	    k1.setvalues(email, password);
		k1.login();	
		k1.element();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
		
	}
		
	}
	
	
	

