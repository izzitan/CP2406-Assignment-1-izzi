import java.util.ArrayList;

public class Road {
    private String id;
    private int roadLength;
    private int  speedLimit;
    private int startPosition;
    private int endPosition;
    private int totalPosition;
    //private ArrayList<Car> cars = new ArrayList<>();
    //private ArrayList<TrafficLight> lights = new ArrayList<>();
    private ArrayList<Road> roads = new ArrayList<>();

    // ADD GLOBAL VARIABLE FOR TOTAL DISTANCE

    public Road(String id, int roadLength, int speedLimit, int startPosition){
        this.id = "road_" + id;
        this.roadLength = roadLength;
        this.speedLimit = speedLimit;
        this.startPosition = startPosition;
        //totalPosition = this.startPosition + totalPosition;
        this.endPosition = this.roadLength + totalPosition;
        totalPosition = totalPosition + startPosition;
    }

    public void printRoadStatus(){
        System.out.printf("%s is %dm long with speed limit of %dm/s and position at %s to %s\n", this.id, this.roadLength, this.speedLimit, this.startPosition, this.endPosition);
        System.out.println(totalPosition);
    }

}
