package 커피메뉴읽기;

import 커피메뉴만들기.MenuInfo;
import 커피메뉴직렬화.CoffeeMenuinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/커피메뉴직렬화/CoffeMenuMake.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, CoffeeMenuinfo> map;
        map =  (Map<String,CoffeeMenuinfo>) ois.readObject();
        for (String key : map.keySet()) {
            System.out.println("메뉴 : " +map.get(key).getName());
            System.out.println("가격 : " +map.get(key).getPrice());
            System.out.println("분류 : " +map.get(key).getCategory());
            System.out.println("설명 : " +map.get(key).getDescription());
            System.out.println("---------------------------------------");
        }
    }
}
