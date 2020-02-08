package com.capgemini.airlinereservationsystem.services;

import java.sql.Date;
import java.time.LocalDate;

import com.capgemini.airlinereservationsystem.exception.InvalidEntryException;

public class TicketService  implements ITicketService{

	public void view(int age,LocalDate returndate,LocalDate departuredate) {

		if(age<10){
			throw new InvalidEntryException();
		}

		LocalDate d1 = LocalDate.now();
		if(returndate != d1){
			throw new InvalidEntryException();
		}

		if(departuredate!=d1){
			throw new InvalidEntryException();	
		}


	}

	public void ticketBooking(){

	}
	public void ticketCancellation(){

	}
	public void ticketReschedule(){

	}
}
