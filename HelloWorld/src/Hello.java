public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, Bailey");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or borth of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

//        The Ternary Operator
//        operand1 ? operand2 : operand3
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

//        Operator Challenge
        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double myDoubleProduct = (myFirstDouble + mySecondDouble) * 100.00;
        double myRemainder = myDoubleProduct % 40.00;
        boolean isNoRemainder = (myRemainder == 0.00) ? true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
