package org.example;

public class AgendaFactorySpain implements AgendaFactory {
    public AgendaFactorySpain() {
    }

    public Address createAddress(String street, String city, String postalCode) {
        return new AddressSpain(street, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String number, String countryCode) {
        return new PhoneNumberSpain(number, countryCode);
    }
}
