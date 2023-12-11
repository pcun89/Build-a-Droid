import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DroidTest {
    @Test
    public void testPerformTask() {
        Droid droid = new Droid("R2D2");
        droid.performTask("task");
        assertEquals(90, droid.getBatteryLevel());
    }

    @Test
    public void testEnergyTransfer() {
        Droid droid1 = new Droid("R2D2");
        Droid droid2 = new Droid("C3PO");
        droid1.energyTransfer(droid2);
        assertEquals(80, droid1.getBatteryLevel());
        assertEquals(120, droid2.getBatteryLevel());
    }
}