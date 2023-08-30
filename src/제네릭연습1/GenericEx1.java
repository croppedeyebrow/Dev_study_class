package 제네릭연습1;

public class GenericEx1 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("안유진");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(21);
        System.out.println(p2.info);
       Product<String, Integer> pr1 = new Product<>();
       pr1.setName("스마트 TV");
       pr1.setYear(2023);
       System.out.println(pr1.getName() + " " + pr1.getYear());

       Product<Integer, String> pr2 = new Product<>();
       pr2.setName(1234567);
       pr2.setYear("2023");
       System.out.println(pr2.getName() + " " + pr2.getYear());

    }
}
class Product<T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}



//타입변수 <>, 대문자를 사용, 어떤 타입이든 넣어주면 작동.
// 타입 변수는 제네릭 클래스, 제네릭 메서드 등에서 사용되며,
// 해당 변수가 나중에 실제 데이터 유형으로 대체될 것임을 나타냅니다
class Person <T>{
    public T info;
    Person(T info) {
        this.info = info;
    }
}
