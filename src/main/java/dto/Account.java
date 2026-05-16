package dto;

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

    public Account(String name, String phone, String fax, String website, String streetBilling, String cityBilling,
                   String stateOrRegionBilling, String postalCodeBilling, String countryBilling, String streetShipping,
                   String cityShipping, String stateOrRegionShipping, String postalCodeShipping, String countryShipping,
                   String description, String type, String industry) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.streetBilling = streetBilling;
        this.cityBilling = cityBilling;
        this.stateOrRegionBilling = stateOrRegionBilling;
        this.postalCodeBilling = postalCodeBilling;
        this.countryBilling = countryBilling;
        this.streetShipping = streetShipping;
        this.cityShipping = cityShipping;
        this.stateOrRegionShipping = stateOrRegionShipping;
        this.postalCodeShipping = postalCodeShipping;
        this.countryShipping = countryShipping;
        this.description = description;
        this.type = type;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getStreetBilling() {
        return streetBilling;
    }

    public String getCityBilling() {
        return cityBilling;
    }

    public String getStateOrRegionBilling() {
        return stateOrRegionBilling;
    }

    public String getPostalCodeBilling() {
        return postalCodeBilling;
    }

    public String getCountryBilling() {
        return countryBilling;
    }

    public String getStreetShipping() {
        return streetShipping;
    }

    public String getCityShipping() {
        return cityShipping;
    }

    public String getStateOrRegionShipping() {
        return stateOrRegionShipping;
    }

    public String getPostalCodeShipping() {
        return postalCodeShipping;
    }

    public String getCountryShipping() {
        return countryShipping;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getIndustry() {
        return industry;
    }
}
