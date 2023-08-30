package 제네릭연습3;

public class Plastic extends Material {
    @Override
    public void doprinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
