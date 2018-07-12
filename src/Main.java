import java.util.Random;

public class Main {
    // This program should generate 10 random integers from 1 to 6. Fix it so that it works...
    // stars at 1 ends at 6  to do that you can add 1 to it or
    // you can put the bound up to 7 excluding 7 but starts at o since it does not have +1
    public static void main(String[] args) {
        output("Generate 10 random integers between 0 and 6");

        Random rnd= new Random();

        for (int i = 1; i <= 10; ++i) {
            int randomInt =   1+ rnd.nextInt(6);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage) {
        System.out.println(aMessage);
    }
}
