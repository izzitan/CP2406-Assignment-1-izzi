import java.util.ArrayList;

public class Road {
    private String id;
    private int roadLength;
    private int  speedLimit;
    private int startPosition;
    private int endPosition;
    private static int totalPosition;
    //private ArrayList<Car> cars = new ArrayList<>();
    //private ArrayList<TrafficLight> lights = new ArrayList<>();
    private ArrayList<Road> roads = new ArrayList<>();


    /*
    public Road(String id, int roadLength, int speedLimit, int startPosition){
        this.id = "road_" + id;
        this.roadLength = roadLength;
        this.speedLimit = speedLimit;
        this.startPosition = startPosition;
        //totalPosition = this.startPosition + totalPosition;
        this.endPosition = this.roadLength + totalPosition;
        totalPosition = totalPosition + startPosition;
    }

     */

    public void printRoadStatus(){
        System.out.printf("road_%s is %dkm long with speed limit of %dkm/h and position at %s to %s\n", this.id, this.roadLength, this.speedLimit, this.startPosition, this.endPosition);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setRoadlength(int roadLength){
        this.roadLength = roadLength;
    }

    public void setSpeedLimit(int speedLimit){
        this.speedLimit = speedLimit;
    }

    public void setStartPosition(int startPosition){
        this.startPosition = startPosition + totalPosition;
    }

    public void setEndPosition(){
        this.endPosition = this.startPosition + this.roadLength;
        totalPosition = totalPosition + this.roadLength + 1;
    }

    public int getSpeedLimit(){
        return this.speedLimit;
    }

    public int getRoadLength(){
        return this.roadLength;
    }

    public String getId(){
        return this.id;
    }

    public int getEndPosition(){
        return this.endPosition;
    }

    public int getTotalPosition(){
        return totalPosition;
    }

    public int getStartPosition(){
        return this.startPosition;
    }

}
