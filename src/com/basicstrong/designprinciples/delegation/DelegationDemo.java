package com.basicstrong.designprinciples.delegation;

public class DelegationDemo {

    public static void main(String[] args) {
        TicketBookingByAgent agent = new TicketBookingByAgent(new FlightTicketBook());
        agent.bookTicket();
    }
}
