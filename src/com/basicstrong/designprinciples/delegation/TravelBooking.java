package com.basicstrong.designprinciples.delegation;

public interface TravelBooking {
    public void bookTicket();
}

class TrainTicketBook implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Book Train Tickets");
    }
}

class FlightTicketBook implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Flight Tickets booked");
    }
}

class TicketBookingByAgent implements TravelBooking {
    TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking travelBooking) {
        this.travelBooking = travelBooking;
    }

    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}