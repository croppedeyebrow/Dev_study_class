package 직렬화연습;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerializeEX {
    public static void main(String[] args) {
        writeList();
        List<Board> list =readlist();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Board board : list) {
            System.out.printf("%d  %s %s %s %s\n", board.getBno(), board.getTitle(),board.getContent(), board.getWriter(), sdf.format(board.getDate()));

        }
    }



    public static void writeList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "C++", "고성능언어", "우영우", new Date()));
        list.add(new Board(2, "JAVA", "객체지향언어", "동그라미", new Date()));
        list.add(new Board(3, "Python", "간결한언어", "이준호", new Date()));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
             fos = new FileOutputStream("board.db");
             oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (IOException e) {}
    }
    public static List<Board> readlist() {
        try {
            FileInputStream fis = new FileInputStream("board.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Board> list = (List<Board>) ois.readObject();
            return list;
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
        return null;

    }
}
