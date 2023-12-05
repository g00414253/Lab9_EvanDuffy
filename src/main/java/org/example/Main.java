package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Person myPerson=new Person("Evan","Glasan","0851234567");
        System.out.println(myPerson.toString());

        Customer newCustomer =new Customer("Evan","Glasan","0851234567",true,"33rty5321");
      System.out.println(newCustomer.toString());

      Customer Part1 = new Customer("John","Sligo", "123456787",true,"834578354378");
      System.out.println(Part1.toString());

      Customer Part2= new Customer();
      Part2.setName("Mark");
      Part2.setAddress("Dublin");
      Part2.setNumber("0871525272");
      Part2.setMail(false);
      Part2.setCustomerNum("1222222");

      System.out.println(Part2.toString());



    }
}