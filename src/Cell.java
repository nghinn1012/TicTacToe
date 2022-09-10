public class Cell {
    private CellStatus state;

    public Cell(CellStatus state) {
        this.state = state;
    }

    public CellStatus getState() {
        return state;
    }

    public void setState(CellStatus state) {
        this.state = state;
    }

}