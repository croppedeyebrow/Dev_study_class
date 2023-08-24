package 생성자오버로딩;

public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carinfo();

        Car santafe = new Car("싼타페");
        santafe.carinfo();

        Car avante = new Car("아반떼","화이트");
        avante.carinfo();

        Car grandeur = new Car("그랜저", "블랙", 220);
        grandeur.carinfo();

        Car tucson = new Car("투싼", "레드", 210, 170);
        tucson.carinfo();

    }
}
