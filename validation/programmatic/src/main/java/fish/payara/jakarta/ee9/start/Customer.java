package fish.payara.jakarta.ee9.start;

import jakarta.validation.constraints.NotEmpty;

@ValidCustomer
public class Customer {


    private String name;

    @NotEmpty
    private String countryCode;

    @NotEmpty
    private String taxId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}
