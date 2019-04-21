package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Sana on 28.03.2019.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }
  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), "Bogush");
    type(By.name("middlename"), "Alexandrovna");
    type(By.name("lastname"), "Oksana");
    type(By.name("nickname"), "Oks");
    type(By.name("company"), "OOO \"FORSAIT\"");
    type(By.name("address"), null);
    type(By.name("home"), null);
    type(By.name("mobile"), "+7 982 255 05 55");
    type(By.name("email"), "okbogush@ya.com");
     }
  public void pushYesWindow() {
    wd.switchTo().alert().accept();
  }
  public void selectContact() {
    click((By.name("31")));
  }
  public void contactDelition() {
    click((By.name("//input[@value='Delete']")));
  }
  public void initContactModification() {
  click((By.name("//img[@alt='Edit']")));
  }
  public void submitContactModification() {
  click(By.name("name=update"));
  }
}
