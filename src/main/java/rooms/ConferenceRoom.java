package rooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private Double rate;

    public ConferenceRoom(int capacity, String name, Double rate) {
        super(capacity);
        this.name = name;
        this.rate = rate;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Double getRate() {
        return rate;
    }
}
