package factory.settings;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public interface IBrowserSettings {
    AbstractDriverOptions setting();
}
