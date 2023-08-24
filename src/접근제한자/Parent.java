package 접근제한자;

public class Parent {
    public String name;
    String money; // default는 상속관계라 할지라도 ,같은 패키지 내에 있어야 접근 가능, 자바에만 있음
    protected String addr; // protected, 같은 패키지내 이거나, 상속관계일 경우 접근 가능.

    public Parent() {
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }
}
