package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("넷","둘","셋","하나");
        Stream<String> stream2 = Stream.of("넷","둘","셋","하나");
        Optional<String> rst1 = stream1.reduce((s1, s2)->s1 + "++" + s2);
        //null값 방지.
        rst1.ifPresent(e->System.out.print(e + " "));

        String rst2 = stream2.reduce("시작", (s1, s2) ->s1 + "++" +s2);
        System.out.println(rst2);
    }
}
