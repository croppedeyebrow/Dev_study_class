package 단어정렬;
// '알파벳 소문자'로 이루어진 N개의 '단어'가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오
// N의 개수의 단어를 먼저 입력.
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거.

import java.util.*;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N의 개수 입력
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] word = new String[n];

        // 단어 입력 받기
        for (int i = 0; i <word.length; i++) {

            word[i] = scanner.next();
        }

        // 중복 제거
        HashSet<String> set = new HashSet<>(Arrays.asList(word));

        word = set.toArray(new String[0]);


        // 정렬 조건에 따라 정렬
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
            // 정렬된 결과 출력






    }
}