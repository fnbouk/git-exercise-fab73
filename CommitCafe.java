public class CommitCafe {

    private static String barista = "Farouk";
    private static String nickname = "Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("[BREW] " + barista + " brewed a cup of " + drink + ".");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}