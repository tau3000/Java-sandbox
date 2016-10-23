package observer;

public class ToggleObserver implements Observer {

    @Override
    public void update(ComponentGenerator g) {
        final int state = g.getState();
        final String name = g.getName();
        if (state == 0) {
            System.out.println(name + "を選択してください");
        } else {
            System.out.println("全" + name);
        }
    }

}
