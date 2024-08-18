package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks
{
    public static int[] shuffle(int [] src_arr)
    {
        Random random = new Random();
        int[] copy = src_arr.clone();

        return IntStream.range(0, copy.length)
                .map(i -> {
                    int rnd_index = random.nextInt(src_arr.length - i) + i;
                    int temp = copy[rnd_index];
                    copy[rnd_index] = copy[i];
                    copy[i] = temp;
                    return copy[i];
                })
                .toArray();
    }
}
