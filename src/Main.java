import ExceptionHandling.InvalidCarTypeException;

class  Main{

    public static void main(String[] args) throws InvalidCarTypeException {

        ParkingLot parkingLot = new ParkingLot(2 , 2, 1);

        Car user1 = CarFactory.getInstance(CarType.HATCHBACK , 10);
        Car user2 = CarFactory.getInstance(CarType.SUV , 10);

        parkingLot.park(user1);
        parkingLot.park(user2);

        parkingLot.printAllCars();

        int amount1 = parkingLot.makePayment(user1 , 12);
        int amount2 = parkingLot.makePayment(user2 , 12);

        System.out.println("Amount1" + amount1);
        System.out.println("Amount1" + amount2);

    }
}