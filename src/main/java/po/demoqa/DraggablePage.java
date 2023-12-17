package po.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggablePage {
    private WebDriver driver;

    public DraggablePage(WebDriver driver) {
        this.driver = driver;
    }
    private static final By draggable = By.xpath("//div[@id='draggable']");
    private static final By droppable = By.xpath("//div[@id='droppable']");

    public void performDragAndDrop() {
        new Actions(driver).dragAndDrop((WebElement) draggable, (WebElement) droppable).build().perform();
    }

    public String getDroppableText() {
        return driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
    }
}

