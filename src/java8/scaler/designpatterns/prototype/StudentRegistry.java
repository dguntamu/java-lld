package java8.scaler.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String,Student> map = new HashMap<>();

    public void save(Student student){
        map.put(student.getBatchName(),student);
    }
    public Student getStudent(String batchName){
        return map.get(batchName);
    }
}
