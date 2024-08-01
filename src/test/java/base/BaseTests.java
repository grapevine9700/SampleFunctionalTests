package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTests {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://signinssl.gmarket.co.kr/login/login?url=https%3A%2F%2Fwww.gmarket.co.kr%2F%3Fjaehuid%3D200011415%26cosemkid%3Dgo16896720606128759%26gad_source%3D1%26gclid%3DCjwKCAjwhvi0BhA4EiwAX25uj4pqodtPxC3z3kTCOTxS8iISDb%255FI7s9pykJJxOKFc2%255FFql7F6%252DbYaRoCfK4QAvD%255FBwE%26gate_id%3D37538E9E-94A5-467D-855B-7F4FF7CDE5C2");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
