package Services.ModelServices;

import Models.Applicant;
import Models.Student;
import Services.Grade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    private Principal principal;

    @BeforeEach
    void setUp() {
        principal = new Principal();
    }

    @Test
    @DisplayName("Should test how to expel student")
    void expelStudent() {
        // Given
        Student student = new Student("Faruk", 14, "Kubwa", Grade.GRADE4.getGrade(),
                Grade.GRADE4.getGradeFee(), new String[]{"Maths", "English", "Sciences"}, "Troublesome", 53.87);

        final String expectedResult = "You are expelled!";

        // Method call

        final String actualResult = principal.expelStudent(student.getBehaviour());

        assertEquals(expectedResult, actualResult);

        // Reverse test

        Student student2 = new Student("Gabriel", 12, "Gwarinpa", Grade.GRADE2.getGrade(),
                Grade.GRADE2.getGradeFee(), new String[]{"Maths", "English", "Sciences"}, "A good boy", 81.29);

        final String expectedResult2 = "You are a good student.";

        // Method call

        final String actualResult2 = principal.expelStudent(student2.getBehaviour());

        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    @DisplayName("Should test if a student deserves promotion or not")
    void promoteStudent() {
        // Given

        Student mike = new Student("Michael", 13, "Phase IV, Kubwa", Grade.GRADE3.getGrade(),
                Grade.GRADE3.getGradeFee(), new String[]{"Maths", "English", "Commercial Subjects"}, "Active and helpful", 74.16);

        final String expectedResult = "You have been promoted. Congratulations!";

        // Method call

        final String actualResult = principal.promoteStudent(mike.getSessionAverage());

        assertEquals(expectedResult, actualResult);

        // Reverse test

        // Given

        Student rachel = new Student("Rachel", 15, "Berger Camp 2/1, Kubwa", Grade.GRADE5.getGrade(),
                Grade.GRADE5.getGradeFee(), new String[]{"Maths", "English", "Commercial Subjects"}, "Quiet and reclusive", 44.92);

        final String expectedResult2 = "You have not been promoted. Work harder.";

        // Method call

        final String actualResult2 = principal.promoteStudent(mike.getSessionAverage());

        //assertEquals(expectedResult2, actualResult2);

        // Exception test
        Student austin = new Student("Austin", 15, "Behind NYSC Camp, Kubwa", Grade.GRADE6.getGrade(),
                Grade.GRADE6.getGradeFee(), new String[]{"Maths", "English", "Commercial Subjects"}, "Quiet and reclusive", 84.92);

        final String expectedResult3 = "You are a graduate!";

        // Method call

        final String actualResult3 = principal.promoteStudent(mike.getSessionAverage());

        assertEquals(expectedResult3, actualResult3);
    }

    @Test
    @DisplayName("Should grant admission or refuse admission based on assessment score")
    void admitStudent() {
        // Given

        Applicant matthew = new Applicant("Matthew", 10, "Pipeline, Behind NYSC, Kubwa", 1, 86);

        final String expectedResult = "You are admitted.";

        // Method Call
        final String actualResult = principal.admitStudent(matthew.getAssessmentScore());

        assertEquals(expectedResult, actualResult);

        // Reverse test

        Applicant gabzy = new Applicant("Gabzy", 10, "Byazhin, Kubwa", 2, 38);

        final String expectedResult2 = "Admission is not grant, unfortunately. Please try again after more practice.";

        // Method Call
        final String actualResult2 = principal.admitStudent(gabzy.getAssessmentScore());

        assertEquals(expectedResult2, actualResult2);

    }
}