import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    
    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void beore(){
        passenger1 = new Passenger("Calum", 5);
        passenger2 = new Passenger("Roosa", 2);
        passenger3 = new Passenger("Noel", 1);
        plane = new Plane(PlaneType.AIRBUSA300);
        flight = new Flight(plane, "ED3000", "GLA", "EDI", LocalTime.parse("21:10"));
        flightManager = new FlightManager(flight);
    }
    
    @Test
    public void canGetBaggageWeightLimit(){
        assertEquals(200.00, flightManager.getBaggageWeightLimit(), 0.01);
    }

    @Test
    public void canGetBaggageWeightLimitPerPassenger(){
        assertEquals(4.00, flightManager.getBaggageWeightLimitPerPassenger(), 0.01);
    }

    @Test
    public void canGetTotalPassengerBaggageWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(12.00, flightManager.getTotalBaggageWeightOnFlight(), 0.01);
    }

    @Test
    public void canGetRemainingTotalBaggageWeightOnFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(188.00, flightManager.getRemainingBaggageWeightOnFlight(), 0.01);
    }
}