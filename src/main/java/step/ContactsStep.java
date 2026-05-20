package step;

import dto.Account;
import dto.Contacts;
import org.openqa.selenium.WebDriver;
import pages.NewContactsPage;

public class ContactsStep {
    WebDriver driver;
    NewContactsPage newContactsPage;

    public ContactsStep(WebDriver driver) {
        this.driver = driver;
        newContactsPage = new NewContactsPage(driver);
    }

    public void createContacts(Contacts contacts) {
        newContactsPage.openNewAccount();
        newContactsPage.addNewContacts(contacts);
        newContactsPage.clickSave();
    }
}
