package exams.hotel.hotel_sol;

public class Reservation {
    protected int days;

    public Reservation(int days) {
        this.days = days;
    }

    public int calculateCost() {
        return days * 120;
    }
}
