
package com.mycompany.exercise05;

public class SavingsAccount extends Bankaccount
{
    private static final double interest_rate_SA=0.12;
    private double interest;
    @Override
   
         public void calculateinterest()
    {
        interest=getbalance () * interest_rate_SA;
        System.out.println("The interest for the Savings Account is "+interest);
    }
 }

