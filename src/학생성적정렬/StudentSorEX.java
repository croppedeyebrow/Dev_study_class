package 학생성적정렬;

import java.util.TreeSet;

// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름순 정렬
public class StudentSorEX {
    public static void main(String[] args) {

        TreeSet<StudentScore> set = new TreeSet<>(new DescendComparator());
        set.add(new StudentScore("AA", 99));
        set.add(new StudentScore("BB", 95));
        set.add(new StudentScore("CC", 80));
        set.add(new StudentScore("DD", 88));
        set.add(new StudentScore("EE", 91));

        for (StudentScore e : set) {
            System.out.println("학생 이름 : " +e.name + ",    " + "시험 점수"+ e.Score);
        }


    }
}
