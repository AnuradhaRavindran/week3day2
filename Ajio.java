package week3.day2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.ajio.com/");
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
	    WebElement search = driver.findElement(By.name("searchVal"));
	    search.sendKeys("bags",Keys.ENTER);
	   // driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	    //driver.findElement(By.id("Men")).click();
	    driver.findElement(By.xpath("//label[@for='Men']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//label[@for='Men']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='Men']")).click();
	    WebElement itemsofbags = driver.findElement(By.xpath("//div[@class='length']"));
	    String text = itemsofbags.getText();
	    System.out.println("Items " + text + "Found");
	    List<WebElement> branditems = driver.findElements(By.xpath("//div[@class='brand']"));
	    System.out.println("Size:"+branditems.size());
	   for (WebElement eachBrandItem : branditems) {
		   String branditems1 = eachBrandItem.getText();
		System.out.println(branditems1);
	}
	   System.out.println("***********************************************************");
	   System.out.println("After removing duplicates from list");
	    Set<String> setbags = new TreeSet<String>();
	    for(int i =0;i<branditems.size();i++)
	    
	    {
	    	WebElement output = branditems.get(i);
	    	String text2 = output.getText();
	    	setbags.add(text2);
	    	
	    }
	    for (String eachbrandName : setbags) {
	    	System.out.println(eachbrandName);
			
		}
	}

}
