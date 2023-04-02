package java8.scaler.designpatterns.builder;

import java8.scaler.designpatterns.builder.exception.InvalidGradYearException;

public class Client {
    public static void main(String[] args) throws InvalidGradYearException {
        Student s = Student.builder()
                            .setStudentId(1)
                            .setStudentName("scaler")
                            .setGraduationYear(2024)
                            .setYearsOfExperience(1)
                        .build();
    }
}
