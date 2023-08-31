package 컴페어레이터;
// 두개의 메소드를 비교하는 방법

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Wine> set = new TreeSet<>(new DescendComparator().reversed());
        set.add(new Wine("레드 와인", 250000));
        set.add(new Wine("화이트 와인", 270000));
        set.add(new Wine("로제 와인", 150000));
        for (Wine e : set) {
            System.out.println("와인 이름 : " + e.name + ",  가격 : " + e.price);
        }

    }

}
