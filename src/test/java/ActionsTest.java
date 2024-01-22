import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static base.driver.DriverInit.getDriver;
import static js.JavaScriptMethods.jsClick;

public class ActionsTest extends BaseTest {

    @Test
    void frameTestInside() {
        getDriver().get("https://demoqa.com/frames");

        WebElement frame = getDriver().findElement(By.xpath("//iframe[@id='frame1']"));
        getDriver().switchTo().frame(frame);

        String str = getDriver().findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println(str);

        getDriver().switchTo().defaultContent();

        String str2 = getDriver().findElement(By.xpath("//div[@id='framesWrapper']/div")).getText();
        System.out.println(str2);
    }

    @Test
    void submitAlerts() {
        getDriver().get("https://demoqa.com/alerts");
        WebElement element = getDriver().findElement(By.xpath("//button[@id='alertButton']"));
        jsClick(element);

        getDriver().switchTo().alert().accept();
    }

    @Test
    void dragAndDropTest() {
        getDriver().get("https://demoqa.com/droppable");
        WebElement draggable = getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = getDriver().findElement(By.xpath("//div[@id='droppable']"));

        new Actions(getDriver()).dragAndDrop(draggable, droppable).build().perform();
    }

    @Test
    void contextAndClickTest() {
        getDriver().get("https://demoqa.com/buttons");
        WebElement context = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement doubleClick = getDriver().findElement(By.xpath("//button[@id='doubleClickBtn']"));

        new Actions(getDriver()).doubleClick(doubleClick).build().perform();
        new Actions(getDriver()).moveToElement(context).build().perform();
    }

    @Test
    void uploadFile() {
        getDriver().get("https://demoqa.com/upload-download");
        getDriver().findElement(By.xpath("//input[@id='uploadFile']"))
                .sendKeys("D:\\Project\\AutoTest\\src\\file");
    }
}

