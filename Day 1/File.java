import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    //1.
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int a = input.nextInt();
    if(a%100 == 0){
        if(a%400 == 0){
            System.out.println("The year is a leap year");
        }else{
            System.out.println("The year is not a leap year");
        }
    }else{
        if(a % 4 == 0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
    for(int i = 0; i < a; i++)
    {
        //space
        for(int j = 1; j <= a-i; j++){
            System.out.print("  ");
        }
        //Star
        for(int k = 1; k <= (2*i) - 1; k++){
            System.out.print("* ");
        }
        
        System.out.println("");
    // }
  }
}
