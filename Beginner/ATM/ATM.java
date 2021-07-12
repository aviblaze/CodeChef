import java.util.*;


class ATM{
    public static void main(String[] args){

        int debit = 0;
        double total = 0;
        String[] inp = new String[2];

        Scanner sc = new Scanner(System.in);
        inp = sc.nextLine().split(" ");
        debit = Integer.parseInt(inp[0]);
        total = Double.parseDouble(inp[1]);
        sc.close();

        if(debit % 5 == 0)
        {
            double finalBal = total - debit - 0.5;
            if(finalBal >= 0){
                System.out.printf("%.2f",finalBal);
            }else{
                System.out.printf("%.2f",total);
            }
        }else{
            System.out.printf("%.2f",total);
        }

    }
}