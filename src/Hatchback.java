import ExceptionHandling.InvalidCarTypeException;

public class Hatchback extends Car{

    public Hatchback(CarType carType , int entryTime) throws InvalidCarTypeException {
        super(carType , entryTime);
    }
}