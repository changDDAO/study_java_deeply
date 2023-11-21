package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> int0To9 = new ArrayList<>(
                Arrays.asList(5,2,0,8,4,3,1,6,7,9)
                );
        String result = int0To9.stream()
                .filter(i -> i % 2 == 1)
                .sorted(Comparator.reverseOrder()) // 내림차순
                //.sorted(Integer::compare) -> 오름차순
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }


}
