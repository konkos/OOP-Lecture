package exams.shipsAndContainers;

public abstract class Container {

    private final String code;
    private final String destination;

    public Container(String code, String destination) {
        this.code = code;
        this.destination = destination;
    }

    //Δημιουργία μεθόδου για να την χρησιμοποιήσω στην Ship ώστε να υπολογίσω την χρέωση του πλοίου.
    //Την φτιάχνω αφηρημένη (abstract) και μετατρέπω και την κλάση αφηρημένη
    public abstract double calculateCharge();


}
