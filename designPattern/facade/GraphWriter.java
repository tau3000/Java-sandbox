package facade;

import java.util.List;

public class GraphWriter {

    private List<Integer> statsData;

    public void write(List<Integer> statsData) {
        this.statsData = statsData;
    }

    public void view() {
        System.out.println(statsData);
    }

}
