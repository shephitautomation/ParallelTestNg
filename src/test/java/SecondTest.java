import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class SecondTest extends BaseTest {

    @Test
    public void GOOGLE4() {
        System.out.println("Google4 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + driver.getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google4 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void YANDEX() {
        System.out.println("Yandex Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.yandex.com");
        System.out.println("Yandex Test's Page title is: " + driver.getTitle() +" " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Yandex");
        System.out.println("Yandex Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }
}