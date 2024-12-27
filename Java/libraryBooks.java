public class libraryBooks {

    public static void main(String[] args) {
        String bookTitle = "Java programming is fun and educational";
        System.out.println("Book title contains 'fun'? " + bookTitle.contains("fun"));
        System.out.println("Replacing 'educational' with 'awesome': " + bookTitle.replace("educational", "awesome"));
        System.out.println("Lenght of book title : " + bookTitle.length());
        System.out.println("Limiting to 17 characters : " + bookTitle.substring(0, 17));
    }
}
