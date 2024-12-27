public class examFirstModule {
    public static void main(String [] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        int purchasedMovieTickets = 8;
        double pricePerTicket = 10.57;
        
        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + username);
        System.out.println("Movie: " + movieTitle.toUpperCase());
        System.out.println("Number of Tickets: " + purchasedMovieTickets);
        System.out.println("Price per Ticket: $" + pricePerTicket);

        double ticketsCost = purchasedMovieTickets * pricePerTicket;

        System.out.printf("Total price of %d tickets: $%.2f\n\n", purchasedMovieTickets, ticketsCost);
        System.out.println("Thanks for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}
