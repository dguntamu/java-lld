package java8.scaler.adapter.phonepe;

import java8.scaler.adapter.icicibank.ICICIBankAPI;
import java8.scaler.adapter.phonepe.impl.PhonePeICICIImpl;
import java8.scaler.adapter.phonepe.impl.PhonePeYesBankImpl;
import java8.scaler.adapter.yesbank.YesBankAPI;

public class PhonePeClient {
    public static void main(String[] args) {
        //PhonePeBankAPI phonePeBankAPI = new PhonePeYesBankImpl(new YesBankAPI());
        PhonePeBankAPI phonePeBankAPI = new PhonePeICICIImpl(new ICICIBankAPI());
        System.out.println(phonePeBankAPI.checkBalance());
        System.out.println(phonePeBankAPI.transfer());
        phonePeBankAPI.authUser();
    }
}
