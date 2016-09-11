package iterator;

public class UrlCells extends Cells {
    private String template;

    public UrlCells(String template) {
        this.template = template;
    }

    @Override
    public void addCell(Cell cell) {
        cell.setValue(template + cell.getValue());
        cells.add(cell);
    }
}
