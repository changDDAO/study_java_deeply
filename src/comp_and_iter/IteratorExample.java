package comp_and_iter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<Integer> intHSet = new HashSet<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9)
        );
        Iterator<Integer> iter = intHSet.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next()).append(" ");
        }
        System.out.println(sb.toString());
    }

}
