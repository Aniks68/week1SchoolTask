package Services;

public enum Position {
    BURSAR(65000, "Finance management"),
    SECRETARY(50000, "Communications management between public and school"),
    TYPIST(30000, "Preparation of school documents"),
    DRIVER(40000, "Driving school bus"),
    CONDUCTRESS(37000, "Accompanying a driver to pick up and drop off students"),
    CLEANER(35000, "Sanitation of the school premises"),
    SECURITY(40000, "Ensuring the safety of persons and resources within the premises"),
    PRINCIPAL(85000, "School Management"),
    VICE_PRINCIPAL(75000, "Staff and student organisation"),
    TEACHER(55000, "Subject teaching");

    private final int salary;
    private String jobDescript;

    Position(int salary, String jobDescript) {
        this.salary = salary;
        this.jobDescript = jobDescript;
    }

    public int getSalary() {
        return salary;
    }

    public String getJobDescript() {
        return jobDescript;
    }
}
