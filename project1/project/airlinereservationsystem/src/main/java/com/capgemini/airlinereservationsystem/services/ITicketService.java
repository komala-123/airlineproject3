package com.capgemini.airlinereservationsystem.services;

import java.time.LocalDate;

public interface ITicketService {

	
	public void view(int age,LocalDate returndate,LocalDate departuredate);
	public void ticketBooking();
	public void ticketReschedule();
	public void ticketCancellation();
	
	
}
