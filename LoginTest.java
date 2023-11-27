package com.vuealfasoftware.webapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginTest {

    public void amazon(){
        System.setProperty("webdriver.chorme.driver", "src/main/reources/chormedriver.exe");
        WebDriver chormeDriver=new ChromeDriver();
        chormeDriver.manage().window().maximize();

        chormeDriver.get("https://www.amazon.com/");

        WebElement inputAdresi= chormeDriver.findElement(By.id("twotabsearchtextbox"));

        inputAdresi.sendKeys("laptop");

        inputAdresi.submit();

        WebElement firstProductName= chormeDriver.findElement(By.className("a-size-mini"));
        WebElement firstProductPrice = chormeDriver.findElement(By.className("a-price"));

        System.out.println("İlk ürün adı: " + firstProductName.getText());
        System.out.println("İlk ürün fiyatı: " + firstProductPrice.getText());

        chormeDriver.get("https://www.amazon.com/Azulle-1080p-Full-Webcam-Cancelling/dp/B081D5TM4Q/ref=sr_1_1_sspa?keywords=laptop&qid=1701080330&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");




    }

}
