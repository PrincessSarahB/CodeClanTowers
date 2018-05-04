import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Jane Smith");
        guest2 = new Guest("Bob Smith");
        guest3 = new Guest("Nancy Name");
    }

    @Test
    public void hasName(){
        assertEquals("Jane Smith", guest1.getName());
    }
}
