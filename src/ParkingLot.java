import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int totalSpot;
    private int suvSpot;
    private int HatchBackSpot;
    private List<Car> parkedCars = new ArrayList<>();
    public ParkingLot(int totalSpot , int suvSpot , int hatchBackSpot){
        this.totalSpot = totalSpot;
        this.suvSpot = suvSpot;
        this.HatchBackSpot = hatchBackSpot;
    }

    public int getTotalSpot() {
        return totalSpot;
    }


    public int getSuvSpot() {
        return suvSpot;
    }

    public int getHatchBackSpot() {
        return HatchBackSpot;
    }

    public void park(Car car){
        if(car.getCarType() == CarType.SUV && suvSpot > 0){
            suvSpot-=1;
        }else if(car.getCarType() == CarType.HATCHBACK) {
            if(HatchBackSpot > 0){
                HatchBackSpot--;
            }else if(suvSpot > 0){
                car.setParkedInSuvSpot();
                suvSpot--;
            }else{
                System.out.println("Parking is full for Hatchback and SUV!");
                return;
            }
        }
        parkedCars.add(car);
        totalSpot-=1;
    }

    public void printAllCars(){
        System.out.println("Parked Cars :");
        for(Car car : parkedCars){
            System.out.println("Type: " + car.getCarType() + ", Entry Time: " + car.getEntryTime());
        }
    }


    public int makePayment(Car car , int exitTime){
        int entryTime = car.getEntryTime();

        if(car.getCarType() == CarType.SUV){
            suvSpot++;
        }else if(car.getCarType() == CarType.HATCHBACK){
            if(car.isParkedInSuvSpot){
                suvSpot++;
            }else{
                HatchBackSpot++;
            }
        }
        totalSpot++;
        parkedCars.remove(car);

        System.out.println("EntryTime"  + entryTime);
        int fare = car.isParkedInSuvSpot ? 20 : car.getFare();
        int billAmount = (exitTime - entryTime) * fare;
        return billAmount;
    }
}