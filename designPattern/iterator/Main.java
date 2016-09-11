package iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern");

        final List<Cells> cellsList = Arrays.asList(new Cells(), new UrlCells("https://www.yoshixmk.com/page/"));

        for (Cells cells : cellsList) {
            cells.addCell(new Cell("1"));
            cells.addCell(new Cell("2"));
            cells.addCell(new Cell("3"));
            cells.addCell(new Cell("4"));
            if (cells.getClass() == Cells.class) {
                System.out.println("==default cells==");
            } else if (cells.getClass() == UrlCells.class) {
                System.out.println("==url cells==");
            }
            Iterator it = cells.iterator();
            while (it.hasNext()) {
                Cell cell = (Cell) it.next();
                System.out.println(cell.getValue());
            }
        }
    }
}
