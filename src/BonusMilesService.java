public class BonusMilesService {

    public int calculate(int cost){
        int sumForMile = 20;
        int miles = cost / sumForMile;
        return miles;
    }
}
