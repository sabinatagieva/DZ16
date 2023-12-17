package po.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadDownloadPage {
    private WebDriver driver;

    public UploadDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(By.id("uploadFile")).sendKeys(filePath);
    }

    public String getUploadedFileName() {
        return driver.findElement(By.id("uploadedFilePath")).getText();
    }
}

