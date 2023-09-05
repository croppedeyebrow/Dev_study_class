package 파이널실습문제;


import java.io.*;
import java.util.*;

public class MainFinal {
    public static void main(String[] args) {
        List<StudentFinal> studentList = new ArrayList<>();


        try {
            InputStream inputStream = new FileInputStream("src/파이널실습문제/student.txt");
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNext()) {           // 읽을 내용이 있으면 참이 됨
                String line = sc.nextLine(); // 문자열을 줄바꿈 기준으로 읽음
                String[] parts = line.split(" ");
                try {
                    String name = parts[0];
                    int korean = Integer.parseInt(parts[1]);
                    int english = Integer.parseInt(parts[2]);
                    int math = Integer.parseInt(parts[3]);
                    StudentFinal student = new StudentFinal(name, korean, english, math);
                    studentList.add(student);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("적절하지 않습니다.");
                }
            }


            sc.close();

        }catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }


        // 총점을 기준으로 내림차순으로 정렬
        Collections.sort(studentList, Comparator.comparingInt(StudentFinal::getTotal).reversed());

        // 결과 출력
        for (StudentFinal student : studentList) {
            System.out.println(student.getName() + ": " + student.getTotal());
        }
    }
}



class StudentFinal {


    String name;
    int korean;
    int english;
    int math;
    int total;

    public StudentFinal (String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.total = korean + english + math;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return korean + english + math;
    }
}








