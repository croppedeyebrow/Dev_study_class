package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        //MAP 컬렉션 생성.
        Map<String, Integer> map = new HashMap<>();
        //객체 저장. map.put()사용, 키와value형태로 저장
        //키와 value에 둘다 문자열을 사용하는 것은 property.
        map.put("우영우",99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호",80);
        map.put("동그라미", 70);
        // 키값이 같기 때문에 나중에 저장된 값으로 대치.
        //키 값의 중복을 걸러내는 방법: Hashset, set구조는 중복허용 안하는 집합.
        System.out.println("총 Entry 수 :" + map.size());
        //객체 찾기: get(key), 지정된 키에 대한 값을 반환 합니다.
        System.out.println(map.get("동그라미"));
        //향상된 for문으로 map 순회, ketset()으로 key를 포함하는 set 컬렉션 반환
        for (String key : map.keySet()) {
            //keySet() key가 포함된 set 컬렉션 반환
            //map에 있는 key값을 set 구조로 뽑아내기
            System.out.println(key + "/t" + map.get(key));
        }
        //객체 삭제 : 키값으로 해당 Entry를 삭제
        map.remove("최수연");
        for (String key : map.keySet()) {
            // keyset() ketSet() key가 포함된 Set 컬렉션 삭제
            System.out.println(key + "/t" + map.get(key));
        }








        //iterator(반복자)를 사용하는 방법.객체를 하나씩 처리
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext())  {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "/t" + value);
//        }
        //

    }
}
