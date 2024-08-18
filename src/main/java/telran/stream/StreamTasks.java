package telran.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamTasks
{
    public static int[] shuffle(int [] src_arr)
    {
        return Arrays.stream(src_arr)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.shuffle(list);
                            return list.stream();
                        }
                ))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
