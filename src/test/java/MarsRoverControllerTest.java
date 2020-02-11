import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverControllerTest {
    @Test
    public void should_execute_batch_commands() {
        MarsRover marsRover = new MarsRover(5, 5);
        MarsRoverController controller = new MarsRoverController(marsRover);
        String result = controller.execute("3,3,E,f,l,b,r");
        assertThat(result).isEqualTo("42E");
    }
}
