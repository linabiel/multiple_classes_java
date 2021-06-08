import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Auchtermuchty", 100);
        person = new Person();
        busStop = new BusStop("Edinburgh");
        busStop.addToQueue(person);
    }

    @Test
    public void hasNumberOfPassengers() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpPassenger(){
        bus.pickUp(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
        assertEquals(0, busStop.getQueueSize());
    }
}
