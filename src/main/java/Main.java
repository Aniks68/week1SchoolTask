import Models.AcadStaff;
import Models.Student;
import Services.Grade;
import Services.ModelServices.Principal;
import Services.Position;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Student biodun = new Student("Abiodun Oluwafemi", 13, "CITEC Villas, Gwarinpa",
                Grade.GRADE1.getGrade(), Grade.GRADE1.getGradeFee(), new String[]{"Maths", "English", "Sciences"}, "Satisfactory", 67.03);
//        Student musa = new Student("Musa Gabriel", 15, "Maroko PW, Kubwa", Grade.GRADE5.getGrade(), Grade.GRADE5.getGradeFee(), new String[]{"Maths", "English", "Commercial Subjects"});
//        System.out.println(musa.toString());

        System.out.println(biodun.toString());

        Principal obinna = new Principal("Obinna Ani", 54, "Post Service Army Scheme, Kubwa", 001, Position.PRINCIPAL,
                Position.PRINCIPAL.getJobDescript(), "B.Ed", Position.PRINCIPAL.getSalary());

        AcadStaff nnena = new AcadStaff("Nnenna Obiora", 27, "Naval Quarters, 2/1 Kubwa", 061, Position.TEACHER,
                Position.TEACHER.getJobDescript(), "HND, Diploma", Position.TEACHER.getSalary(), new String[]{"Government", "Civic Education"});

        System.out.println(obinna.toString());
        System.out.println(nnena.toString());

        System.out.println(abbrevName("Evan Cole Matthew Folakemi"));
    }

    public static String abbrevName(String name) {
        String[] strArr = name.split(" ");
        String abbrName = "";
        String[] first = new String[strArr.length];
        String[] sbuStr = new String[]{};

        for (int i = 0; i < strArr.length; i++) {
            sbuStr = strArr[i].split("");
            first[i] = sbuStr[0].toUpperCase(Locale.ROOT);
        }
        abbrName = String.join(".", first);
        return abbrName;
    }
}
