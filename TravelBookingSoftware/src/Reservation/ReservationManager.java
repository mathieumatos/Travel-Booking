package Reservation;

import java.util.ArrayList;

import data.Client;


public class ReservationManager {
	
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	//TODO
	public ArrayList<Reservation> getReservationForClient(Client client){
		ArrayList<Reservation> rsvp = new ArrayList<Reservation>();
		
		
		return rsvp;
	}
	
	//TODO
	public boolean deleteReservation(Reservation rsvp) {
		return false;
	}
	
	public boolean payReservation(Reservation rsvp, Payment payment) {
		return false;
	}

}
