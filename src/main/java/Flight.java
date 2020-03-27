import java.util.ArrayList;
//import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList getPassengers(){
        return this.passengers;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestinationAirport(){
        return this.destinationAirport;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int getAvailableSeats(){
        int availableSeats = this.plane.getCapacityFromEnum() - this.passengers.size();
        return availableSeats;
    }

    public void addPassenger(Passenger passenger){
        if (getAvailableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }
}
