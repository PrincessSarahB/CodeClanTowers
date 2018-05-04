import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(50, "Alfonso's");
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Alfonso's", diningRoom.getName());
    }
}
