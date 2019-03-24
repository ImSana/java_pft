package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoContactCreation();
    app.fillContactForm(new ContactData("Bogush", "Alexandrovna", "Oksana", "Oks", "OOO \"FORSAIT\"", "", "+7 982 255 05 55", "okbogush@ya.com"));
      }
}

