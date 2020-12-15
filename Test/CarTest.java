package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest{
    Road roads = new Road();
    Car cars = new Car();

    @Test
    roads.setId("1");
    roads.setSpeedLimit(2);
    roads.setEndPosition(10);
    void moveCar(){
        cars.moveCar();
        Assertions.assertEquals(2, cars.getPosition());
    }

    @Test
    cars.setId("0");
    void getId(){
        Assertions.assertEquals("0", cars.getId());
    }

    @Test
    cars.setSpeed(3);
    void getSpeed(){
        Assertions.assertEquals(3,cars.getSpeed());
    }

    @Test
    cars.setPosition(10);
    void getPosition(){
        Assertions.assertEquals(10,cars.getPosition());
    }
}
