import java.util.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.time.LocalTime;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private LocalTime departureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departureAirport, LocalTime departureTime){
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

    public LocalTime getDepartureTime(){
        return this.departureTime;
    }

    public int getAvailableSeats(){
        int availableSeats = this.plane.getCapacityFromEnum() - this.passengers.size();
        return availableSeats;
    }

    public HashMap getReservedSeats(){
        HashMap<String, Integer> seats = new HashMap<String, Integer>();
        for (Passenger passenger : this.passengers ){
            seats.put(passenger.getName(), passenger.getSeatNumber());
        }
        return seats;
    }

    public ArrayList getAllReservedSeatNumbers(){
        Collection<Integer> reservedSeats = getReservedSeats().values();
        ArrayList<Integer> reservedSeatsArray = new ArrayList<Integer>(reservedSeats);
        Collections.sort(reservedSeatsArray);
        return reservedSeatsArray;
    }

    public void addPassenger(Passenger passenger){
        if (getAvailableSeats() > 0) {
            this.passengers.add(passenger);
            passenger.assignFlight(this);
            passenger.assignSeatNumber();
        }
    }
}
