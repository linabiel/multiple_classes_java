import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public void addToQueue(Person passenger) {
        this.queue.add(passenger);
    }

    public int getQueueSize() {
        return this.queue.size();
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}

