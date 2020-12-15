package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadTest {
    Road road = new Road();

    @Test
    road.setId("1");
    void getId(){
        Assertions.assertEquals("1", road.getId());
    }

    @Test
    road.setSpeedLimit(1);
    void getSpeedLimit() {
        Assertions.assertEquals(1, road.getSpeedLimit());
    }

    @Test
    road.setRoadLength(1);
    void getRoadLength(){
        Assertions.assertEquals(1, road.getRoadLength());
    }

    @Test
    road.setStartPosition(1);
    void getStartPosition(){
        Assertions.assertEquals(1, road.getStartPosition());
    }

    @Test
    road.setEndPosition(10);
    void getEndPosition(){
        Assertions.assertEquals(10, road.getEndPosition());
    }
}
