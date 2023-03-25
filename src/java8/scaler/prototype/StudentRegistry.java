package java8.scaler.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    Map<String,Student> map = new HashMap<>();

    public void save(Student student){
        map.put(student.getBatchName(),student);
    }
    public Student getStudent(String batchName){
        return map.get(batchName);
    }
}
