package java8.scaler;

public class InhertenceConstructor {
    public static void main(String[] args) {
        Instructor i = new Instructor(1,2);
    }

}
class User{
    private int id;
    private String name;
    private int ph;

    public User(int id, String name, int ph) {
        this.id = id;
        this.name = name;
        this.ph = ph;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }
}
class Instructor extends User{
    private int batch;
    private int rating;

    Instructor(int batch, int rating){
        //super(22,"abc",7715);
        super(0,null,0);
        this.batch =  batch;
        this.rating = rating;
    }
    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getReting() {
        return rating;
    }

    public void setReting(int reting) {
        this.rating = reting;
    }
}