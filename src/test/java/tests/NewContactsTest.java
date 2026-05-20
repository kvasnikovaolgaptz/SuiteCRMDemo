package tests;

import dto.Contacts;
import org.testng.annotations.Test;
import step.ContactsStep;

public class NewContactsTest extends BaseTest{

    Contacts contacts = Contacts.builder()
            .title("Miss")
            .firstName("Ольга")
            .officePhone("8-814-2-40-56-21")
            .jobTitle("менеджер")
            .accountName("Olga")
            .lastName("Смирнова")
            .mobile("8-911-400-40-33")
            .department("Министерство")
            .fax("8-814-2-40-56-21")
            .primaryAddress("190000, Россия, РК, г. Петрозаводск, ул. Лисицына, д.10, кв.10")
            .otherAddress("190000, Россия, г. Москва, ул. Лисицына, д.10, кв.10")
            .primaryCity("г. Петрозаводск")
            .primaryStateOrRegion("РК")
            .primaryCountry("Россия")
            .primaryPostalCode("186000")
            .otherCity("г. Москва")
            .otherPostalCode("190000")
            .otherCountry("Россия")
            .otherStateOrRegion("")
            .description("нет")
            .leadSource("Cold Call")
            .campaign("")
            .build();

    @Test(testName = "Вход в систему с позитивными кредами")
    public void checkAddNewContacts(){
        loginStep.auth("will","will");
        contactsStep.createContacts(contacts);
    }
}
