package java8.scaler.designpatterns.builder;

import java8.scaler.designpatterns.builder.exception.InvalidGradYearException;
import java8.scaler.designpatterns.builder.exception.InvalidNameException;
import java8.scaler.designpatterns.builder.exception.InvalidYoeException;

public class Student {
    private Integer studentId;
    private String studentName;
    private Integer graduationYear;
    private Double psp;
    private Integer yearsOfExperience;
    private String batchName;

    public Student(Builder builder) {
        this.studentId = builder.studentId;
        this.studentName = builder.studentName;
        this.graduationYear = builder.graduationYear;
        this.psp = builder.psp;
        this.yearsOfExperience = builder.yearsOfExperience;
    }

    //add setters in student with proper validation if updation is required
    //generally we dont update objects created with Builder pattern
    static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private Integer studentId;
        private String studentName;
        private Integer graduationYear;
        private Double psp;
        private Integer yearsOfExperience;

        public Builder setStudentId(Integer studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public Builder setGraduationYear(Integer graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setYearsOfExperience(Integer yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public void validate() throws InvalidGradYearException {
            if (studentName == null) {
                throw new InvalidNameException("Name is invalid");
            }
            if (yearsOfExperience < 1) {
                throw new InvalidYoeException("Years of experience should be atleast 1");
            }
            if (graduationYear >= 2023) {
                throw new InvalidGradYearException("Grad year should be 2022 or earlier");
            }
        }

        public Student build() throws InvalidGradYearException {
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }
}
