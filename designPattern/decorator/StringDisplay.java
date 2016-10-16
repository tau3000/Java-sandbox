package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringDisplay extends Display {
    private String string;

    @Override
    public int getColums() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return null;
    }

}
