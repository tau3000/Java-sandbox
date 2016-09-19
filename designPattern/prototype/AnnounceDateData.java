package prototype;

public class AnnounceDateData extends DealData {

    private String name;

    public AnnounceDateData(String name) {
        this.name = name;
    }

    @Override
    public String getFormattedData(int value) {
        int yyyy = value / 10000;
        int mm = value / 100 % 100;
        int dd = value % 100;
        return name + " - " + String.format("%04d/%02d/%02d", yyyy, mm, dd);
    }

    @Override
    public DealData createClone() {
        DealData prototype = null;
        try {
            prototype = (DealData) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}
