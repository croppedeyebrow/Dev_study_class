package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// DATE() : 운영체제로부터 날짜와 시간 정보를 가져와 원하는 포맷형태로 출력
// 자바의 JAVA,UTIL 패키지에 포함되어 있어 import를 해야함.
public class DateAndCAL {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 년도를 4자리로 표현
        // yy : 년도를 2자리로 표현
        // MM : 월을 표시 (반드시 대문자만 사용)
        // mm : 분을 표시 한다는 의미
        // HH : 24시간제 표시
        // hh : 12시간제 표시
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));
        Calendar cal = Calendar.getInstance(); //운영체제로부터 시간을 가져 옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // MONTH는 배열의 인덱스와 순서가 같기에, +1를 해줘야 한다.
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날인지
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

//        //Calendar 클래스로 yyyy년MM월dd일 HH시mm분ss초 포맷과 동일하게 출력 하기

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초" + "입니다");
//        System.out.println(dateFormat.format(cal.getTime()));

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int mon = date.get(Calendar.MONTH)+1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int isPM = date.get(Calendar.AM_PM);
        int hour = date.get(Calendar.HOUR);
        int min = date.get(Calendar.MINUTE);
        int sec = date.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, mon, day, hour, min, sec);
        //%02d 앞자리에 0을 채우는 것
    }








    }

