package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sana on 28.03.2019.
 */
public class NavigationHelper {
private WebDriver wd;
  public NavigationHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
