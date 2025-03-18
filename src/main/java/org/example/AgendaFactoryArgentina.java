package org.example;

public class AgendaFactoryArgentina implements AgendaFactory {
    public AgendaFactoryArgentina() {
    }

    public Address createAddress(String street, String city, String postalCode) {
        return new AddressArgentina(street, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String number, String countryCode) {
        return new PhoneNumberArgentina(number, countryCode);
    }
}
