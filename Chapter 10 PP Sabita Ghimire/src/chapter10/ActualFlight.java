package chapter10;

public class ActualFlight extends Flight {
	private String departureTime;
	private String arrivalTime;

	// overloaded constructor
	public ActualFlight(String airline, int number, String origin, String destination, String departureTime,
			String arrivalTime) {
		super(airline, number, origin, destination);
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;

	}
	//getters 
	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}
	// setters
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	//toString method
	public String toString() {
		return super.toString() + "\nDeparture " + departureTime + " Arrival " + arrivalTime;

	}
//	// equals method
//	public boolean equals(ActualFlight obj) {
//		boolean result = false;
//		if (super.equals(obj))
//			result = true;
//
//		return result;
	//}
}