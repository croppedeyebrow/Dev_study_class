package 스트림예제2번;
//반복자 스트림
// 람다식으로 요소 처리 코드를 제공.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// 반복자 스트림(forEach) : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당 합니다.
public class StreamEx2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.print(e + " "); //향상된 for문 활용.
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            String name = iterator.next();
////            System.out.print(name + "  ");
//        list.forEach(e->System.out.print(e + "  "));// foreach 활용 최종연산
//        }
//
//    }
        List<Student> list = Arrays.asList(
                new Student("고유림", 89),
                new Student("나희도", 78)
        );
        list.stream().forEach(s -> { // foreach 활용.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        });
        for (Student s : list) { // 향상된 for문 활용.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        }

    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;


    }

    public int getScore() {
        return score;
    }
}


