import java.util.Scanner;

public class keyboardRead {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the age:");
        int age = keyboard.nextInt();

        System.out.println("Enter the money:");
        float money = keyboard.nextFloat();

        System.out.println("Enter the name:");
        
        if(keyboard.hasNextLine()) { //Added because after a float or int, this netxLine is needed to read the next line whotout problems
            keyboard.nextLine();
        }
        
        String name = keyboard.nextLine();

        keyboard.close();

        System.out.println(name + " having age = " + age + " has " + money + " dollars in pocket.");
    }
}
