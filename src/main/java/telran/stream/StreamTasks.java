package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks
{
    public static int[] shuffle(int [] src_arr)
    {
        int[] shuffled_arr = src_arr.clone();
        Random random = new Random();

        IntStream.iterate(shuffled_arr.length - 1, i -> i > 0, i -> i - 1)
                .forEach(i -> {
                    int j = random.nextInt(i + 1);
                    int temp = shuffled_arr[i];
                    shuffled_arr[i] = shuffled_arr[j];
                    shuffled_arr[j] = temp;                });

        return shuffled_arr;
    }
}
