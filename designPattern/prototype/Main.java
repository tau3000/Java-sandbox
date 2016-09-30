package prototype;

public class Main {

    public static void main(String[] args) {
        final DealDataManager dealDataManager = new DealDataManager();
        DealAcquisitionData acquistionAll = new DealAcquisitionData("買収");
        DealAcquisitionData acquistionPart = new DealAcquisitionData("少数持分取得");
        final AnnounceDateData publishment = new AnnounceDateData("公表");
        final AnnounceDateData observation = new AnnounceDateData("観測");

        dealDataManager.register("買取", acquistionAll);
        dealDataManager.register("少数持分取得", acquistionPart);
        dealDataManager.register("公表", publishment);
        dealDataManager.register("観測", observation);

        DealData d1 = dealDataManager.create("買取");
        DealData d2 = dealDataManager.create("少数持分取得");
        DealData d3 = dealDataManager.create("公表");
        DealData d4 = dealDataManager.create("観測");

        final Print print = new Print();
        print.println(d1.getFormattedData(500000));
        print.println(d2.getFormattedData(1000));
        print.println(d3.getFormattedData(20160919));
        print.println(d4.getFormattedData(20161225));

    }

}
