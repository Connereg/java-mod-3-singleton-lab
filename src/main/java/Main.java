public class Main {
    public static void main(String[] args) {
        // your code here
        String firstString = "This is the first string to log";
        Logger logger = Logger.getInstance();

        logger.log(firstString);

        String secondString = "This is the Second, it will overwrite the Original message";

        logger.log(secondString);

    }
}
