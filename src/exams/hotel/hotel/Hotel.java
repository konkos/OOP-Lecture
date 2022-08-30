package exams.hotel.hotel;

import java.io.Serializable;


public class Hotel implements Serializable {

    private final String name;

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
