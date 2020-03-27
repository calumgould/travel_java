import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300);
        flight = new Flight(plane, "ED2427", "GLA", "EDI", "21:10");
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
        assertEquals("21:10", flight.getDepartureTime());
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
 }

 // dont even, i won't ebve
//ebve
// passed
// IT'S EARLY OK ok :eyes: :sadfkanfanfagopawgpoaw :clive:
// :sadCalum: :sadRoosa: 
// :dreamteam:
// :dreamteam:
