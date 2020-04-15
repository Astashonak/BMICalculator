import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BMICalculatorTest {
    @Test
    public void starvationCategory(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("14");
        driver.findElement(By.name("ht")).sendKeys("100");
        driver.findElement(By.name("cc")).click();
        String starvationcategory = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(starvationcategory, "Your category is Starvation",
                "не совпадает" );
        driver.quit();
    }
    @Test
    public void underweightCategory(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("42");
        driver.findElement(By.name("ht")).sendKeys("155");
        driver.findElement(By.name("cc")).click();
        String underweightcategory = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(underweightcategory, "Your category is Underweight",
                "не совпадает" );
        driver.quit();
    }
    @Test
    public void normalCategory(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("82");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        String normalcategory = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normalcategory, "Your category is Normal",
                "не совпадает" );
        driver.quit();
    }
    @Test
    public void overweightCategory(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("86.7");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String overweightcategory = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(overweightcategory, "Your category is Overweight",
                "не совпадает" );
        driver.quit();
    }
    @Test
    public void obeseCategory(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("105");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String obesecategory = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(obesecategory, "Your category is Obese",
                "не совпадает" );
        driver.quit();
    }
//    @Test
//    public void inchesToCentimeters(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://healthunify.com/bmicalculator/");
//        WebElement selectBox = driver.findElement(By.name("opt2"));
//        Select selectOne = new Select(selectBox);
//        selectOne.selectByValue("2");
//        WebElement selectNextBox = driver.findElement(By.name("opt3"));
//        Select selectTwo = new Select(selectNextBox);
//        selectTwo.selectByValue("4");
//        String Centimeters = driver.findElement(By.name("ht")).getText();
//        Assert.assertEquals(Centimeters, "71", "перевод в сантиметры не правильный");
//        driver.quit();
//    }
}
