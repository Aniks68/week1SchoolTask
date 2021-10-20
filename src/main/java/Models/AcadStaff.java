package Models;

import Services.Position;

import java.util.Arrays;

public class AcadStaff extends Staff{
    private String[] subjects;

    public AcadStaff(String name, int age, String address, int id, Position position,
                     String jobDescript, String qualifications, int salary, String[] subjects) {
        super(name, age, address, id, position, jobDescript, qualifications, salary);
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getJobDescript() {
        return "" + super.getJobDescript() + ", teaching " + Arrays.toString(getSubjects()) + "";
    }
}
