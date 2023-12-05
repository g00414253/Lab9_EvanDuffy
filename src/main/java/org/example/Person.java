package org.example;

public class Person {
    private String Name;
    private String Address;
    private String Number;

    public Person(){
    }

    public Person(String Name,String Address,String Number){
        this.Name=Name;
        this.Address=Address;
        this.Number=Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return  "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Number=" + Number ;
    }
}
