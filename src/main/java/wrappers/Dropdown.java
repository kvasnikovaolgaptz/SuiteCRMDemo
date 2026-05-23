package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;

@Log4j2
public class Dropdown {

    WebDriver driver;
    String label;
    private final String SELECT_PATTERN = "//*[contains(text(), '%s')]/following-sibling::div//";

    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        log.info("selecting '{} inside select '{}'", option,label);
        driver.findElement(By.xpath(String.format(SELECT_PATTERN + "select", label))).click();
        driver.findElement(By.xpath(String.format(SELECT_PATTERN + "option[contains(text(), '%s')]", label, option)))
                .click();
    }
}
