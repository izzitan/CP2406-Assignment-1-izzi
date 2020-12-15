import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadTest {
    Road road = new Road();

    @Test
    road.setId("1");
    void getId(){
        assertEquals("1", road.getId());
    }

    @Test
    road.setSpeedLimit(1);
    void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    road.setRoadLength(1);
    void getRoadLength(){
        assertEquals(1, road.getRoadLength());
    }

    @Test
    road.setStartPosition(1);
    void getStartPosition(){
        assertEquals(1, road.getStartPosition());
    }

    @Test
    road.setEndPosition(10);
    void getEndPosition(){
        assertEquals(10, road.getEndPosition());
    }
}
