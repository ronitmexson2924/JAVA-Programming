import java.util.Scanner;
public class main{
    public static void main(String args[]){
        //Basic Syntax of Switch Statements 
        /*
         * switch(expression){
         *      code block
         *      Case 1
         *      break
         *      .
         *      .
         *      Default Case
         *      break;
         * }
         */

        // Grade Program
        int marks;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        marks = scanner.nextInt();
        scanner.close();
        int result = marks/10;
        char grade;
        switch(result){
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'B';
                break;
            case 8:
                grade = 'C';
                break;
            case 7:
                grade = 'D';
                break;
            case 6:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Your Grade is: " + grade);

    }
}