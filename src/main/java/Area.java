public class Area {
    private final int width;
    private final int height;

    public Area(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    boolean containsCoordinate(Coordinate coordinate) {
        return coordinate.getX() <= getWidth() - 1
                && coordinate.getY() <= getHeight() - 1;
    }

    public int getHeight() {
        return height;
    }
}
