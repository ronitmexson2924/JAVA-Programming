// Example Expected Output Here are some example interactions:

// Winning Scenario:

//     Welcome to the Ultimate Adventure Game!
//     Your goal is to find the hidden treasure. Choose wisely!
//     You are at a crossroad. Do you want to go left or right?
//     Type 'left' or 'right': left
//     You walk down a dark path and find a mysterious cave.
//     Do you want to enter the cave or walk past it?
//     Type 'enter' or 'walk': enter
//     Inside the cave, you find a sleeping dragon!
//     Do you want to fight the dragon or sneak past it?
//     Type 'fight' or 'sneak': sneak
//     You sneak past the dragon and find the treasure behind it. You win!


// Invalid Scenario:

//     Welcome to the Ultimate Adventure Game!
//     Your goal is to find the hidden treasure. Choose wisely!
//     You are at a crossroad. Do you want to go left or right?
//     Type 'left' or 'right': forward
//     Invalid choice. You got lost in the wilderness. Game over.
import java.util.Scanner;
     
public class AdventureGame {
     
    public static void main(String[] args) {
        
        // Step 1: Declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);
     
        // Step 2: Display a welcome message and game objective
        System.out.println("Welcome to the Ultimate Adventure Game! \nYour goal is to find the hidden treasure. Choose wisely!\n");
        
        // Step 3: Present the first choice to the player
        System.out.print("You are at a crossroad. Do you want to go left or right?\nType 'left' or 'right': ");
        
        // Step 4: Take the user's first choice input
        String choice1,choice2,choice3;
        choice1 = scanner.nextLine();
        choice1 = choice1.toLowerCase();
        
        // Step 5: First level of decision-making using switch-case
        //MISSING
        switch (choice1){
            case "left":
                System.out.println("\nYou walk down a dark path and find a mysterious cave.");
                
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.print("Type 'enter' or 'walk': ");
                choice2 = scanner.nextLine();
                choice2 = choice2.toLowerCase();

                switch(choice2){
                    case "enter":
                        System.out.println("\nInside the cave, you find a sleeping dragon!");
                        
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.print("Type 'fight' or 'sneak': ");
                        choice3 = scanner.nextLine();
                        choice3 = choice3.toLowerCase();

                        switch (choice3){
                            case "sneak":
                                System.out.println("\nYou sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            
                            case "fight":
                                System.out.println("\nYou were almost there. Nice Try. \nBetter luck next time. You got defeated by the Dragon.");
                                break;
                            
                            default:
                                System.out.println("\nInvalid choice. You got lost in the wilderness. Game over.");
                                break;
                        }
                        break;
                    
                    case "walk":
                        System.out.println("\nThe Dragon heard your steps and killed you. You Lose this time.");
                        break;

                    default:
                        System.out.println("\nInvalid choice. You got lost in the wilderness. Game over.");
                        break;
                        
                }
                break;
            case "right":
                System.out.println("\nYou fell into a valley filled with deadly snakes.");
                break;

            default:
                System.out.println("\nInvalid choice. You got lost in the wilderness. Game over.");
                break;
        }

        scanner.close();
    }
}



