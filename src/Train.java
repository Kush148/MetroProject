import java.util.Random;

public class Train {
    static int stationNum;
    static int passTotal;//passengers currently on the train.
    static int nextStation;
    int metroID;
    int direction; //implement four direction.1East 2west 3north 4 south //i thinks its better if we take this as string.

    public Train() {
        metroID = (int) (Math.random() * ((1000 - 1) + 1)) + 1; //(Math.random() * ((max - min) + 1)) + min
        stationNum = 0;
        direction = 1;
        passTotal = 0;
    }

    public Train(int metroID) {
        this.metroID = metroID;
        stationNum = 0;
        direction = 1;
        passTotal = 0;

    }

    public static int getStationNum() {
        return stationNum;
    }

    public static void setStationNum(int stationNum) {
        Train.stationNum = stationNum;
    }

    public static int getPassTotal() {
        return passTotal;
    }

    public static void setPassTotal(int passTotal) {
        Train.passTotal = passTotal;
    }

    //Accessor and Mutator methods
    public int getMetroID() {
        return metroID;
    }

    public void setMetroID(int metroID) {
        this.metroID = metroID;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int setNextStation(int lastStation) {
        //   f. nextStation(int lastStation) which determines the next station the train is to go to,
// and changes the direction of the train when necessary. (See the rules set in assignment 3).
        // This method should return a integer value which will specify the action that needs to be done:
// passengers leaving, passengers boarding or passengers getting off and boarding
        return 0;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {

        return "Metro :- " + metroID
                + " is at Station Number " + stationNum
                + " heading in " + direction + "direction with" //
                + passTotal + " passengers onboard.";
    }
}


//    g. toString: This method will return in a string the metroID, the current station number,
// the direction the train is travelling in as well as the number of passengers on the train.
//    h. equals: This method will return true if the calling object and
// the passed object have the same number of passengers.
//}
