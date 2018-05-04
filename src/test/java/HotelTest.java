import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;



    @Before
    public void before(){
        hotel = new Hotel();
    }

    @Test

    public void hasBedrooms(){
        assertEquals(0, hotel.getRooms().size());
    }

    @Test

    public void hasConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test

    public void hasDiningRooms(){
        assertEquals(0, hotel.getDiningrooms().size());
    }


}
