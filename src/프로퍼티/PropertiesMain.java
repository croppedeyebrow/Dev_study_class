package 프로퍼티;

import 커피메뉴만들기.CoffeeMenuList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태
public class PropertiesMain {
    public static void main(String[] args) throws IOException {//예외 처리 모두 날리기, 세부사항 조절은 불가
        Properties properties = new Properties();
//        String path = CoffeeMenuList.class.getResource("./database.properties").getPath();
      //  String path = PropertiesMain.class.getResource("../커피메뉴만들기/database.properties").getPath(); // .을 찍으면 클래스-패키지간에 존재하는 내 위치의 상하위를 변경
        String path = PropertiesMain.class.getResource("./database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8"); //한글에 대한 처리를 위해서
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver :" + driver);
        System.out.println("url :" + url);
        System.out.println("username :" + username);
        System.out.println("password :" + password);
    }
}
