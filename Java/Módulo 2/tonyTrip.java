public class tonyTrip {
    public static void main(String[] args) {
        int moneyLeftWithToni = 30;

        if (moneyLeftWithToni >= 300) {
            System.out.println("Go to Las Vegas ");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop for some souvenirs");
        } else if (moneyLeftWithToni >= 200) { 
            System.out.println("Go to Hoover Dam.");
        } else if (moneyLeftWithToni >= 100) {
            System.out.println("Go to Area 51.");
        } else if (moneyLeftWithToni >= 50) {
            System.out.println("Go have some ice cream.");
        } else {
            System.out.println("Think about the money spent");
        }
        
        System.out.println("On trip to parents.");
    }
}
