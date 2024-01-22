import base.methods.BaseMethods;

import static base.driver.DriverInit.getDriver;
import static base.driver.DriverInit.quit;

public class BaseTest extends BaseMethods {

    // Конструктор класса
    public BaseTest() {
        // Выполняем установку перед каждым тестом
        getDriver().get("https://ru.wikipedia.org/wiki");
        getDriver().manage().window().maximize();
    }

    // Деструктор класса
    @Override
    protected void finalize() throws Throwable {
        try {
            // Выполняем закрытие после каждого теста
            quit();
        } finally {
            super.finalize();
        }
    }
}
