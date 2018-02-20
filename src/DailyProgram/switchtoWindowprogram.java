package DailyProgram;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class switchtoWindowprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='IIT/IIM Jobs']")).click();
		String MainWin=driver.getWindowHandle();
		Set<String> Allwindow=driver.getWindowHandles();
		ArrayList<String> Al=new ArrayList<String>(Allwindow);
		System.out.println(driver.switchTo().window(Al.get(3)).getTitle());
		System.out.println(Allwindow.size());
		for(String oneByoneWindow:Allwindow)
		{
			driver.switchTo().window(oneByoneWindow);
			if(driver.getTitle().equalsIgnoreCase("Jasmin Infotech"))
			{
				driver.close();
			}
			//System.out.println(driver.getTitle());
			//System.out.println(di);
		}
		driver.switchTo().window(MainWin);
		
		
		driver.findElement(By.xpath("//*[@id='mbaJobsBtn']")).click();
		
		WebElement toElement=driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions act=new Actions(driver);
		act.moveToElement(toElement).perform();
		driver.findElement(By.xpath("//a[text()='Browse All Companies']")).click();
		
		
		
		
		

	}

}
