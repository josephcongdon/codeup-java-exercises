public class HighLow {


    public static boolean printGuessMessage(int guess, int randomNum) {
        boolean willKeepGoing = true;
        if (guess == randomNum) {
            System.out.println("GOOD GUESS!");
            willKeepGoing = false;
        } else if (guess < randomNum) {
            System.out.println("HIGHER");
        } else {
            System.out.println("LOWER");
        }
        return willKeepGoing;
    }

    public static void runGuesses(int randomNum) {
        System.out.println("Guess a number between 1 and 100");
        int guess = MethodsExercises.getInteger(1, 100);

        if (printGuessMessage(guess, randomNum)) {
            runGuesses(randomNum);
        }
    }

    public static void init() {
        System.out.println("Welcome to the High / Low Game!");
        double randomNum = MethodsExercises.getRandomInt(1, 100);
        System.out.println(randomNum);
        runGuesses((int) randomNum);
    }

    public static void main(String[] args) {
        init();
    }

}

