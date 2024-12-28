public class superheroesString {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names: " + superheroes[0] + ", " + superheroes[1] + ", " + superheroes[2] + ", " + superheroes[3] + ", " + superheroes[4]);

        // Print the introduction years
        System.out.println("Introduction Years: " + introductionYears[0] + ", " + introductionYears[1] + ", " + introductionYears[2] + ", " + introductionYears[3] + ", " + introductionYears[4]);

        // 3a: Print the original name of the third superhero
        System.out.println("Third superhero: " + superheroes[2]);
        // 3b: Modify the third superhero name
        superheroes[2] = "Thor";
        // 3c: Print the modified name of the third superhero
        System.out.println("Third superhero modified: " + superheroes[2]);

        // 4a: Print the original year of introduction of the third superhero
        System.out.println("Third superhero year introduction: " + introductionYears[2]);
        // 4b: Modify the year of introduction of the third superhero
        introductionYears[2] = 2011;
        // 4c: Print the modified year of introduction of the third superhero
        System.out.println("Third superhero year introduction modified: " + introductionYears[2]);

        // 5a: Print the length of the array containing superhero names
        System.out.println("Length of array of the superheroes: " + superheroes.length);
        // 5b: Print the length of the array containing superhero year of introduction
        System.out.println("Length of array of the superheroes introduction: " + introductionYears.length);

    }
}
