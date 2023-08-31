package 집합;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
            HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
            HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
            //s1.addAll(s2); // 합집합: 양쪽 모두에 있는 것, 중복 제거
            //s1.retainAll(s2); // 교집합을 수행하는 메소드, 양쪽 모두에 존재하는 항목
            s1.removeAll(s2); // 차집합 : 앞에서 뒤를 빼는 것
            System.out.println(s1);
        }
    }

