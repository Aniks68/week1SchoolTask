package Services.ModelServices;

import Models.Applicant;
import Models.Staff;
import Models.Student;
import Services.ManagementDuties;
import Services.Position;

import java.util.Objects;

public class Principal extends Staff implements ManagementDuties {

    public Principal() {
    }

    public Principal(String name, int age, String address, int id, Position position,
                     String jobDescript, String qualifications, int salary) {
        super(name, age, address, id, position, jobDescript, qualifications, salary);
    }

    @Override
    public String expelStudent(String behaviour) {
        if (Objects.equals(Student.getBehaviour(), "Troublesome")) {
            return "You are expelled!";
        }
        return "You are a good student.";
    }

    @Override
    public String promoteStudent(double sessionAverage) {
        int newGrade;
        Student.setSessionAverage(sessionAverage);
        if (Student.getGrade() == 6) {
            return "You are a graduate!";
        }
        if (Student.getSessionAverage() >= 55.00) {
            newGrade = Student.getGrade() + 1;
            Student.setGrade(newGrade);
            return "You have been promoted. Congratulations!";
        } else {
            newGrade = Student.getGrade();
            Student.setGrade(newGrade);
            return "You have not been promoted. Work harder.";
        }
    }

    @Override
    public String admitStudent(int applicantAge) {
        if (Applicant.getAssessmentScore() >= 65) {
            return "You are admitted.";
        }
        return "Admission is not grant, unfortunately. Please try again after more practice.";
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }
}
