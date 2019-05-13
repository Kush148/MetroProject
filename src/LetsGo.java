import java.util.Scanner;

public class LetsGo {
    public static void main(String[] args) {
        int noOfMetroStations;
        int retries = 0;

        System.out.println("Welcome To LetsGo Transport");
        int checkStations;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Please enter the total number of Metro Stations (Must be >3)");
            checkStations = userInput.nextInt();

        } while (checkStations < 3);

    }
}
