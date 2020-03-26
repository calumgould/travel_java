import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    
    Plane plane;
    
    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300);
    }

    @Test
    public void getPlaneType(){
        assertEquals(PlaneType.AIRBUSA300, plane.getPlaneType());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(50, plane.getCapacityFromEnum());
    }
    
    @Test
    public void getPlaneTotalWeight(){
        assertEquals(400.00, plane.getTotalWeightFromEnum(), 0.01);
    }






}
