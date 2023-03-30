package java8.scaler.adapter.icicibank;

public class ICICIBankAPI {
    public int authenticateUser(){
        System.out.println("User Authenticated");
        return 1;
    }
    public double returnBalance(){
        return 2.3;
    }
    public int transferAmount(){
        return 5;
    }
}
