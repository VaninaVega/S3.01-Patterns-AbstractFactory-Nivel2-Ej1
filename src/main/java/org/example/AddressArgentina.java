package org.example;

public class AddressArgentina implements Address {
    private String street;
    private String city;
    private String postalCode;

    public AddressArgentina(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCompleteAddress() {
        return this.street + ", " + this.postalCode + " " + this.city + ", Argentine";
    }
}