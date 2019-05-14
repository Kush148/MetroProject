import java.util.Scanner;

public class LetsGo {
    public static void main(String[] args) {
        int noOfMetroStations;
        int retries = 0;
        int passOnTrain, passOffTrain, newPass;

        System.out.println("Welcome To LetsGo Transport");

        Scanner userInput = new Scanner(System.in);

        do { //for valid number of Stations
            System.out.println("Please enter the total number of Metro Stations (Must be >=3)");
            noOfMetroStations = userInput.nextInt();
        } while (noOfMetroStations < 3);

        Train train = new Train();
        newPass = (int) (Math.random() * ((300 - 1) + 1)) + 1; //(Math.random() * ((max - min) + 1)) + min
        passOffTrain = (int) (Math.random() * ((300 - 1) + 1)) + 1;
        passOnTrain = newPass - passOffTrain;

    }
}
