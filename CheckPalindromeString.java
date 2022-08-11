/*
     Mr. Jain is a currency buyer who purchase some special currency and provides a good return to the seller
     in exchange of that particular currency. If the currency number is palindrome then Mr. Jain will return the 3 times
     more than the provided currency. Mr. Lalwani having some Indian currency notes. Help Mr. Lalwani to check his currency
     is qualifying as palindrome or not.
*/

import java.util.Scanner;

public class CheckPalindromeString {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Currency cur = new Currency();

        System.out.println("Enter Currency Value");
        int curVal = sc.nextInt();

        System.out.println("Enter Currency Number");
        String curNum = sc.next();

        cur.setCurrencyNumber(curNum);
        cur.setCurrencyValue(curVal);

        int returnValue = cur.checkReturnValue();

        System.out.println("you will get Rs. " + returnValue);
    }

}
