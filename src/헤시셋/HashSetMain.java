package 헤시셋;
// 중복 허용 하지 않음, 순서 보장 하지 않음, 수학의 집합과 유사한 개념

import java.util.Arrays;
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        //String[] arr = {"H", "E", "l", "l", "o"}; // 순서 고정
        //HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "l", "l", "o"));
        // HashSet<>(실행자), 실행자 안에 Arrays.asList활용하여 객체 넣을 수 있음
       // System.out.println(set);


        HashSet<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("JAVA"); //add 안됨.
        for(String e : set) System.out.print(e + "  ");

    }
}
