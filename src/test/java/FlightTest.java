import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300);
        flight = new Flight(plane, "ED2427", "GLA", "EDI", "21:10");
        passenger = new Passenger("Calum", 2);
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
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(49, flight.getAvailableSeats());
    }
 }

 // dont even, i won't ebve
//ebve
// passed
// IT'S EARLY OK ok :eyes: :sadfkanfanfagopawgpoaw :clive:
// :sadCalum: :sadRoosa: 
// :dreamteam:
// :dreamteam:
