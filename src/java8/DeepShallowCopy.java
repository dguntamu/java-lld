package java8;

public class DeepShallowCopy {
    public static void main(String[] args) {
        Stundent s1 = new Stundent(10,"student1");
        Stundent s2 = new Stundent(20,"student2");
        Stundent s3 = s1;
        Stundent s4 = new Stundent(30,"student3");
        s3.setStudneName("newName");

        System.out.println("------s1-----");
        System.out.println("Id -> "+s1.getStudentId());
        System.out.println("Name -> "+s1.getStudneName());

        System.out.println("------s2-----");
        System.out.println("Id -> "+s2.getStudentId());
        System.out.println("Name -> "+s2.getStudneName());

        System.out.println("------s3-----");
        System.out.println("Id -> "+s3.getStudentId());
        System.out.println("Name -> "+s3.getStudneName());

        System.out.println("------s4-----");
        System.out.println("Id -> "+s4.getStudentId());
        System.out.println("Name -> "+s4.getStudneName());
    }
}
class Stundent{
    private int studentId;
    private String studneName;

    public Stundent(int studentId, String studneName) {
        this.studentId = studentId;
        this.studneName = studneName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudneName() {
        return studneName;
    }

    public void setStudneName(String studneName) {
        this.studneName = studneName;
    }
}