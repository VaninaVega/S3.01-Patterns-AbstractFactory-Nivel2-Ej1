package org.example;

public class AddressSpain implements Address {
    private String street;
    private String city;
    private String postalCode;

    public AddressSpain(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCompleteAddress() {
        return this.street + ", " + this.postalCode + " " + this.city + ", Spain";
    }
}
