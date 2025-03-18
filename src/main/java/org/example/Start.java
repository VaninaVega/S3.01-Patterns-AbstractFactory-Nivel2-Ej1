package org.example;

public class Start {
    public Start() {
    }

    public static void start() {
        AgendaFactory factorySpain = new AgendaFactorySpain();
        Agenda agendaSpain = new Agenda(factorySpain);
        agendaSpain.addContact("76549123", "Rambla Cataluña 24");
        AgendaFactory factoryArgentina = new AgendaFactoryArgentina();
        Agenda agendaArgentina = new Agenda(factoryArgentina);
        agendaArgentina.addContact("5678909876", "Las violetas 24");
        System.out.println();
    }
}