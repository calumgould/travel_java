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

}

// thinking we maybe add a bag weight to each passenger to be a fixed 2kg or something?
// since a passenger can have multiple bags, we can calculate how much they're bring on the flight
// and not allow if they are over the limit
// also make sure we are git commiting :awkwardseal:

//calculate how much baggage weight is booked by passengers of a flight

// Each passenger bag weighs the same
//Planes reserve half of their total weight for passenger bags
//The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//Passengers exist for a single flight only