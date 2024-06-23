import java.util.Scanner;
import java.util.InputMismatchException;

class Main 
{
    public static void main(String[] args)
 {
        int sum = 0, avg;
       System.out.println("Please enter number of integers");
        Scanner sc1 = new Scanner(System.in);
        int counter = sc1.nextInt();
        if ( counter <= 0 ) {
            throw new InputMismatchException("N must be positive");
        }
        else {
            System.out.println("Please enter "+counter+" numbers");
        }
        for (int i =0; i< counter; i++) {
            int inputnum = sc1.nextInt();
            if (inputnum <= 0){
                throw new InputMismatchException("Please enter again");              
            }
            sum = sum+inputnum;
            System.out.println();
        }
        avg= sum/counter;
        System.out.println(" Average is  "+avg);
    }}
