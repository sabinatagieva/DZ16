package po.demoqa;
import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static base.driver.DriverInit.getDriver;

public class FramePage extends BaseMethods {
    public FramePage(WebDriver driver) {
        super();
    }
    private static final By frame = By.xpath("//iframe[@id='frame1']");
    private static final By headingText = By.xpath("//h1[@id='sampleHeading']");
    private static final By wrapperText = By.xpath("//div[@id='framesWrapper']/div");
    public FramePage searchHeadingText() {
        send(headingText);
        return this;
    }
    public FramePage searchWrapperText() {
        send(wrapperText);
        return this;
    }
    private FramePage quitFrame() {
        getDriver().switchTo().defaultContent();
        return this;
    }


}
