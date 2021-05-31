package prj.sophie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClinicQueue {
    private List<Doctor> doctors;
    private int patientPos;

    public ClinicQueue(List<Doctor> doctors, int patientPos) {
        this.doctors = doctors;
        this.patientPos = patientPos;
    }

    /***
     * arr Array is for storing doctor name to patient
     * consultationTime Array is taking notes about the actual total duration for each doctor consultation process with respective patients
     * @return
     */
    public int estimatedWaitingTime() {
        String[] arr = new String[patientPos];
        int noOfDocs = doctors.size();
        int[] consultationTime = new int[noOfDocs];

        doctors.sort(Comparator.comparing(Doctor::getAvgConsultationTime));

        int i = 0;
        for (Doctor doctor: doctors) {
            consultationTime[i] = doctor.getAvgConsultationTime();
            arr[i++] = doctor.getName();
        }

        for (; i < patientPos; i++) {
            int min = consultationTime[0];
            int minIndex = 0;
            for (int j = 1; j < noOfDocs; j++) {
                if (min > consultationTime[j]) {
                    min = consultationTime[j];
                    minIndex = j;
                }
            }
            arr[i] = doctors.get(minIndex).getName();
            consultationTime[minIndex] += doctors.get(minIndex).getAvgConsultationTime();
        }

        String docName = arr[patientPos - 1];
        int count = 0;
        for (i = 0; i < patientPos; i++) {
            if (docName.equals(arr[i])) count++;
        }

        Doctor doctor = null;
        for (Doctor doc: doctors) {
            if (doc.getName().equals(docName)) doctor = doc;
        }

        return doctor.getAvgConsultationTime() * (count - 1);
    }
}


