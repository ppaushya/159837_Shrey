/*
 *Write a program to make a package Balance in which has Account class
with Display_Balance method in it. Import Balance package in another program to
access Display_Balance method of Account class.
 */
package balance;
import balance.Account.*;

/**
 *
 * @author Admin
 */
public class MainClass {
    public static void main(String[] args)
    {
    Account obj=new Account();
    obj.getBalance(5000);
    obj.Display_Balance();
    }
}
