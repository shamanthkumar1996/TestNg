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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic.Auto_constant;
import Generic.Baseclass;
import Generic.Excel;
import Pom.Login;

import Pom.Home;


public class TestCase4 extends Baseclass{
	/*static{
		System.setProperty(key,value);
	}*/
	//public static void main(String[] args) throws InterruptedException{
	@Test
	public void style() throws InterruptedException{
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
		Thread.sleep(2000);
		
		Home p=new Home(driver);
		Actions a1=new Actions(driver);
		/*p. blogging();
		Thread.sleep(2000);
		p.mdia();
		p.oldpost();
		WebElement t=p.beauty();
		a1.moveToElement(t).perform();
		a1.doubleClick(t).perform();*/
	p.prefer();
	p.femalee();


        

	}

}
