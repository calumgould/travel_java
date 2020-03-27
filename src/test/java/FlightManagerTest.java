import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {
    
    FlightManager flightManager;
    Flight flight;
    Plane plane;
    
    @Before 
    public void beore(){
        plane = new Plane(PlaneType.AIRBUSA300);
        flight = new Flight(plane, "ED3000", "GLA", "EDI", "21.10");
        flightManager = new FlightManager(flight);
    }
    
    @Test
    public void canGetBaggageWeightLimit(){
        assertEquals(200.00, flightManager.getBaggageWeightLimit, 0.01)
    }

    @Test
    public void canGetBaggageWeightLimitPerPassenger(){
        assertEquals(4.00, flightManager.getBaggageWeightLimitPerPassenger())
    }
}