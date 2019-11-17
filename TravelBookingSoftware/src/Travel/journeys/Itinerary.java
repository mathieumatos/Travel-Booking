package Travel.journeys;

import java.util.Date;
import java.util.List;

import Travel.JourneyVisitor;
import Travel.VisitableJourney;
import Travel.areas.Area;

public class Itinerary implements VisitableJourney {

	private Double duration;
	
	private Area toArea;
	
	private Area fromArea;
	
	private List<Layover> layovers;
	
	private Date departureDate;
	
	private Date arrivalDate;
	
	private String itineraryID;

	public String getItineraryID() {
		return itineraryID;
	}

	public void setItineraryID(String itineraryID) {
		this.itineraryID = itineraryID;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Area getToArea() {
		return toArea;
	}

	public void setToArea(Area toArea) {
		this.toArea = toArea;
	}

	public Area getFromArea() {
		return fromArea;
	}

	public void setFromArea(Area fromArea) {
		this.fromArea = fromArea;
	}

	public List<Layover> getLayovers() {
		return layovers;
	}

	public void setLayovers(List<Layover> layovers) {
		this.layovers = layovers;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Override
	public void accept(JourneyVisitor jv) {
		jv.visitItinerary(this);
	}
	
	
}
