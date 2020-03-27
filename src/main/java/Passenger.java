public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBags(){
        return this.numberOfBags;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void assignSeatNumber(){
        if (this.flight == null) {
            return;
        }
        int capacity = this.flight.getPlane().getCapacityFromEnum();
        int range = (capacity - 1) + 1;
        this.seatNumber = (int) (Math.random() * range + 1);
    }
    
    public Flight assignFlight(Flight flightToAdd) {
        return this.flight = flightToAdd;
    }
}
