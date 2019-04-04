package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Sana on 28.03.2019.
 */
public class ContactHelper {
  private WebDriver wd;

  public ContactHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoContactsPage(WebDriver wd) {
    wd.findElement(By.linkText("add new")).click();
  }

  public void gotoContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void fillContactForm(ContactData contactData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Bogush");
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys("Alexandrovna");
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("Oksana");
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("Oks");
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("OOO \"FORSAIT\"");
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("+7 982 255 05 55");
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("okbogush@ya.com");
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void pushYesWindow() {
    wd.switchTo().alert().accept();
  }


  public void selectContact() {
    wd.findElement(By.id("31")).click();
  }

  public void contactDelition() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }
}
