package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

// 상우 클래스형으로 변환 되었떤 하위 클래스를 다시 자료형으로 변환.
public class DownCasting {
    List<Animal> aniLIst = new ArrayList<>();

    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();

    }

    public void addAnimal() {
        aniLIst.add(new Animal());
        aniLIst.add(new Human());
        aniLIst.add(new Tiger());
        aniLIst.add((new Eagle()));
        for (Animal ani: aniLIst) {
            ani.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < aniLIst.size(); i++) {
            Animal ani = aniLIst.get(i); //업캐스팅
            if (ani instanceof Human) {//human형으로 다운캐스팅 가능 한지 확인
                Human h = (Human) ani;
                h.readBook(); //원래 자기 자신의 클래스에 대한 참조 변수 이기 때문에 접근 가능
            } else if (ani instanceof  Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof  Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }else
                System.out.println("지원되지 않는 형입니다.");
        }
        }
    }
