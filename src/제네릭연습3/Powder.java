package 제네릭연습3;

public class Powder extends Material {
    @Override
    public void doprinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}
