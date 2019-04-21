package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sana on 28.03.2019.
 */
public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver wd) {
    super(wd);
  }
  public void Login(String username, String password) {
type(By.name("user"), username);
    type(By.name("pass"), password);
   click(By.xpath("//input[@value='Login']"));
  }
}