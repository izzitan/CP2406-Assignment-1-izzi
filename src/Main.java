import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner trafficSim = new Scanner(System.in);

        // set variables
        System.out.println("Enter number of roads: ");
        int roadNumbers = trafficSim.nextInt();
        System.out.println("Enter number of cars: ");
        int carNumbers = trafficSim.nextInt();
        //System.out.println("Enter number of traffic lights: ");
        //int lightNumbers = trafficSim.nextInt();

        //set traffic light number to be same as road number
        int lightNumbers = roadNumbers;

        // set parameters
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

        // print road status
        for (Road i : roadList){
            i.printRoadStatus();
        }

        // set light parameters
        ArrayList<TrafficLight> lightList = new ArrayList<>();
        for (int i = 0; i < lightNumbers; i++){
            TrafficLight lights = new TrafficLight();
            lights.setId(Integer.toString(i));
            // set traffic light to be at end of road
            lights.setPosition(roadList.get(i).getEndPosition());
            lights.setOnRoad(roadList.get(i));

            lightList.add(lights);
        }

        // set car parameters
        ArrayList<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < carNumbers; i++){
            Car cars = new Car();

            cars.setId(Integer.toString(i));
            cars.setRoad(roadList.get(0));

            carList.add(cars);
        }

        System.out.println("\nSimulation start...");

        int carFinished = 0; //count number of car finished the course
        int roadFinished = 0; //state of road; 0=not finished
        int count = 0; //count number of roads

        while (carFinished < carList.size()){
            for (Car cars : carList){ // iterate through Car objects
                count = 0; // reset count
                for (Road roads : roadList){ // iterate through Road objects
                    roadFinished = 0; // reset roadFinished
                    cars.setRoad(roads);

                    while (roadFinished != 1){
                        // check if cars is at or over the end of road position
                        if (cars.getPosition() >= roads.getEndPosition()){
                            cars.setPosition(roads.getEndPosition());
                            lightList.get(count).operate();
                            lightList.get(count).printLightStatus();
                            // Check if light is red
                            if (lightList.get(count).getState().equals("Red")){
                                cars.setSpeed(0);
                                // Car waits for 3 cycle if light is red
                                for (int k = 0; k < 3; k++){
                                    cars.printCarStatus(roads);
                                    try{
                                        Thread.sleep(200); // set speed of simulation
                                    }
                                    catch (InterruptedException sim){
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                // light turns green after 3 cycles
                                lightList.get(count).setState("Green");
                                lightList.get(count).printLightStatus();
                            }
                            roadFinished = 1; // set road state to finished to move to next road in Array
                            count++;
                        }
                        else{
                            //Car goes through one cycle
                            try{
                                Thread.sleep(200); // set speed of simulation
                            }
                            catch (InterruptedException sim){
                                Thread.currentThread().interrupt();
                            }
                            cars.moveCar();
                            cars.printCarStatus(roads);

                        }
                    }
                    carFinished++;
                }
                cars.printCarFinished();
            }
        }
    }
}
