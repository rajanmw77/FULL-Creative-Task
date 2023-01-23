import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://trello.com/home");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Log in')])[1]")).click();
		
		WebElement userName = driver.findElement(By.id("user"));
		userName.sendKeys("rajanmw77@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rajan@13",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		Actions act = new Actions(driver);
		WebElement createClk = driver.findElement(By.xpath("//p[@class='uJFM1WfH-EGEiT']"));
		act.moveToElement(createClk).click().perform();
		
		WebElement createBoardClk = driver.findElement(By.xpath("//button[@class='R2Zt2qKgQJtkYY']"));
		act.moveToElement(createBoardClk).click().perform();
		
		WebElement boardName = driver.findElement(By.xpath("//input[@type='text']"));
		boardName.sendKeys("Task");
		
		
//		WebElement visib = driver.findElement(By.xpath("(//div[@class='J+c2IiaNOYgZBB css-ufz0vj-control'])[2]"));
//		act.moveToElement(visib).click().perform();
//		Thread.sleep(3000);
		
//		Select s = new Select(visib);
//		s.selectByValue(")
//		WebElement publicClk = driver.findElement(By.xpath("//div[@class=' css-1og2rpm']"));
//		act.moveToElement(publicClk);
//		
//		Thread.sleep(3000);
//		
//		WebElement publicAlt = driver.findElement(By.id("//button[contains(text(),'Yes, make board public')]"));
//		act.moveToElement(publicAlt).click().perform();
		
		WebElement submitClk = driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
		act.moveToElement(submitClk).click().perform();
		
		WebElement crList = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		crList.sendKeys("List A");
		WebElement crListClk = driver.findElement(By.xpath("//input[@value='Add list']"));
		act.moveToElement(crListClk).click().perform();
		
		WebElement crList1 = driver.findElement(By.xpath("//input[@class='list-name-input']"));
		crList1.sendKeys("List B");
		WebElement crListClk1 = driver.findElement(By.xpath("//input[@value='Add list']"));
		act.moveToElement(crListClk1).click().perform();
		
		WebElement addCardClk = driver.findElement(By.xpath("//span[@class='js-add-a-card']"));
		act.moveToElement(addCardClk).click().perform();
		
		WebElement addCard = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		addCard.sendKeys("JAVA");
		
		WebElement addCardClk1 = driver.findElement(By.xpath("//input[@value='Add card']"));
		act.moveToElement(addCardClk1).click().perform();
		
		WebElement addCard1 = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
		addCard1.sendKeys("SELENIUM",Keys.ENTER);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//span[contains(text(),'SELENIUM')]"));
		WebElement dest = driver.findElement(By.xpath("(//div[@class='list-header-target js-editing-target'])[2]"));
		act.dragAndDrop(source, dest).perform();
		
	}

}
