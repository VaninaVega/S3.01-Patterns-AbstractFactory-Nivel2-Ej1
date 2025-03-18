package org.example;

public class PhoneNumberArgentina implements PhoneNumber {
    private String number;
    private String countryCode;

    public PhoneNumberArgentina(String number, String countryCode) {
        this.number = number;
        this.countryCode = countryCode;
    }

    public String getCompletePhoneNumber() {
        return "+" + this.countryCode + " " + this.number;
    }
}
