package po.demoqa;

import base.methods.BaseMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BaseMethods {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        super();
    }

    private static final By element = By.xpath("//button[@id='alertButton']");
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    public void getElement() {
    }
}