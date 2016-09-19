package prototype;

public class Main {

    public static void main(String[] args) {
        final DealDataCreator dealDataCreator = new DealDataCreator();
        DealAcquisitionData acquistionAll = new DealAcquisitionData("買収");
        DealAcquisitionData acquistionPart = new DealAcquisitionData("少数持分取得");
        final AnnounceDateData publishment = new AnnounceDateData("公表");
        final AnnounceDateData observation = new AnnounceDateData("観測");

        dealDataCreator.register("買取", acquistionAll);
        dealDataCreator.register("少数持分取得", acquistionPart);
        dealDataCreator.register("公表", publishment);
        dealDataCreator.register("観測", observation);

        DealData d1 = dealDataCreator.create("買取");
        DealData d2 = dealDataCreator.create("少数持分取得");
        DealData d3 = dealDataCreator.create("公表");
        DealData d4 = dealDataCreator.create("観測");

        final Print print = new Print();
        print.println(d1.getFormattedData(500000));
        print.println(d2.getFormattedData(1000));
        print.println(d3.getFormattedData(20160919));
        print.println(d4.getFormattedData(20161225));

    }

}
