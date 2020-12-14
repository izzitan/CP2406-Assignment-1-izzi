import java.util.ArrayList;

public class Car {
    private String id;
    private Road onRoad;
    private int speed = 1;
    private int position;

    public void setId(String id){
        this.id = id;
    }
    public void setRoad(Road road){
        this.onRoad = road;
    }

    public void getOnRoad(Road road){
        System.out.println(road.getId());
    }

    public void printCarStatus(Road road){
        System.out.printf("car_%s is going at %dkm/h at position %d on road_%s\n", this.id, this.speed, this.position, road.getId());
    }

    public void moveCar(){
        this.speed = this.onRoad.getSpeedLimit();
        if (this.onRoad.getEndPosition() <= this.position){
            this.speed = 0;
        }
        else if (this.onRoad.getEndPosition() > this.position){
            this.position = this.position + this.speed;
        }
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getPosition(){
        return this.position;
    }
}
