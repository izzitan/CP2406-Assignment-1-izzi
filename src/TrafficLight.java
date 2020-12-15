import java.util.Random;

public class TrafficLight {
    private static final String GREEN = "Green";
    private static final String RED = "Red";
    private static final double CHANGE_COLOR = 0.5;
    private String id;
    private String state;
    private int position;
    private Road onRoad;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setOnRoad(Road onRoad){
        this.onRoad = onRoad;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void operate(){
        Random random = new Random();
        double probability = random.nextDouble();
        if (probability > CHANGE_COLOR){
            this.setState(GREEN);
        }
        else {
            this.setState(RED);
        }
    }

    public void printLightStatus(){
        System.out.printf("traffic_light_%s is %s on road_%s at position %s%n", this.id, this.state, this.onRoad.getId(), this.position);
    }
}
