package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

public class GenericBssic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);
        //인덱스 값에 문자열을 캐스팅.
        // 요소를 명시하지 않았기 때문에, 캐스팅 없으면 오류 발생.
        System.out.println(str);

        //<>을 이용해 제네릭 타입으로 변환
        List<String> list2  = new ArrayList<>();
        list2.add("java");
        String str2 =  list2.get(0);
        System.out.println(str2);
    }
}
