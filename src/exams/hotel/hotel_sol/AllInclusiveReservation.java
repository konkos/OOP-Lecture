package exams.hotel.hotel_sol;

public class AllInclusiveReservation extends Reservation {
    private final int meals;

    public AllInclusiveReservation(int days, int meals) {
        super(days);
        this.meals = meals;
    }

    public int calculateCost() {
        return days * (120 + meals * 30);
    }
}