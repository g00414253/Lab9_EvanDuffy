package org.example;

public class Customer extends Person {
    private Boolean Mail;
    private String CustomerNum;

    public Customer() {
    }

    public Customer(Boolean mail, String customerNum) {
        Mail = mail;
        CustomerNum = customerNum;
    }

    public Customer(String Name, String Address, String Number, Boolean mail, String customerNum) {
        super(Name, Address, Number);
        Mail = mail;
        CustomerNum = customerNum;
    }

    public Boolean getMail() {
        return Mail;
    }

    public void setMail(Boolean mail) {
        Mail = mail;
    }

    public String getCustomerNum() {
        return CustomerNum;
    }

    public void setCustomerNum(String customerNum) {
        CustomerNum = customerNum;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                " ,Mail=" + Mail +
                ", CustomerNum='" + CustomerNum + '\'' +
                '}'
                ;
    }
}
