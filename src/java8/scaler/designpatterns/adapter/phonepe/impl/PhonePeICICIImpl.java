package java8.scaler.designpatterns.adapter.phonepe.impl;

import java8.scaler.designpatterns.adapter.icicibank.ICICIBankAPI;
import java8.scaler.designpatterns.adapter.phonepe.PhonePeBankAPI;

public class PhonePeICICIImpl implements PhonePeBankAPI {
    private ICICIBankAPI iciciBankAPI;

    public PhonePeICICIImpl(ICICIBankAPI iciciBankAPI) {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    public void authUser() {
        iciciBankAPI.authenticateUser();
    }

    public int checkBalance() {
        return (int)iciciBankAPI.returnBalance();
    }

    public boolean transfer() {
         if(iciciBankAPI.transferAmount() > 0){
             return true;
         }else {
             return false;
         }
    }
}
