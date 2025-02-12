import ExceptionHandling.InvalidCarTypeException;

public class SuvCar extends Car {
    public SuvCar(CarType carType , int entryTime) throws InvalidCarTypeException {
        super(carType , entryTime);
    }
}