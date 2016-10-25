package state;

public class TabContext implements Context {
    private TabState state;

    public TabContext() {
        // デフォルトはAllタブ
        state = AllTabState.getInstance();
    }

    public void changeState(TabState state) {
        this.state = state;
    }

    public void doClick(int conditon) {
        state.doClick(this, conditon);
        show();
    }

    private void show() {
        state.show();
    }
}
