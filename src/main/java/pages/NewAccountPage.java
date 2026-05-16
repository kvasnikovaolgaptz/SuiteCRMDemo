package pages;

import dto.Account;
import org.openqa.selenium.WebDriver;
import wrappers.*;

public class NewAccountPage extends BasePage {


    public final String BASE_URL = "https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module" +
            "=Accounts&return_action=DetailView";

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage open(){
       driver.get(BASE_URL);
       return this;
    }
    public NewAccountPage checkLoginWithPositiveCred() {
        js.executeScript("document.getElementById('user_name').value = arguments[0];", "will");
        js.executeScript("document.getElementById('username_password').value = arguments[0];", "will");
        js.executeScript("document.getElementsByName('Login')[0].click();");
        return this;
    }

    public NewAccountPage openNewAccount(){
        driver.get(BASE_URL);
        return this;
    };

    public NewAccountPage addNewAccount(Account account) {
        new Input(driver, "Name").write(account.getName());
        new Input(driver, "Office Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        new AddressTextarea(driver,"Billing Addres","Street").write(account.getStreetBilling());
        new AdressInput(driver,"Billing Addres","City").write(account.getCityBilling());
        new AdressInput(driver,"Billing Addres","State/Region").write(account.getStateOrRegionBilling());
        new AdressInput(driver,"Billing Addres","Postal Code").write(account.getPostalCodeBilling());
        new AdressInput(driver,"Billing Addres","Country").write(account.getCountryBilling());
        new AddressTextarea(driver,"Shipping Addres","Street").write(account.getStreetShipping());
        new AdressInput(driver,"Shipping Addres","City").write(account.getCityShipping());
        new AdressInput(driver,"Shipping Addres","State/Region").write(account.getStateOrRegionShipping());
        new AdressInput(driver,"Shipping Addres","Postal Code").write(account.getPostalCodeShipping());
        new AdressInput(driver,"Shipping Addres","Country").write(account.getCountryShipping());
        new Textarea(driver,"Description").write(account.getDescription());
        new Dropdown(driver,"Type").select(account.getType());  // был Customer
        new Dropdown(driver,"Industry").select(account.getIndustry()); // был Apparel
        return this;
    };
    public SaveAccountPage clickSave() {
        js.executeScript("document.getElementById('SAVE').click();");
        return new SaveAccountPage(driver);
    }
}
