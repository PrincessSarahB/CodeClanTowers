import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
//    RoomType double

    @Before

    public void before(){

        bedroom = new Bedroom(RoomType.DOUBLE.getValue(), 1, 200.00, RoomType.DOUBLE);
    }

    @Test

    public void roomhasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
}
