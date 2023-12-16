package po.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static base.driver.DriverInit.getDriver;

public class DraggablePage {
    private WebDriver driver;

    public DraggablePage(WebDriver driver) {
        this.driver = driver;
    }
    @BeforeMethod
    public void navigateToDraggablePage() {
        getDriver().get("https://demoqa.com/droppable");
    }
    private static final By draggable = By.xpath("//div[@id='draggable']");
    private static final By droppable = By.xpath("//div[@id='droppable']");

    public void performDragAndDrop() {
        new Actions(driver).dragAndDrop((WebElement) draggable, (WebElement) droppable).build().perform();
    }

    public String getDroppableText() {
        return driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
    }

    @AfterMethod
    void tearDown() {}
}

