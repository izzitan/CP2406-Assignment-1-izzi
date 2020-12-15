public class Car {
    public String id;
    private Road onRoad;
    public int length = 1;
    private int speed = 1;
    private int position;

    public void setId(String id){
        this.id = id;
    }
    public void setRoad(Road road){
        this.onRoad = road;
    }

    public void printCarStatus(Road road){
        System.out.printf("car_%s is going at %dkm/h at position %d on road_%s\n", this.id, this.speed, this.position, road.getId());
    }

    public void printCarFinished(){
        System.out.printf("car_%s has finished the course\n\n", this.id);
    }

    public void moveCar(){
        this.speed = this.onRoad.getSpeedLimit();
        if (this.onRoad.getEndPosition() <= this.position){
            this.speed = 0;
        }
        else if (this.onRoad.getEndPosition() > this.position){
            if (this.position + this.speed > this.onRoad.getEndPosition()){
                this.position = this.onRoad.getEndPosition();
            }
            else {
                this.position = this.position + this.speed;
            }

        }
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getPosition(){
        return this.position;
    }

    public void getOnRoad(Road road){
        System.out.println(road.getId());
    }

    public String getId(){
        return this.id;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getLength(){
        return this.length;
    }
}
