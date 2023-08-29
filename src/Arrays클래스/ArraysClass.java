package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Arrays클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
     //  Arrays.sort(arr); //오름 차순 정렬
      //  Arrays.sort(arr, Collections.reverseOrder());
       //내림 차순 정렬,collection 값을 다룰 때 기본 데이터형이 아닌 wrapper클래스를 사용한다.
      //  for(int e : arr) System.out.print(e+ "  ");
        //정렬 오버라이딩: 재정의
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1; // 오름 차순
//               if (o1 < o2) return 1; // 내림 차순
                return 0; // 같은 경우
            }

        });
    }
}



