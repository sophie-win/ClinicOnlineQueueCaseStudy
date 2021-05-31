package prj.sophie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Doctor d1 = new Doctor("d3", 3);
	    Doctor d2 = new Doctor("d4", 4);
	    Doctor d3 = new Doctor("d2", 2);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);

        ClinicQueue clinicQueue = new ClinicQueue(doctors, 11);

        System.out.println(clinicQueue.estimatedWaitingTime());
    }
}
