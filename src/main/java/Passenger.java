import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList getAllReservedSeatNumbers(){
        ArrayList<Integer> reservedSeats = new ArrayList<>();
        for (Integer seat : flight.getReservedSeats()) {

            reservedSeats.add(seat);
        }
        return Collections.sort(reservedSeats);
    }


    public void assignSeatNumber(){
        if (this.flight == null) {
            return;
        }
        int capacity = this.flight.getPlane().getCapacityFromEnum();
        int range = (capacity - 1) + 1;
        int seatNumber = (int) (Math.random() * range + 1);

        if (flight.getReservedSeats().containsValue(seatNumber)){
            assignSeatNumber();
            return;
        }

        this.seatNumber = seatNumber;
    }
    
    public Flight assignFlight(Flight flightToAdd) {
        return this.flight = flightToAdd;
    }
}
