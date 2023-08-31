package 단어정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSortEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next();

        }
        //입력 받은 문자열 배열의 중복 제거를 위해 set 컬렉션에 넣음
        HashSet<String> set = new HashSet<>(Arrays.asList(word));

        word = set.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 사전 순 정렬
                } else {
                    return o1.length() - o2.length(); // 만약 앞이 길면 양수
                }

            }
        });
        System.out.println(Arrays.toString(word));

    }
}


