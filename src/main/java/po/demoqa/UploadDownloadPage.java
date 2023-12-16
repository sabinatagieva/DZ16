package po.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import static base.driver.DriverInit.getDriver;

public class UploadDownloadPage {
    private WebDriver driver;

    public UploadDownloadPage(WebDriver driver) {
        this.driver = driver;
    }
    @BeforeMethod
    public void navigateToUploadDownloadPage() {
        getDriver().get("https://demoqa.com/upload-download");
    }

    public void uploadFile(String filePath) {
        driver.findElement(By.id("uploadFile")).sendKeys(filePath);
    }

    public String getUploadedFileName() {
        return driver.findElement(By.id("uploadedFilePath")).getText();
    }
}

