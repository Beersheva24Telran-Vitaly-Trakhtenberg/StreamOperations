package telran.stream;

import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import telran.stream.StreamTasks.*;

import java.util.Arrays;

public class StreamTasksTest
{
    @Test
    public void shuffleTest()
    {
        int[] start1 = {1, 8, 10, -7, 25, 10, -14};
        int[] start2 = {10, -7};
        int[] start3 = {8};
        int[] start4 = {};


        // #1
        int[] shuffled = StreamTasks.shuffle(start1);
        // TEST #1: arrays are different by order of elements
        assertNotEquals(Arrays.toString(start1), Arrays.toString(shuffled), "The array was not shuffled");
        // TEST #2: arrays are equal by elements and number of elements
        Arrays.sort(start1);
        Arrays.sort(shuffled);
        assertArrayEquals(start1, shuffled);

        // #2
        shuffled = StreamTasks.shuffle(start2);
        // TEST #1: arrays are different by order of elements
        // Can't be performed for 2 elements: sometime yes, sometime no
        //assertNotEquals(Arrays.toString(start2), Arrays.toString(shuffled), "The array was not shuffled");
        // TEST #2: arrays are equal by elements and number of elements
        Arrays.sort(start2);
        Arrays.sort(shuffled);
        assertArrayEquals(start2, shuffled);

        // #3
        shuffled = StreamTasks.shuffle(start3);
        // TEST #1: arrays are different by order of elements
        assertEquals(Arrays.toString(start3), Arrays.toString(shuffled), "The array was shuffled, but nothing to do");
        // TEST #2: arrays are equal by elements and number of elements
        Arrays.sort(start3);
        Arrays.sort(shuffled);
        assertArrayEquals(start3, shuffled);

        // #4
        shuffled = StreamTasks.shuffle(start4);
        // TEST #1: arrays are different by order of elements
        assertEquals(Arrays.toString(start4), Arrays.toString(shuffled), "The array was shuffled, but nothing to do");
        // TEST #2: arrays are equal by elements and number of elements
        Arrays.sort(start4);
        Arrays.sort(shuffled);
        assertArrayEquals(start4, shuffled);
    }
}
