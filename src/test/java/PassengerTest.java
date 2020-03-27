import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    Flight flight;
    Passenger passenger;
    Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Roosa", 2);
        plane = new Plane(PlaneType.AIRBUSA300);
        flight = new Flight(plane, "ED2427", "GLA", "EDI", "21:10");
    }

    @Test
    public void canGetName() {
        assertEquals("Roosa", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canAssignFlight(){
        passenger.assignFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }
    
    @Test
    public void canGetSeatNumber(){
        passenger.assignFlight(flight);
        passenger.assignSeatNumber();
        assertTrue(passenger.getSeatNumber() > 0);
        assertTrue(passenger.getSeatNumber() < flight.getPlane().getCapacityFromEnum());
    }
}
