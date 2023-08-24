package THis에대해서;

public class Car {
    private String model; // 자동차명
    private  int year; // 출고 연도
    private  String color; // 색상
    private  int maxSpeed; //최고속도

    Car() {}
    Car(String model) {
        this(model, 2022, "black", 230);
        //자기 자신의 생성자를 참조.
    }
    Car(String model, int year, String color, int maxSpeed) {
        this.model = model; //자신의 객체를 가리키는 this는 생략될 수 있음
        this.year =year;
        this.color = color;
        maxSpeed = maxSpeed;


    }
}
