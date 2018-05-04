import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conference1;
    Guest guest;

    @Before
    public void before(){
        conference1 = new ConferenceRoom(100, "Alpha", 300.00);
        guest = new Guest("Jim Miller");
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

    @Test

    public void canCheckInGuest(){
        conference1.addGuest(guest);
        assertEquals(1, conference1.numberOfGuestsInRoom());
    }
}
