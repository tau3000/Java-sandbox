package state;

public class IndustryTabState implements TabState {
    // Singletonパターン
    private static TabState industry = new IndustryTabState();

    private IndustryTabState() {
    }

    public static TabState getInstance() {
        return industry;
    }

    public void doClick(TabContext context, int condition) {
        if (condition == 0) {
            context.changeState(AllTabState.getInstance());
            System.out.println("すべてタブに切り替わりました");
        }
    }

    public void show() {
        System.out.println("業界タブの内容を表示しました");
    }
}
