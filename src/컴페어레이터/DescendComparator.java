package 컴페어레이터;

import java.util.Comparator;

public class DescendComparator implements Comparator<Wine> {
    @Override//반대로
    public Comparator<Wine> reversed() {
        return Comparator.super.reversed();
    }
    @Override//내림차순
    public int compare(Wine o1, Wine o2) {
        if (o1.price < o2.price) return  1;
        else if (o1.price == o2.price) return 0;
       else return -1;
    }

}
