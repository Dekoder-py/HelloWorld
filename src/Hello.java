public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Dekoder-py");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("There was an error, but I fixed it :)");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("It's not a car.");
        }

        String makeOfCar = "Toyota";
        boolean isDomestic = (makeOfCar == "Toyota") ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        int userAge = 21;
        String eighteenPlus = userAge >= 18 ? "Eighteen or older" : "Younger than 18";
        System.out.println(eighteenPlus);

    }
;}
