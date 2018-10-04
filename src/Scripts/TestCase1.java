package Scripts;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Generic.Auto_constant;
import Generic.Baseclass;
import Generic.Excel;
import Pom.Login;
import Pom.Home;

public class TestCase1 extends Baseclass{
	
	
	@Test
	public void Login() throws InterruptedException{
		String us=Excel.abc(excelpath,"Sheet1",2,3);
		String pass=Excel.abc(excelpath,"Sheet1",3,3);
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.voonik.com");
		Login s=new Login(driver);
		s.login();
		Thread.sleep(2000);
		s.username(us);
		Thread.sleep(2000);
		s.password(pass);
		Thread.sleep(2000);
		System.out.println(us);
		System.out.println(pass);
		
		s.submit();
		

	}
}

