
package com.mycompany.exercise05;

abstract class Bankaccount
{
    private String accountnumber;
    private double balance;
    
    public void setaccountnumber(String accno)
    {
        accountnumber=accno;
    }
    
   public void setbalance(double bal)
   {
       balance=bal;
   }
   public String getaccountnumber ()
   {
       return accountnumber;
   }
   public double getbalance ()
   {
       return balance;
   }
   
      abstract void calculateinterest();
}
