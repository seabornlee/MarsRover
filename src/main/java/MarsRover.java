import static java.lang.String.valueOf;

public class MarsRover {
    private final Area area;
    private Direction direction;
    private Coordinate coordinate;

    public MarsRover(Area area) {
        this.area = area;
    }

    public void land(int x, int y, char faceTo) {
        coordinate = new Coordinate(x, y);
        if (!area.containsCoordinate(coordinate)) {
            throw new IllegalStateException(String.format("Coordinate %d,%d is out of area %dx%d", x, y, area.getWidth(), area.getHeight()));
        }

        direction = Direction.valueOf(valueOf(faceTo).toUpperCase());
    }

    public String getPosition() {
        return valueOf(this.coordinate.getX()) + this.coordinate.getY() + direction;
    }

    public void moveForward() {
        Offest offset = direction.forwardOffset();
        coordinate = new Coordinate(coordinate.getX() + offset.x, coordinate.getY() + offset.y);
    }

    public void moveBack() {
        Offest offset = direction.backwardOffset();
        coordinate = new Coordinate(coordinate.getX() + offset.x, coordinate.getY() + offset.y);
    }

    public void turnLeft() {
        this.direction = direction.left();
    }

    public void turnRight() {
        this.direction = direction.right();
    }
}
