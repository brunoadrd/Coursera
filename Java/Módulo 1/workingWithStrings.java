public class workingWithStrings {
    public static void main(String args[]) {
        String text = "Adventure";
        String anotherText= "Adventure";

        System.out.println("Length of the string: " + text.length());
        System.out.println("Index 3 of the string: " + text.charAt(2));
        System.out.println("Substring index 1 until 4: " + text.substring(0, 4));
        System.out.println("Comparing text with anotherText: " + text.equals(anotherText));
        System.out.println("Text UpperCase: " + text.toUpperCase());
        System.out.println("Text LowerCase: " + text.toLowerCase());
        System.out.println("Verifying if text cointains 'vent': " + text.contains("vent"));
        System.out.println("Replacing 'e' to 'a': " + text.replace('e', 'a'));
    }
}