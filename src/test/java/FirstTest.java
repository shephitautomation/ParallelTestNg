import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void GOOGLE1() {
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + driver.getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE2() {
        System.out.println("Google2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + driver.getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE3() {
        System.out.println("Google3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + driver.getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE5() {
        System.out.println("Google5 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google5 Test's Page title is: " + driver.getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google5 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }


}
