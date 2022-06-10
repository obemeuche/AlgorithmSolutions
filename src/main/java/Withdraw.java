import java.util.ArrayList;
import java.util.Arrays;

public class Withdraw {
    //    An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//
//    Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as
//    few bills as possible, determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs
//    to dispense (in that order).
//
//    Here is the specification for the withdraw method you'll complete:
//            Challenge.withdraw(amount)
//    Parameters
//    amount: Integer - Amount of money to withdraw. Assume that the amount is always divisible into
//    100, 50 and 20 bills.
//
//            Return Value
//    Integer[] - An array of 3 integers representing the number of 100, 50 and 20 dollar bills
//    needed to complete the withdraw (in that order).
//
//    Constraints
//    40 ≤ amount ≤ 1000
//    Examples
//    amount Return Value
//    250    [2,1,0]
//            260    [2,0,3]
//            370    [3,1,1]

    public static ArrayList<Integer> withdraw (int amount) {
        int hundredNotes = 0;
        int fiftyNotes = 0;
        int twentyNotes = 0;
        while (amount - 100 >= 50 || amount == 100) {
            hundredNotes++;
            amount -= 100;
        }
        while ((amount - 50) % 20 == 0 || amount == 50) {
            fiftyNotes++;
            amount -= 50;
        }
        while (amount >= 20) {
            twentyNotes++;
            amount -= 20;
        }
        return new ArrayList<>(Arrays.asList(hundredNotes,fiftyNotes,twentyNotes));
    }
}
