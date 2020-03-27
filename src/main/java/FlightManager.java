public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }
    
    public double getBaggageWeightLimit(){
        double totalBaggageWeight =  this.flight.getPlane().getTotalWeightFromEnum() / 2;
        return totalBaggageWeight;
    }
    
    public double getBaggageWeightLimitPerPassenger(){
        return getBaggageWeightLimit() / this.flight.getPlane().getCapacityFromEnum();
    }

    public double getTotalBaggageWeightOnFlight(){
        return getBaggageWeightLimitPerPassenger() * this.flight.getNumberOfPassengers();
    }

    public double getRemainingBaggageWeightOnFlight(){
        return getBaggageWeightLimit() - getTotalBaggageWeightOnFlight();
    }

}

