package telran.stream;

import java.util.Random;

public class StreamTasks
{

    public static int[] shuffle(int[] src_arr)
    {
        Random random = new Random();
        int length = src_arr.length;

        return random.ints(0, length)
                .distinct()
                .limit(length)
                .map(i -> src_arr[i])
                .toArray();
    }
}
