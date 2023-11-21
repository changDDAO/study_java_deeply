package stream;

import java.util.stream.IntStream;

public class StreamExample2 {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 11)
                .reduce(0,(prev, curr) -> {
                    return prev + curr;
                });
//        System.out.println(sum);
        /*StringStat stringStat = "Hello World! Welcome to the world of Java~"
                .chars()
                .boxed()
                .reduce(new StringStat(),
                        (ss, i)->{
                            ss.length++;
                            if(i>='A' && i<='Z'){ss.upperCases++;}
                            else if(i>='a' && i<='z'){ss.lowerCases++;}
                            else {
                                ss.noLetters++;}
                            return ss;
                        }
        (ss1, ss2) -> ss1
                        );*/


    }
    public static class StringStat{
        int length =0;
        int upperCases = 0;
        int lowerCases =0;
        int nonLetters =0;

    }

}
