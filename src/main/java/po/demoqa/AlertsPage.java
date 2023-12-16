package po.demoqa;

import base.methods.BaseMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static base.driver.DriverInit.getDriver;

public class AlertsPage extends BaseMethods {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        super();
    }

    @BeforeMethod
    public void setUp() {
        getDriver().get("https://demoqa.com/alerts");
    }
    private static final By element = By.xpath("//button[@id='alertButton']");
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }
    @AfterMethod
    void tearDown() {}

    public void element() {
    }
}
