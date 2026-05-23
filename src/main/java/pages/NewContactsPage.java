package pages;

import dto.Contacts;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import wrappers.*;

@Log4j2
public class NewContactsPage extends BasePage {
    //JavascriptExecutor js = (JavascriptExecutor) driver;

    public final String BASE_URL = "https://demo.suiteondemand.com/index.php?module=Contacts&action=" +
            "EditView&return_module=Contacts&return_action=DetailView";

    public NewContactsPage(WebDriver driver) {
        super(driver);
    }

    public NewContactsPage openNewAccount() {
        driver.get(BASE_URL);
        return this;
    };

    public NewContactsPage addNewContacts(Contacts contacts) {
        log.info("Adding new contact with last name '{}'", contacts.getLastName());
        new Dropdown(driver,"First Name").select(contacts.getTitle());
        new Input(driver, "First Name").write(contacts.getFirstName());
        new Input(driver, "Office Phone").write(contacts.getOfficePhone());
        new Input(driver, "Job Title").write(contacts.getJobTitle());
        new Input(driver, "Account Name").write(contacts.getAccountName());

        new Input(driver, "Last Name").write(contacts.getLastName());
        new Input(driver, "Mobile").write(contacts.getMobile());
        new Input(driver, "Department").write(contacts.getDepartment());
        new Input(driver, "Fax").write(contacts.getFax());

        new AddressTextarea(driver,"Primary Address","Address").write(contacts.getPrimaryAddress());
        new AddressTextarea(driver,"Other Address","Other Address").write(contacts.getOtherAddress());

        new AdressInput(driver,"Primary Address","City").write(contacts.getPrimaryCity());
        new AdressInput(driver,"Primary Address","State/Region").write(contacts.getPrimaryStateOrRegion());
        new AdressInput(driver,"Primary Address","Postal Code").write(contacts.getPrimaryPostalCode());
        new AdressInput(driver,"Primary Address","Country").write(contacts.getPrimaryCountry());

        new AdressInput(driver,"Other Address","City").write(contacts.getOtherCity());
        new AdressInput(driver,"Other Address","State/Region").write(contacts.getOtherStateOrRegion());
        new AdressInput(driver,"Other Address","Postal Code").write(contacts.getOtherPostalCode());
        new AdressInput(driver,"Other Address","Country").write(contacts.getOtherCountry());

        new Textarea(driver,"Description").write(contacts.getDescription());
        new Dropdown(driver,"Lead Source").select(contacts.getLeadSource());
        new Input(driver,"Campaign").write(contacts.getCampaign());
        return this;
    }

    public SaveAccountPage clickSave() {
        log.info("A new contact has been saved");
        js.executeScript("document.getElementById('SAVE').click();");
        return new SaveAccountPage(driver);
    }
}
