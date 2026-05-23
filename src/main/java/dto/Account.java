package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Account {
    private String name;
    private String phone;
    private String fax;
    private String website;
    private String streetBilling;
    private String cityBilling;
    private String stateOrRegionBilling;
    private String postalCodeBilling;
    private String countryBilling;
    private String streetShipping;
    private String cityShipping;
    private String stateOrRegionShipping;
    private String postalCodeShipping;
    private String countryShipping;
    private String description;
    private String type;
    private String industry;
}
