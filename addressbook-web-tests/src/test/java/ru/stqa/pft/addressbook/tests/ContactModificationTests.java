package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

    @Test

    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getContactHelper().gotoContactCreation();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Bogush", "Alexandrovna", "Oksana", "Oks", "OOO \"FORSAIT\"", "", "+7 982 255 05 55", "okbogush@ya.com"));
        app.getContactHelper().submitContactModification();
    }
}
