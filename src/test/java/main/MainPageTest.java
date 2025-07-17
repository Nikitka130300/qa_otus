package main;

import extensions.UIExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(UIExtension.class)
public class MainPageTest {

    @Inject
    private WebDriver driver;

    @Test
    public void clickDayNewsItem(){
        System.out.print(" ");
    }
}
