import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class AreaTest {

    @Test
    public void should_not_contains_coordinate_when_x_exceed_width() {
        Area area = new Area(5, 5);
        assertThat(area.containsCoordinate(new Coordinate(5, 3))).isFalse();
    }

    @Test
    public void should_not_contains_coordinate_when_y_exceed_height() {
        Area area = new Area(5, 5);
        assertThat(area.containsCoordinate(new Coordinate(3, 5))).isFalse();
    }
}