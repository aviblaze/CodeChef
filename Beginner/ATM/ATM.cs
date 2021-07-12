using System;
public class ATM{

    public static void Main(){

        int debit;
        double total;   
        string[] inpsArray = new string[2]; 

        inpsArray = Console.ReadLine().Split();
        debit = Int32.Parse(inpsArray[0]);
        total = Double.Parse(inpsArray[1]);
    
        if(debit % 5 == 0){
            
            double finalBal = total - debit - 0.5;
            if(finalBal >= 0){
                Console.Write(Math.Round(finalBal,2));
            }else{
                Console.Write(Math.Round(total,2));
            }
        }else{

            Console.Write(Math.Round(total,2));
        }
    }
}