import java.util.Scanner;
public class calorie_meter {
    public static void main(String args[]){
        //Welcome Message
        System.out.println("Welcome to the Calorie Counter Pro!");
        
        //Declaring the variable
        String food1,food2,food3;
        int cal1,cal2,cal3;
        int total_cal;

        //initialize the scanner
        Scanner scanner = new Scanner(System.in);
        
        //Taking the input of food items and total calories
        System.out.print("Enter the name of 1st food items: ");
        food1 = scanner.nextLine();
        System.out.print("Enter the calorie amount of " + food1 + ": ");
        cal1 = scanner.nextInt();
        System.out.print("Enter the name of 2nd food items: ");
        food2 = scanner.nextLine();
        System.out.print("Enter the calorie amount of " + food2 + ": ");
        cal2 = scanner.nextInt();
        System.out.print("Enter the name of 3rd food items: ");
        food3 = scanner.nextLine();
        System.out.print("Enter the calorie amount of " + food3 + ": ");
        cal3 = scanner.nextInt();

        //totaling the calories
        total_cal = cal1+cal2+cal3;

        //Display the summary
        System.out.println("1. " + food1 + " has " + cal1 + " calories");
        System.out.println("1. " + food2 + " has " + cal2 + " calories");
        System.out.println("1. " + food3 + " has " + cal3 + " calories");
        System.out.println("The total amount of calories in the food is: " + total_cal);

        //closing the scanner
        scanner.close();
    }
}
