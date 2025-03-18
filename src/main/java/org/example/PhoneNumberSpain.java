package org.example;

public class PhoneNumberSpain implements PhoneNumber {
    private String number;
    private String countryCode;

    public PhoneNumberSpain(String number, String countryCode) {
        this.number = number;
        this.countryCode = countryCode;
    }

    public String getCompletePhoneNumber() {
        return "+" + this.countryCode + " " + this.number;
    }
}
