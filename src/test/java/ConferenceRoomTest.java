import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conference1;

    @Before
    public void before(){
        conference1 = new ConferenceRoom(100, "Alpha", 300.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conference1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Alpha", conference1.getName());
    }

    @Test
    public void hasRate(){
        assertEquals(300.00, conference1.getRate(), 0.01);
    }
}
