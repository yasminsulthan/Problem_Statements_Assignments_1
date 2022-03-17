package com.question18;

import java.util.HashMap;
import java.util.Scanner;

public class repeatingDecimal {
	/*public static void main ( String [] args )
    {
       int num;
       int den;
       double result;


       num = getNum();
       den = getDen();
       result = getResult(num, den);
       printResult(num, den, result);

    }

    public static int getNum()
     {
    Scanner input = new Scanner (System.in);

    int num;

    System.out.print("Please enter the numerator: ");
    num = input.nextInt();

    return num;
     }

    public static int getDen()
        {
       Scanner input = new Scanner (System.in);

       int den;
       System.out.print("Please enter the denominator: ");
       den = input.nextInt();

       return den;

        }


public static double getResult(int num, int den)
{
    double result;
    result = num / den;
    return result;
}

public static void printResult(int num, int den, double result)
{
System.out.printf("The fraction %d / %d in decimal form is %f\n", num, den, result);
}*/
	static String fractionToDecimal(int numr, int denr)
    {
       
        String res = "";
 
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.clear();
 
        int rem = numr % denr;
 
        
        while ((rem != 0) && (!mp.containsKey(rem)))
        {
            
            mp.put(rem, res.length());
 
        
            rem = rem * 10;
 
         
            int res_part = rem / denr;
            res += String.valueOf(res_part);
 
           
            rem = rem % denr;
        }
 
        if (rem == 0)
            return "";
        else if (mp.containsKey(rem))
            return res.substring(mp.get(rem));
 
        return "";
    }
 
    
    public static void main(String[] args)
    {
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter numerator");
        int numr = s.nextInt();
        System.out.println("Enter denominator");
        int denr = s.nextInt();
        String res = fractionToDecimal(numr, denr);
        
        if (res == "")
            System.out.print("No recurring sequence");
        else
            System.out.print("Recurring sequence is "
                             + res);
    }

}
