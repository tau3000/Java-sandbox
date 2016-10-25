package state;

public class AllTabState implements TabState {
    // Singletonパターン
    private static TabState all = new AllTabState();

    private AllTabState() {
    }

    public static TabState getInstance() {
        return all;
    }

    public void doClick(TabContext context, int condition) {
        if (condition == 1) {
            context.changeState(IndustryTabState.getInstance());
            System.out.println("業界タブに切り替わりました");
        }
    }

    public void show() {
        System.out.println("すべてタブの内容を表示しました");
    }
}
