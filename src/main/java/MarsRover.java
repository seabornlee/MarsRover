import static java.lang.String.valueOf;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y) {

    }

    public void land(int x, int y, char faceTo) {
        this.x = x;
        this.y = y;
        direction = Direction.valueOf(valueOf(faceTo).toUpperCase());
    }

    public String getPosition() {
        return valueOf(this.x) + this.y + direction;
    }

    public void moveForward() {
        Offest offset = direction.forwardOffset();
        this.x += offset.x;
        this.y += offset.y;
    }

    public void moveBack() {
        Offest offset = direction.backwardOffset();
        this.x += offset.x;
        this.y += offset.y;
    }

    public void turnLeft() {
        this.direction = direction.left();
    }

    public void turnRight() {
        this.direction = direction.right();
    }
}
