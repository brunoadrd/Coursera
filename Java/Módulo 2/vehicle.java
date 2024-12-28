import java.util.Scanner;

public class vehicle {
    public static void main(String[] args) {

        // Declare the necessary variables for the car's state and add scanner object
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyBoard = new Scanner(System.in);

        while (choice != 5) {
            // Display the current state of the car (engine state, gear, speed)
            System.out.println("------ Car Dashboard ------");
            System.out.println("Speed: " + speed);

            // Add print statements for each variable you want to display or options available to the user
            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            // Prompt the user for their choice and store it in the 'choice' variable
            System.out.print("Enter your choice: ");
            choice = keyBoard.nextInt();

            // Implement a switch statement to handle the different menu choices
            switch(choice) {
                case 1:
                    // Turn on/off the engine
                    isEngineOn = !isEngineOn;
                    if (isEngineOn) {
                        System.out.println("Engine is on.");
                    } else {
                        System.out.println("Engine is off.");
                    }
                    break;
                case 2:
                    // Change gear (P, D, R)
                    System.out.print("Enter the gear (P, D, R): ");
                    gear = keyBoard.next().toUpperCase();

                    break;
                case 3:
                    // Accelerate
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;
                case 4:
                    // Brake
                    if (isEngineOn && speed > 0) {
                        speed -= 5;
                    } else {
                        System.out.println("Cannot apply braking while engine is off or car not moving.");
                    }
                    break;

                default:
                    if (choice != 5) {
                        System.out.println("Invalid choice. Please try again.");
                    }
            }
        }

        System.out.println("\nTurning off engine and exiting the car. Goodbye!");

        keyBoard.close();
    }
}
