public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Dekoder-py");

        boolean isAlien = false;
        if (isAlien == false) { // Can be simplified to !isALien but leaving as is to follow the example
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
        if (newValue == 50){
            System.out.println("There was an error, but I fixed it :)");
        }
    }
}
