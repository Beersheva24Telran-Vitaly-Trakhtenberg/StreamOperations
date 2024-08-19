package telran.stream;

import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTasks
{

    public static int[] shuffle(int[] src_arr)
    {
        Random random = new Random();
        int length = src_arr.length;
        if (length == 0) {
            return new int[0];
        }

        return random.ints(0, length)
                .distinct()
                .limit(length)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .mapToInt(i -> src_arr[i])
                .toArray();
    }
}
