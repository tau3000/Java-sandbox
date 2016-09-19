package prototype;

public class DealAcquisitionData extends DealData {
    private String name;

    public DealAcquisitionData(String dealName) {
        this.name = dealName;
    }

    @Override
    public String getFormattedData(int value) {
        return name + " - 取得価格" + String.format("%1$,3d", value) + "百万円";
    }

    public DealData createClone() {
        DealData prototype = null;
        try {
            prototype = (DealData) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public String getId() {
        return name;
    }
}
