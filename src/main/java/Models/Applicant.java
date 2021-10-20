package Models;

public class Applicant extends Person{
    int appliedClass;
    static int assessmentScore;

    public Applicant(String name, int age, String address, int appliedClass, int assessmentScore) {
        super(name, age, address);
        this.appliedClass = appliedClass;
        this.assessmentScore = assessmentScore;
    }

    public int getAppliedClass() {
        return appliedClass;
    }

    public static int getAssessmentScore() {
        return assessmentScore;
    }
}
