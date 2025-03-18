package org.example;

import java.io.PrintStream;

public class Agenda {
    private AgendaFactory factory;

    public Agenda(AgendaFactory factory) {
        this.factory = factory;
    }

    public void addContact(String number, String address) {
        PhoneNumber phoneNumber = this.factory.createPhoneNumber(number, "countryCode");
        Address intAddress = this.factory.createAddress(address, "city", "postalCode");
        PrintStream var10000 = System.out;
        String var10001 = phoneNumber.getCompletePhoneNumber();
        var10000.println("New contact added: " + var10001 + " | " + intAddress.getCompleteAddress());
    }
}
