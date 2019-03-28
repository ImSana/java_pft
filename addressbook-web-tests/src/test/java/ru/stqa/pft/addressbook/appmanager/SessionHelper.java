package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sana on 28.03.2019.
 */
public class SessionHelper {
  private WebDriver wd;

  public SessionHelper(WebDriver wd) {
    this.wd = wd;
  }
  public void Login(String username, String password) {
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.id("LoginForm")).submit();
  }
}