import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrafficLightTest {
    TrafficLight light = new TrafficLight();

    @Test
    light.setState("Green");
    void getState(){
        assertEquals("Green", light.getState());
    }

    @Test
    light.setPosition(10);
    void getPosition(){
        assertEquals(10, light.getPosition());
    }
}
