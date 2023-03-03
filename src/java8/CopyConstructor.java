package java8;

public class CopyConstructor {
    public static void main(String[] args) {
        Phone phone1 = new Phone(123,11,5000);
        Phone phone2 = phone1;
        phone2.setVerison(phone1.getVerison()+1);
        System.out.println(phone1.getVerison());
        System.out.println(phone1.getPrice());
        System.out.println(phone1.getPhoneModel());
        System.out.println("============");
        System.out.println(phone2.getVerison());
        System.out.println(phone2.getPrice());
        System.out.println(phone2.getPhoneModel());
    }
}
class Phone{
    private int phoneModel;
    private int verison;
    private int price;

    public Phone(int phoneModel,int verison, int price){
        this.phoneModel = phoneModel;
        this.verison = verison;
        this.price = price;
    }

    public Phone(Phone newPhone){
        this.verison = newPhone.verison + 1;
        this.price = newPhone.price + 1000;
    }

    public int getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(int phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getVerison() {
        return verison;
    }

    public void setVerison(int verison) {
        this.verison = verison;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}