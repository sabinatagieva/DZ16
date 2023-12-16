import org.testng.annotations.Test;
import po.demoqa.*;

import static org.assertj.core.api.Assertions.assertThat;
import static base.driver.DriverInit.getDriver;

public class TestTest extends BaseTest {

    @Test
    void frameTestInside() {
        String expectedHeadingText = "This is a sample page";
        String expectedWrapperText = "This is a sample page";

        FramePage framePage = new FramePage(getDriver());
        framePage.setUp();

        String headingText = framePage.searchHeadingText().toString();
        assertThat(headingText)
                .as("Heading text doesn't match")
                .isEqualTo(expectedHeadingText);

        String wrapperText = framePage.searchWrapperText().toString();
        assertThat(wrapperText)
                .as("Wrapper text doesn't match")
                .isEqualTo(expectedWrapperText);
    }

    @Test
    void submitAlerts() {
        String expectedAlertText = "This is a sample alert message";
        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.setUp();

        alertsPage.element();
        assertThat(alertsPage.getAlertText())
                .as("Alert text doesn't match")
                .isEqualTo(expectedAlertText);
    }

    @Test
    void dragAndDropTest() {
        DraggablePage draggablePage = new DraggablePage(getDriver());
        draggablePage.navigateToDraggablePage();

        draggablePage.performDragAndDrop();
        assertThat(draggablePage.getDroppableText())
                .as("Droppable text doesn't match")
                .isEqualTo("Dropped!");
    }

    @Test
    void contextAndClickTest() {
        String expectedContextText = "Context click successful";
        String expectedDoubleClickText = "Double click successful";

        ButtonsPage buttonsPage = new ButtonsPage(getDriver());
        buttonsPage.navigateToButtonsPage();

        buttonsPage.performDoubleClick();
        assertThat(buttonsPage.getDoubleClickText())
                .as("Double click text doesn't match")
                .isEqualTo(expectedDoubleClickText);
    }

    @Test
    void uploadFile() {
        String filePath = "D:\\Project\\AutoTest\\src\\file";

        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage(getDriver());
        uploadDownloadPage.navigateToUploadDownloadPage();

        uploadDownloadPage.uploadFile(filePath);
        assertThat(uploadDownloadPage.getUploadedFileName())
                .as("Uploaded file name doesn't match")
                .isEqualTo("file");
    }
}
