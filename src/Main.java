import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner trafficSim = new Scanner(System.in);

        System.out.println("Enter number of roads: ");
        int roadNumbers = trafficSim.nextInt();
        System.out.println("Enter number of cars: ");
        int carNumbers = trafficSim.nextInt();
        System.out.println("Enter number of traffic lights: ");
        int lightNumbers = trafficSim.nextInt();

        System.out.println("\nSet parameters:");
        System.out.println();
        ArrayList<Road> roadList = new ArrayList<Road>();
        for (int i = 0; i < roadNumbers; i++){
            Road roads = new Road();
            System.out.println("Please input parameters for road " + i + ": ");
            System.out.println("Length: ");
            int roadLength = trafficSim.nextInt();
            System.out.println("Speed limit: ");
            int speedLimit = trafficSim.nextInt();

            // set road parameters

            roads.setId(Integer.toString(i));
            roads.setRoadlength(roadLength);
            roads.setSpeedLimit(speedLimit);
            roads.setStartPosition(0);
            roads.setEndPosition();

            roadList.add(roads); //add current road to ArrayList roadList
        }

        for (Road i : roadList){
            i.printRoadStatus();
        }

        System.out.println("\nCars: ");
        ArrayList<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < carNumbers; i++){
            Car cars = new Car();

            cars.setId(Integer.toString(i));
            cars.setRoad(roadList.get(0));

            carList.add(cars);
        }

        int carFinished = 0;
        int roadFinished = 0;
        while (carFinished < carList.size()){
            for (Car i : carList){
                for (Road j : roadList){
                    i.setRoad(j);
                    while (roadFinished != 1){
                        try{
                            Thread.sleep(200); // set speed of simulation
                        }
                        catch (InterruptedException sim){
                            Thread.currentThread().interrupt();
                        }
                        i.moveCar();
                        i.printCarStatus(j);
                        if (i.getPosition() >= j.getEndPosition()){
                            roadFinished++;
                        }
                    }
                    roadFinished = 0;
                    carFinished++;
                }
            }
        }
    }
}
