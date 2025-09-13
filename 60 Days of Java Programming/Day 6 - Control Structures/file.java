import java.util.Scanner;
public class file{
    public static void main(String[] args){
        //syntax of terniary operator
        //condition ? expression1 : expression2;
        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        scanner.close();
        double discount = (age < 18) ? 0.10 : 0.05;
        System.out.println("The discount will be: " + discount*100);
    }
}