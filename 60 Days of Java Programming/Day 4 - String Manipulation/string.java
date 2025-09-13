//SI calculator programme

import java.util.Scanner;
public class string{
    public static void main(String args[]){
        //declaring the variable
        float prin,rate;
        int time;

        //creating a scanner class
        Scanner sem = new Scanner(System.in);

        //defining the variables
        System.out.print("Enter principle amount: ");
        prin = sem.nextFloat();
        System.out.print("Enter rate of interest: ");
        rate = sem.nextFloat();
        System.out.print("Enter time period: ");
        time = sem.nextInt();

        //calculating the SI 
        double tot = (prin*rate*time)/100;
        
        //closing the scanner class
        sem.close();

        //Showing the output
        System.out.printf("Your total amount is: %.2f \n",tot);
    }
}