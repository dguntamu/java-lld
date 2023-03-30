package java8.scaler.adapter.phonepe.impl;

import java8.scaler.adapter.phonepe.PhonePeBankAPI;
import java8.scaler.adapter.yesbank.YesBankAPI;

public class PhonePeYesBankImpl implements PhonePeBankAPI {
    private YesBankAPI yesBankAPI;

    public PhonePeYesBankImpl(YesBankAPI yesBankAPI) {
        this.yesBankAPI = new YesBankAPI();
    }

    /**
     *
     */
    @Override
    public void authUser() {
        yesBankAPI.checkUser();
    }

    /**
     * @return
     */
    @Override
    public int checkBalance() {
        return (int)yesBankAPI.checkBalance();
    }

    /**
     * @return
     */
    @Override
    public boolean transfer() {
        if(yesBankAPI.transferFunds() > 0){
            return true;
        }else {
            return false;
        }
    }
}
