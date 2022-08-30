package exams.shipsAndContainers;

public class Refrigerator extends Container {

    private final double power;

    // Κατασκευαστής
    public Refrigerator(String code, String destination, double power) {
        super(code, destination);
        this.power = power;
    }

    // Μέθοδος υπολογισμού χρέωσης (πολυμοορφισμός)
    public double calculateCharge() {

        return 2000 * power;
    }

}
