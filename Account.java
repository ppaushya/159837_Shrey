/*
 Write a program to make a package Balance in which has Account class
with Display_Balance method in it. Import Balance package in another program to
access Display_Balance method of Account class.
 */
package balance;

/**
 *
 * @author Admin
 */
public class Account {
    private int balance;
    public void getBalance(int b)
    {
        balance=b;
    }
    public void Display_Balance()
    {
        System.out.println("Balance is "+balance);
    }
}
