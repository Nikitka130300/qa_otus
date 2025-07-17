package extensions;


import com.google.inject.Guice;
import com.google.inject.Injector;
import factory.WebDriverFactory;
import modules.GuicePagesModules;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;

public class UIExtension implements BeforeEachCallback, AfterEachCallback {

    private Injector injector = null;

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        WebDriver driver = injector.getInstance(WebDriver.class);
        if (driver != null) {
            driver.quit();
        }
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        WebDriver driver = new WebDriverFactory().create();
        injector = Guice.createInjector(new GuicePagesModules(driver));
        injector.injectMembers(extensionContext.getTestInstance().get());
    }
}
