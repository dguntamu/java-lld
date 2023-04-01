package java8.scaler.designpatterns.prototype;

public class PrototypeClient {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Student student1 = new Student();
        student1.setStudentName("S1");
        student1.setBatchName("B1");
        student1.setInstructorName("Ins1");
        student1.setDataOfJoinBatch("Apr");
        student1.setPsp(60);

        Student student2 = student1.clone();
        student1.setStudentName("DJ");
        registry.save(student1);
        registry.save(student2);
        System.out.println(student1+", "+student2);
    }
}
