package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.tests.TestBase;

public class HelperBase extends TestBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existngText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existngText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }}
        public boolean isAlertPresent () {
            try {
                wd.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }
    }