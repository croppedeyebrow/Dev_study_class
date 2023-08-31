package 학생성적정렬;

import java.util.Comparator;

public class DescendComparator implements Comparator<StudentScore> {
    @Override
    public int compare(StudentScore o1, StudentScore o2) {

        if (o1.Score < o2.Score) return  1; //내림차순 정렬
        else if (o1.Score == o2.Score) return 0;
        else return -1;
    }

}
