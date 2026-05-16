package dto;

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

    public Contacts(String title, String firstName, String officePhone, String jobTitle, String accountName,
                    String lastName, String mobile, String department, String fax, String primaryAddress,
                    String otherAddress, String primaryCity, String primaryStateOrRegion, String primaryCountry,
                    String primaryPostalCode, String otherCity, String otherPostalCode, String otherCountry,
                    String otherStateOrRegion, String description, String leadSource, String campaign) {
        this.title = title;
        this.firstName = firstName;
        this.officePhone = officePhone;
        this.jobTitle = jobTitle;
        this.accountName = accountName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.department = department;
        this.fax = fax;
        this.primaryAddress = primaryAddress;
        this.otherAddress = otherAddress;
        this.primaryCity = primaryCity;
        this.primaryStateOrRegion = primaryStateOrRegion;
        this.primaryCountry = primaryCountry;
        this.primaryPostalCode = primaryPostalCode;
        this.otherCity = otherCity;
        this.otherPostalCode = otherPostalCode;
        this.otherCountry = otherCountry;
        this.otherStateOrRegion = otherStateOrRegion;
        this.description = description;
        this.leadSource = leadSource;
        this.campaign = campaign;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDepartment() {
        return department;
    }

    public String getFax() {
        return fax;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public String getOtherAddress() {
        return otherAddress;
    }

    public String getPrimaryCity() {
        return primaryCity;
    }

    public String getPrimaryStateOrRegion() {
        return primaryStateOrRegion;
    }

    public String getPrimaryCountry() {
        return primaryCountry;
    }

    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public String getOtherStateOrRegion() {
        return otherStateOrRegion;
    }

    public String getDescription() {
        return description;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getCampaign() {
        return campaign;
    }
}
