package templatemethod;

public class Main {

    public static void main(String[] args) {
        String regionPattern = "Asia: half of year manifacture, 1000,USD";
        final RegionLogic regionLogic = new RegionLogic();
        final String result = regionLogic.editName(regionPattern);
        System.out.println(result);
    }

}
