package Scripts;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Auto_constant;
import Generic.Baseclass;
import Pom.Home;

   
public class TestCase5 extends Baseclass {
	/*static{
		System.setProperty(key,value);
	}*/
	//public static void main(String[] args) throws InterruptedException{
         @Test
         public void SelectShoe() throws InterruptedException{
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.voonik.com");
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		Home s1=new Home(driver);
        s1.CasualShoesbt();
        Thread.sleep(4000);
        j.executeScript("window.scrollBy(0,400)");
        
        s1.Favshoebt();
        Thread.sleep(2000);
        s1.Sizebt();
        Thread.sleep(2000);
        
        j.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        s1.Buybt();
        
        

}
}
