package org.ucsc.ewa.billModule.model;

import java.util.List;




public class cusBilldetails {

    private String cusName;
    private Double balance;
    private List<BillingDetails> bill;
    private String mobileNo;

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<BillingDetails> getBill() {
        return bill;
    }

    public void setBill(List<BillingDetails> bill) {
        this.bill = bill;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    private String nic;
    
    

    
}
