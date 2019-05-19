import java.util.Scanner;

public class LetsGo {
    static int remainingPass = 0;
    public static void main(String[] args) {
        int noOfMetroStations;
        int retries = 0, remainingCapacity = 300;
        int passOnTrain = 0, passLeftTrain, newPass;


        System.out.println("Welcome To LetsGo Transport");

        Scanner userInput = new Scanner(System.in);

        do { //for valid number of Stations
            System.out.println("Please enter the total number of Metro Stations (Must be >=3)");
            noOfMetroStations = userInput.nextInt();
        } while (noOfMetroStations < 3);

        System.out.println("This metro line has " + noOfMetroStations + " stations.");
        Train train = new Train();
        boolean isTrue = true;
        do {

            for (int i = 0; i < noOfMetroStations; i++) {
                if (i == 0) {
                    newPass = (int) (Math.random() * ((300 - 1) + 1)) + 1; //(Math.random() * ((max - min) + 1)) + min
                    System.out.println("check new pass : " + newPass);
                    // passLeftTrain = (int) (Math.random() * ((300 - 1) + 1)) + 1;
                    // passOnTrain = newPass - passLeftTrain;
                    System.out.println("Metro " + train.metroID + "(new Train) leaving station " + (i + 1) + " East bound with " + newPass + " passenger(s).");
                    System.out.println("Passenger who got off : 0");
                    System.out.println("New passenger waiting to board : " + newPass);
                    System.out.println("Passengers got on : " + newPass);
                    passOnTrain = newPass;
                    remainingCapacity -= newPass;
                    System.out.println("check remaining capacity : " + remainingCapacity);
                } else {
                    System.out.println("check pass on train : " + passOnTrain);
                    passLeftTrain = (int) (Math.random() * ((passOnTrain - 1) + 1)) + 1;
                    System.out.println("check left pass : " + passLeftTrain);
                    remainingCapacity += passLeftTrain;
                    newPass = (int) (Math.random() * ((300 - 1) + 1)) + 1; //(Math.random() * ((max - min) + 1)) + min
                    System.out.println("check new pass 2 :" + newPass);
                    System.out.println("check remaining capacity" + newPass);
                    if (remainingCapacity < newPass) {
                        remainingPass = newPass - remainingCapacity;
                        newPass -= remainingPass;
                    }
                    passOnTrain = passOnTrain - passLeftTrain + newPass;
                    System.out.println("check total pass : " + passOnTrain);
                    System.out.println("\nMetro " + train.metroID + " leaving station " + (i + 1) + " East bound with " + passOnTrain + " passenger(s).");
                    System.out.println("Passenger who got off : " + passLeftTrain);
                    System.out.println("New passenger waiting to board : " + remainingPass);
                    System.out.println("Passengers got on : " + newPass);
                }

                if (remainingPass > remainingCapacity) {

                }
            }
            System.out.println("Do you want to continue following Metro : " + train.metroID);
            isTrue = false;
        } while (isTrue);

    }
}
