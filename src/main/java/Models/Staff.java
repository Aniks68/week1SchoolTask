package Models;

import Services.Position;

public class Staff extends Person{
    int id;
    public Position position;
    String jobDescript;
    String qualifications;
    public int salary;


    public Staff(String name, int age, String address, int id,
                 Position position, String jobDescript, String qualifications, int salary) {
        super(name, age, address);
        this.id = id;
        this.position = position;
        this.jobDescript = jobDescript;
        this.qualifications = qualifications;
        this.salary = salary;
    }

    public Staff() {
    }

    public String getJobDescript() {
        return jobDescript;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Position getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id = " + id +
                ", name = " + getName() +
                ", position = " + position +
                ", jobDescript = '" + jobDescript + '\'' +
                ", qualifications = '" + qualifications + '\'' +
                ", salary = ₦" + salary +
                '}';
    }
}

