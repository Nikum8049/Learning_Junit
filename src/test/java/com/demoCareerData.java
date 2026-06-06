package com;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;
import util.DriverConnectJunit;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class demoCareerData {
    String drppro;
    String name;
    String mono;
    String email;
    String drpcountry;
    String sub;
    String dep;
    String message;


    public demoCareerData(String drppro, String name, String mono, String email, String drpcountry,String sub,String dep, String message) {
        this.drppro = drppro;
        this.name = name;
        this.mono = mono;
        this.email = email;
        this.drpcountry = drpcountry;
        this.sub= sub;
        this.dep=dep;
        this.message=message;
    }

    static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        driver = DriverConnectJunit.connect("https://aviraltrendzpvtltd.com/internship-in-it-company/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }

    @Test
    public void careerdata()
    {
        WebElement title = driver.findElement(By.name("title"));

        WebElement name1 = driver.findElement(By.name("your-name"));
        WebElement  mono1= driver.findElement(By.name("phone"));
        WebElement email1 = driver.findElement(By.name("email"));
        WebElement country = driver.findElement(By.name("location"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@value='"+sub+"']/following-sibling::span[1]"));
        WebElement radio = driver.findElement(By.xpath("//input[@value='"+dep+"']/following-sibling::span[1]"));
        WebElement message1 = driver.findElement(By.xpath("//textarea[@name='message']"));
        WebElement tc= driver.findElement(By.xpath("//input[@type='checkbox' and @name='terms']//following-sibling::span[1]"));
        WebElement submit= driver.findElement(By.xpath("//input[@value='Submit message']"));
        new Select(title).selectByVisibleText(drppro);
        name1.clear();
        name1.sendKeys(name);
        mono1.clear();
        mono1.sendKeys(mono);
        email1.clear();
        email1.sendKeys(email);
        new Select(country).selectByVisibleText(drpcountry);
        checkbox.click();
        radio.click();
        message1.clear();
        message1.sendKeys(message);
        tc.click();
        submit.click();
        driver.navigate().refresh();
    }

    @Parameterized.Parameters
    public static List<Object[]> setData()
    {
        Object obj[][] = new Object[5][8];  //first[] is for column second [] is form row
        obj[0][0] = "Dr";
        obj[0][1] = "Kamlesh";
        obj[0][2] = "7865956324";
        obj[0][3] = "kamlesh@gmail.com";
        obj[0][4] = "India";
        obj[0][5] = "MySQL";
        obj[0][6] = "CRM";
        obj[0][7] = "My Name is Kamlesh.I'm From India. My Subject is MySQL. My Department CRM";

        obj[1][0] = "Miss";
        obj[1][1] = "Jhanvi";
        obj[1][2] = "8885956324";
        obj[1][3] = "jhanvi@gmail.com";
        obj[1][4] = "China";
        obj[1][5] = "HTML";
        obj[1][6] = "Support";
        obj[1][7] = "My Name is Jhanvi.I'm From China. My Subject is HTML. My Department Support";

        obj[2][0] = "Mr";
        obj[2][1] = "Tejas";
        obj[2][2] = "9995956324";
        obj[2][3] = "tadvi@gmail.com";
        obj[2][4] = "Australia";
        obj[2][5] = "Wordpress";
        obj[2][6] = "Logistics";
        obj[2][7] = "My Name is Tejas.I'm From Australia. My Subject is Wordpress. My Department Logistics";

        obj[3][0] = "Ms";
        obj[3][1] = "Kavya";
        obj[3][2] = "22225956324";
        obj[3][3] = "kavya@gmail.com";
        obj[3][4] = "European Union";
        obj[3][5] = "PHP";
        obj[3][6] = "Sales";
        obj[3][7] = "My Name is Kavya.I'm From European Union. My Subject is PHP. My Department Sales";

        obj[4][0] = "Mrs";
        obj[4][1] = "Shilpa";
        obj[4][2] = "3335956324";
        obj[4][3] = "shilpa@gmail.com";
        obj[4][4] = "United Kingdom";
        obj[4][5] = "CSS/JS";
        obj[4][6] = "IT";
        obj[4][7] = "My Name is Shilpa.I'm United Kingdom. My Subject is CSS/JS. My Department IT";

        return Arrays.asList(obj);
    }
}
