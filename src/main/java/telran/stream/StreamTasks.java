package telran.stream;

import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTasks
{
    public static int[] shuffle_(int[] src_arr)
    {
        int[] shuffled_arr = src_arr.clone();
        Random random = new Random();

        IntStream.iterate(shuffled_arr.length - 1, i -> i > 0, i -> i - 1)
                .forEach(i -> {
                    int j = random.nextInt(i + 1);
                    int temp = shuffled_arr[i];
                    shuffled_arr[i] = shuffled_arr[j];
                    shuffled_arr[j] = temp;
                });

        return shuffled_arr;
    }

    public static int[] shuffle(int[] src_arr)
    {
        Random random = new Random();
        int length = src_arr.length;
        int[] shuffled_arr = new int[length];
        if (length == 0) {
            return new int[0];
        }
/*
        return random.ints(0, length)
                .distinct()
                .limit(length)
                .toArray();
*/

/*
        IntStream.range(0, length)
                .map(i -> random.ints(0, length)
                        .distinct()
                        .limit(1)
                        .findFirst()
                        .getAsInt())
                .forEach(i -> shuffled_arr[i] = src_arr[i]);
        return shuffled_arr;
*/

/*
        return IntStream.range(0, length)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    Collections.shuffle(lst, random);
                    return lst.stream();
                }))
                .mapToInt(i -> src_arr[i])
                .toArray();
*/

/*
        return IntStream.range(0, length)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    return random.ints(0, length)
                            .distinct()
                            .limit(length);
                }))
                .map(i -> src_arr[i])
                .toArray();
*/

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
