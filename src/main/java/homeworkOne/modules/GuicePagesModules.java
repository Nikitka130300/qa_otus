package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.openqa.selenium.WebDriver;

public class GuicePagesModules extends AbstractModule {

    private WebDriver driver = null;

    public GuicePagesModules(WebDriver driver){
        this.driver = driver;
    }

    @Provides
    public WebDriver getDriver() {
        return driver;
    }

}
