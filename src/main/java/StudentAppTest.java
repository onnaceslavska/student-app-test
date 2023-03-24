import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class StudentAppTest {
    @Test
    public void openStudentApp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver() = new ChromeDriver(options);
        driver.get("http://acodemystudentapp-env.eba-d2vctp4d.eu-north-1.elasticbeanstalk.com/");
        driver.findElement(By.xpath("//div[@class='ant-table-title']//button")).click();
        driver.close();
        driver.quit();
    }



}

