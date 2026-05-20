package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Contacts {
    private String title;
    private String firstName;
    private String officePhone;
    private String jobTitle;
    private String accountName;
    private String lastName;
    private String mobile;
    private String department;
    private String fax;
    private String primaryAddress;
    private String otherAddress;
    private String primaryCity;
    private String primaryStateOrRegion;
    private String primaryCountry;
    private String primaryPostalCode;
    private String otherCity;
    private String otherPostalCode;
    private String otherCountry;
    private String otherStateOrRegion;
    private String description;
    private String leadSource;
    private String campaign;
}
