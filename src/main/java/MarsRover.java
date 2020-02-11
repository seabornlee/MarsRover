public class MarsRover {
    private int x;
    private int y;
    private char faceTo;

    public MarsRover(int x, int y) {

    }

    public void land(int x, int y, char faceTo) {
        this.x = x;
        this.y = y;
        this.faceTo = faceTo;
    }

    public String getPosition() {
        return String.valueOf(this.x) + this.y + this.faceTo;
    }

    public void moveForward() {
        switch (faceTo) {
            case 'E':
                this.x++;
                break;
            case 'W':
                this.x--;
                break;
            case 'N':
                this.y++;
                break;
            case 'S':
                this.y--;
                break;
        }
    }

    public void moveBack() {
        switch (faceTo) {
            case 'E':
                this.x--;
                break;
            case 'W':
                this.x++;
                break;
            case 'N':
                this.y--;
                break;
            case 'S':
                this.y++;
                break;
        }
    }

    public void turnLeft() {
        switch (faceTo) {
            case 'E':
                this.faceTo = 'N';
                break;
            case 'W':
                this.faceTo = 'S';
                break;
            case 'N':
                this.faceTo = 'W';
                break;
            case 'S':
                this.faceTo = 'E';
                break;
        }
    }

    public void turnRight() {
        switch (faceTo) {
            case 'E':
                this.faceTo = 'S';
                break;
            case 'W':
                this.faceTo = 'N';
                break;
            case 'N':
                this.faceTo = 'E';
                break;
            case 'S':
                this.faceTo = 'W';
                break;
        }
    }
}
