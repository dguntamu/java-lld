package java8.scaler.designpatterns.adapter.phonepe;

import java8.scaler.designpatterns.adapter.icicibank.ICICIBankAPI;
import java8.scaler.designpatterns.adapter.phonepe.impl.PhonePeICICIImpl;

public class PhonePeClient {
    public static void main(String[] args) {
        //PhonePeBankAPI phonePeBankAPI = new PhonePeYesBankImpl(new YesBankAPI());
        PhonePeBankAPI phonePeBankAPI = new PhonePeICICIImpl(new ICICIBankAPI());
        System.out.println(phonePeBankAPI.checkBalance());
        System.out.println(phonePeBankAPI.transfer());
        phonePeBankAPI.authUser();
    }
}
