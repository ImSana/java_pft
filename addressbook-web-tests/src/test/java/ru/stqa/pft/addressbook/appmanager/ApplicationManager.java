package ru.stqa.pft.addressbook.appmanager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class ApplicationManager {
  WebDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;

  public static boolean isAlertPresent(WebDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.Login("admin", "secret");
      }
  public void stop() {
    wd.quit();
  }
  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
  public ContactHelper getContactHelper() {
    return contactHelper;
  }
  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }

}
