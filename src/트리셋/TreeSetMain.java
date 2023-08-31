package 트리셋;

import java.util.TreeSet;

// 검색 기능을 강화시킨 자료구조
// 데이터가 저장될 때 이진 검색 트리 형태로 저장되고, 값을 검색을 할 때 inorder 방식으로 탐색 함
//inorder방식: Left - root - right
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23); //Root
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + "  ");


    }
}
