public class conditionalsAndStrings {
    public static void main(String[] args) {
        String testText = "You're a good person";
        String nameOne = "Bruno Andrade";
        String nameTwo = "bruno Andrade";

        if (testText.contains("good")) {
            System.out.println("You get a gift from Santa");
        } else {
            System.out.println("Next year, please");
        }

        if (nameOne.equalsIgnoreCase(nameTwo)) {
            System.out.println("The names are the same");
        }
    }
}