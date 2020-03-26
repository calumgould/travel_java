public enum PlaneType {

    BOEING747(100, 500.50),
    BOEING767(50, 4000.00),
    BOEING777(200, 2000.50),
    BOEING787(20, 100.00),
    AIRBUSA300(50, 400.00),
    AIRBUSA310(400, 5000.00),
    AIRBUSA330(1000, 10000.00),
    AIRBUSA340(10, 70.00),
    DOUGLASMD80(2, 10.00),
    DOUGLASDC8(3, 3000.53);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getTotalWeight(){
        return this.totalWeight;
    }
}
