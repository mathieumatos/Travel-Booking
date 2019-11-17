package Reservation;


import AppUtils.DateUtils;
import Travel.vehicules.places.Seat;
import data.Client;

public class Reservation {

	private DateUtils creationDate;
	private Client client;
	private boolean priorityWing;
	private boolean priorityWindow;
	private String ReservationID;
	private Seat seat;
	
	public DateUtils getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(DateUtils creationDate) {
		this.creationDate = creationDate;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public boolean isPriorityWing() {
		return priorityWing;
	}
	public void setPriorityWing(boolean priorityWing) {
		this.priorityWing = priorityWing;
	}
	public boolean isPriorityWindow() {
		return priorityWindow;
	}
	public void setPriorityWindow(boolean priorityWindow) {
		this.priorityWindow = priorityWindow;
	}
	public String getReservationID() {
		return ReservationID;
	}
	public void setReservationID(String reservationID) {
		ReservationID = reservationID;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
}