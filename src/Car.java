import ExceptionHandling.InvalidCarTypeException;

public abstract class Car {

    private CarType carType;
    private int entryTime;
    private int fare;
    private int exitTime;
    public boolean isParkedInSuvSpot = false;

    public Car( CarType carType, int entryTime ) throws InvalidCarTypeException {

        this.carType = carType;
        this.entryTime = entryTime;
        switch (carType) {
            case SUV -> this.fare = 20;
            case CarType.HATCHBACK -> this.fare = 10;
            default -> throw new InvalidCarTypeException("Invalid Car Type");
        }
    }

    public int getEntryTime(){
        return this.entryTime;
    }

    public int getFare(){
        return this.fare;
    }

    public CarType getCarType(){
        return this.carType;
    }

    public void setParkedInSuvSpot() {
        this.isParkedInSuvSpot = true;
    }
}