package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);

driver.navigate().to("https://www.amazon.in/Prithi-Homes-Kitchen-Stainless-Cleaning/dp/B0B1HD7D18/ref=sr_1_9?crid=2BO0GHFDCXKLG&keywords=feeding+bottle+for+new+born+baby&qid=1681294834&sprefix=feeding+bott%2Caps%2C588&sr=8-9");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();

driver.navigate().to("https://www.amazon.in/cart/smart-wagon?newItems=87925b37-ba30-4c29-9101-f12bdc0c8e7c,1");
WebElement qty = driver.findElement(By.id("a-autoid-0-announce"));
qty.click();
WebElement dty = driver.findElement(By.id("quantity_10"));
dty.click();

WebElement update = driver.findElement(By.id("a-autoid-1-announce"));
update.click();

driver.navigate().to("https://www.amazon.in/cart/smart-wagon?newItems=87925b37-ba30-4c29-9101-f12bdc0c8e7c,1");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();


}
}