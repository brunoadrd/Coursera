public class emailManipulate {
    public static void main(String args[]) {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        
        email = email.replace("example", "gmail");

        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("Index of @ in the adress is: " + email.indexOf("@"));
    }
}