public class Main {
    public static void main(String[] args) {

        // declaring "user input" variables:
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;

        // stores total of all seasons
        double totalCost;


        // spring:
        System.out.println("What is your home maintenance cost in the spring?"); // prompts user
        springCost = 400;       // simulating user input
        System.out.println("You entered: $" + springCost);   // clarifies test runs
        // formula repeats for each season

        // summer:
        System.out.println("What is your home maintenance cost in the summer?"); // summer
        summerCost = 300;
        System.out.println("You entered: $" + summerCost);

        // fall:
        System.out.println("What is your home maintenance cost in the fall?");  // fall
        fallCost = 8000;
        System.out.println("You entered: $" + fallCost);

        // winter:
        System.out.println("What is your home maintenance cost in the winter?");  // winter
        winterCost = 1.99;
        System.out.println("You entered: $" + winterCost);


        // calculate and output total cost:
        totalCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your yearly home maintenance cost is: $" + totalCost);

        // end

    }
}