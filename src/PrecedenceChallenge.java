public class PrecedenceChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double stepThree = (firstDouble + secondDouble) * 100;
        double stepFour = stepThree % 40;
        boolean remainder = (stepFour == 0) ? false : true;
        System.out.println(remainder);
        if (!remainder) {
            System.out.println("got some remainder");
        }
    }
}
