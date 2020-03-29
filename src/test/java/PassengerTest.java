import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    Flight flight;
    Flight smallFlight;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    Plane plane2;

    @Before
    public void before() {
        passenger = new Passenger("Roosa", 2);
        passenger2 = new Passenger("Calum", 3);
        passenger3 = new Passenger("Noel", 2);
        plane = new Plane(PlaneType.AIRBUSA300);
        plane2 = new Plane(PlaneType.DOUGLASDC8);
        flight = new Flight(plane, "ED2427", "GLA", "EDI", "21:10");
        smallFlight = new Flight(plane2, "RO054", "EDI", "ABD", "13:35");
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
    
    @Test
    public void canAssignUniqueSeatNumbers(){
        smallFlight.addPassenger(passenger);
        smallFlight.addPassenger(passenger2);
        smallFlight.addPassenger(passenger3);
//        assertEquals();
    }

}
