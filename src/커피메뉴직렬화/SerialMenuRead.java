package 커피메뉴직렬화;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) {
        Map<String, CoffeeMenuinfo> map = readMenu();
       // if (map != null) {
        System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
        for (String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getCategory());
            System.out.println("설명 : " + map.get(e).getDescription());
            System.out.println("-".repeat(28));
        }
//    }else
//
//    {
//        System.out.println("메뉴 파일을 읽을 수 없습니다.");
//    }
//
}


    public static Map<String, CoffeeMenuinfo> readMenu() {
        try {
            FileInputStream fis = new FileInputStream("src/커피메뉴직렬화/CoffeMenuMake.txt.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
           return( Map<String,CoffeeMenuinfo> )ois.readObject();
           // return map;
        }catch (IOException e){
        }catch (ClassNotFoundException e) {}
        return null;


    }

}
