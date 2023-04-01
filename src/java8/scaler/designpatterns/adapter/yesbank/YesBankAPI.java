package java8.scaler.designpatterns.adapter.yesbank;

public class YesBankAPI {
    public boolean checkUser(){
        System.out.println("User checked");
        return true;
    }
    public double checkBalance(){
        return 10.3;
    }
    public float transferFunds(){
        return 5.1f;
    }
}
