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

        System.out.println("\nStarting simulation...");
        System.out.println();
        ArrayList<Road> roads = new ArrayList<Road>();
        for (int i = 0; i < roadNumbers; i++){
            System.out.println("Please input parameters for road " + i + ": ");
            System.out.println("Length: ");
            int roadLength = trafficSim.nextInt();
            System.out.println("Speed limit: ");
            int speedLimit = trafficSim.nextInt();
            roads.add(new Road(Integer.toString(i), roadLength, speedLimit, 0));
        }

        System.out.println("Roads:");
        for (Road road: roads){
            road.printRoadStatus();

        }
    }
}
