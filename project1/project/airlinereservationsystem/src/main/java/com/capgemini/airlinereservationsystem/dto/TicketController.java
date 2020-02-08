package com.capgemini.airlinereservationsystem.dto;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class TicketController {
	private int ticketid;
	private String flighttype;
	private String tickettype;
	private int age;
	private String from;
	private String to;
	private LocalDate departuredate;
	private LocalTime returndate;

	

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public String getFlighttype() {
		return flighttype;
	}

	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}

	public String getTickettype() {
		return tickettype;
	}

	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public LocalDate getDeparturedate() {
		return departuredate;
	}

	public void setDeparturedate(LocalDate departuredate) {
		this.departuredate = departuredate;
	}

	public LocalTime getReturndate() {
		return returndate;
	}

	public void setReturndate(LocalTime returndate) {
		this.returndate = returndate;
	}

	@Override
	public String toString() {
		return "TicketController [ticketid=" + ticketid + ", flighttype=" + flighttype + ", tickettype=" + tickettype
				+ ", age=" + age + ", from=" + from + ", to=" + to + ", departuredate=" + departuredate
				+ ", returndate=" + returndate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((departuredate == null) ? 0 : departuredate.hashCode());
		result = prime * result + ((flighttype == null) ? 0 : flighttype.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((returndate == null) ? 0 : returndate.hashCode());
		result = prime * result + ticketid;
		result = prime * result + ((tickettype == null) ? 0 : tickettype.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

}
