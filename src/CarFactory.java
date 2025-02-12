import ExceptionHandling.InvalidCarTypeException;

public class CarFactory {

    public static Car getInstance(CarType type, int entryTime) throws InvalidCarTypeException {
        switch (type) {
            case CarType.SUV -> {
                return new SuvCar(type, entryTime);
            }
            case CarType.HATCHBACK -> {
                return new Hatchback(type, entryTime);
            }
            default -> throw new InvalidCarTypeException("Invalid type");
        }
    }
}