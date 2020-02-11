import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {
    @Test
    public void should_new_mars_rover_with_area() {
        MarsRover marsRover = new MarsRover(5, 5);
        assertThat(marsRover).isNotNull();
    }

    @Test
    public void should_land_mars_rover() {
        MarsRover marsRover = new MarsRover(5, 5);
        marsRover.land(3, 3, 'E');
        assertThat(marsRover.getPosition()).isEqualTo("33E");
    }

    @Test
    public void should_move_forward() {
        MarsRover marsRover = new MarsRover(5, 5);
        marsRover.land(3, 3, 'E');

        marsRover.moveForward();
        assertThat(marsRover.getPosition()).isEqualTo("43E");

        marsRover.land(3, 3, 'W');
        marsRover.moveForward();
        assertThat(marsRover.getPosition()).isEqualTo("23W");

        marsRover.land(3, 3, 'N');
        marsRover.moveForward();
        assertThat(marsRover.getPosition()).isEqualTo("34N");

        marsRover.land(3, 3, 'S');
        marsRover.moveForward();
        assertThat(marsRover.getPosition()).isEqualTo("32S");
    }

    @Test
    public void should_move_back() {
        MarsRover marsRover = new MarsRover(5, 5);
        marsRover.land(3, 3, 'E');

        marsRover.moveBack();
        assertThat(marsRover.getPosition()).isEqualTo("23E");

        marsRover.land(3, 3, 'W');
        marsRover.moveBack();
        assertThat(marsRover.getPosition()).isEqualTo("43W");

        marsRover.land(3, 3, 'N');
        marsRover.moveBack();
        assertThat(marsRover.getPosition()).isEqualTo("32N");

        marsRover.land(3, 3, 'S');
        marsRover.moveBack();
        assertThat(marsRover.getPosition()).isEqualTo("34S");
    }

    @Test
    public void should_turn_left() {
        MarsRover marsRover = new MarsRover(5, 5);
        marsRover.land(3, 3, 'E');

        marsRover.turnLeft();
        assertThat(marsRover.getPosition()).isEqualTo("33N");

        marsRover.turnLeft();
        assertThat(marsRover.getPosition()).isEqualTo("33W");

        marsRover.turnLeft();
        assertThat(marsRover.getPosition()).isEqualTo("33S");

        marsRover.turnLeft();
        assertThat(marsRover.getPosition()).isEqualTo("33E");
    }

    @Test
    public void should_turn_right() {
        MarsRover marsRover = new MarsRover(5, 5);
        marsRover.land(3, 3, 'E');

        marsRover.turnRight();
        assertThat(marsRover.getPosition()).isEqualTo("33S");

        marsRover.turnRight();
        assertThat(marsRover.getPosition()).isEqualTo("33W");

        marsRover.turnRight();
        assertThat(marsRover.getPosition()).isEqualTo("33N");

        marsRover.turnRight();
        assertThat(marsRover.getPosition()).isEqualTo("33E");
    }
}
