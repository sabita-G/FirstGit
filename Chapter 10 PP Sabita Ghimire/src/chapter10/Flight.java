package chapter10;

public class Flight implements Comparable<Flight> {
	private String airline;
	private int number;
	private String origin;
	private String destination;

	// Default constructor
	public Flight() {
		airline = "Sprint";
		number = 200;
		origin = "Charlotte";
		destination = "Dallas";

	}

	// overloaded constructor
	public Flight(String airline, int number, String origin, String destination) {
		this.airline = airline;
		this.number = number;
		this.origin = origin;
		this.destination = destination;
	}

	// CompareTo method
	@Override
	public int compareTo(Flight object) {
		int result;

		if (airline.equals(( object).getAirline()))
			if (number == ( object).getNumber())
				result = 0;
			else if (number > ((Flight) object).getNumber())
				result = 1;
			else
				result = -1;
		else
			result = airline.compareTo(((Flight) object).getAirline());

		return result;
	}

// Accessors and mutators of all attributes
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	// toString method
	public String toString() {
		String result = "\n\"" + airline + " Airlines\" " + " Number : " + number + "\nOrigin: " + origin
				+ "   Destination: " + destination;
		return result;
	}

	// equals method
	public boolean equals(Object other) {
		return (airline.equals(((Flight) other).getAirline()) && number == (((Flight) other).getNumber()));
	}
}
