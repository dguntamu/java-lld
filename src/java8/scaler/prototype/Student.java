package java8.scaler.prototype;

public class Student implements Prototype<Student>{
    private Integer studentId;
    private String studentName;
    private String address;
    private String batchName;
    private Integer psp;
    private String instructorName;
    private String dataOfJoinBatch;

    public Student(){

    }

    public Student(Student student){
        this.batchName = student.batchName;
        this.instructorName = student.instructorName;
        this.dataOfJoinBatch = student.dataOfJoinBatch;
    }

    public Student clone(){
        return new Student(this);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Integer getPsp() {
        return psp;
    }

    public void setPsp(Integer psp) {
        this.psp = psp;
    }

    public String getDataOfJoinBatch() {
        return dataOfJoinBatch;
    }

    public void setDataOfJoinBatch(String dataOfJoinBatch) {
        this.dataOfJoinBatch = dataOfJoinBatch;
    }
}
