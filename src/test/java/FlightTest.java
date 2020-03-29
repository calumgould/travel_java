import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Flight smallFlight;
    Plane plane;
    Plane plane2;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300);
        plane2 = new Plane(PlaneType.DOUGLASDC8);
        flight = new Flight(plane, "ED2427", "GLA", "EDI", LocalTime.parse("21:10"));
        smallFlight = new Flight(plane2, "RO054", "EDI", "ABD", LocalTime.parse("13:35"));
        passenger = new Passenger("Calum", 2);
        passenger2 = new Passenger("Roosa", 1);
        passenger3 = new Passenger("Noel", 3);
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("ED2427", flight.getFlightNumber());
    }

    @Test
    public void canGetDestinationAirport(){
        assertEquals("GLA", flight.getDestinationAirport());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        System.out.println(flight.getDepartureTime());
        assertEquals(LocalTime.parse("21:10"), flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
        assertEquals(flight, passenger.getFlight());
        assertTrue(passenger.getSeatNumber() > 0);
        assertTrue(passenger.getSeatNumber() < flight.getPlane().getCapacityFromEnum());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(49, flight.getAvailableSeats());
    }

    @Test
    public void canGetReservedSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        System.out.println(flight.getReservedSeats());
        assertEquals(3, flight.getReservedSeats().size());
    }

    @Test
    public void canGetAllReservedSeatNumbers(){
        smallFlight.addPassenger(passenger);
        smallFlight.addPassenger(passenger2);
        smallFlight.addPassenger(passenger3);
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,3));
        assertEquals(result, smallFlight.getAllReservedSeatNumbers());
    }
 }

 // dont even, i won't ebve
//ebve
// passed
// IT'S EARLY OK ok :eyes: :sadfkanfanfagopawgpoaw :clive:
// :sadCalum: :sadRoosa: 
// :dreamteam:
// :dreamteam:
