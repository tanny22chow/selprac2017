package pckage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
static WebDriver d;
@Test
public static void open_browser()throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM LEARNING\\DRIVERS\\chromedriver.exe");
	d=new ChromeDriver();
		d.get("https://www.google.com"); 
		d.manage().window().maximize();	
	System.out.println("first");
}
}
