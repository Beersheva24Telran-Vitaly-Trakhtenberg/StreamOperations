package telran.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTasks
{
    public static int[] shuffle(int [] src_arr)
    {
        int[] shuffled_arr = new int[src_arr.length];
        boolean[] filled = new boolean[src_arr.length];
        Random random = new Random();

        IntStream.of(src_arr).forEach(value -> {
            int index;
            do {
                index = random.nextInt(shuffled_arr.length);
            } while (filled[index]);
            shuffled_arr[index] = value;
            filled[index] = true;
        });

        return shuffled_arr;
    }
}
