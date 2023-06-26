package com.mycompany.exercise05;

public class Exercise05 {

    public static void main(String[] args) 
    {
       SavingsAccount s1 = new SavingsAccount();
       s1.setbalance(20000000);
       s1.calculateinterest();
       
       CheckingAccount c1 = new CheckingAccount();
       c1.setbalance(1000000);
       c1.calculateinterest();
    }
}
