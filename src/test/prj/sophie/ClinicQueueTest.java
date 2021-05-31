package prj.sophie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClinicQueueTest {
    List<Doctor> doctors;
    @Before
    public void setup() {
        Doctor d1 = new Doctor("d3", 3);
        Doctor d2 = new Doctor("d4", 4);
        Doctor d3 = new Doctor("d2", 2);
        doctors = new ArrayList<>();
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
    }

    @Test
    public void estimatedWaitingTimeTest() {
        ClinicQueue clinicQueue = new ClinicQueue(doctors, 11);
        assertEquals(clinicQueue.estimatedWaitingTime(), 8);
    }

    @After
    public void clear() {
        doctors = null;
    }
}
