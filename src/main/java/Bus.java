import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person passenger) {
            if (getNumberOfPassengers() < this.capacity) {
                this.passengers.add(passenger);
            }
    }

    public void removePassenger(Person passenger) {
        this.passengers.remove(passenger);
    }

    public void pickUp(BusStop busStop) {
        Person newPassenger = busStop.removeFromQueue();
        addPassenger(newPassenger);
    }
}
