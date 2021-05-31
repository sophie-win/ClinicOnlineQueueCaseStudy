package prj.sophie;

import java.util.Comparator;

public class Doctor{
    private String name;
    private Integer avgConsultationTime;

    public Doctor(String name, Integer avgConsultationTime) {
        this.name = name;
        this.avgConsultationTime = avgConsultationTime;
    }

    public Integer getAvgConsultationTime() {
        return avgConsultationTime;
    }

    public void setAvgConsultationTime(Integer avgConsultationTime) {
        this.avgConsultationTime = avgConsultationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", avgConsultationTime=" + avgConsultationTime +
                '}';
    }
}
