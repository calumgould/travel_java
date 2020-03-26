public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public PlaneType getPlaneType(){
        return this.plane;
    }
    
    public int getCapacityFromEnum(){
        return this.plane.getCapacity();
    }
    public double getTotalWeightFromEnum(){
        return this.plane.getTotalWeight();
    }

}
