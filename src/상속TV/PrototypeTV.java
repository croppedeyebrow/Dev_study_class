package 상속TV;

public class PrototypeTV {
    boolean isPower; // 전원값 저장
    int channel; //채널
    int volume; // 볼륨
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;

    }
    public PrototypeTV(boolean isPower, int channel, int volume){ //boolean은 참이나 거짓을 나타내는 값, 결과로 true 또는 false
        this.isPower = isPower;
        this.channel = channel;
        this.volume =volume;
    }
    public void setChannel(int ch) {
        if (ch > 0 && ch <1000) {
            channel = ch;
        }else  System.out.println("채널 설정 범위가 아닙니다.");
    }

}

// PrototypeTV로 부터 상속을 받아 ProductTV 클래스를 만듬
class ProductTV extends PrototypeTV {
    String name;
    boolean isinternet;
    ProductTV() {
        name = "Smart TV";
    }
    ProductTV(String name) {
        isPower = false;
        channel =10;
        volume = 10;
        isinternet = false;
        this.name = name;
    }
    void setPowr(boolean ispower) {
        this.isPower = ispower;
    }
    void setvolume(int vol) {
        if (vol >= 0 && vol <=100) {
            this.volume = vol;
        }else System.out.println("볼륨 설정 범위를 벗어났습니다");
    }
    //오버라이딩 : 부모에게서 상속 받은 기능을 재정의해서 사용하는 것
    //오버라디이 관계가 생기면, 실행 전까지는 어떤 것을 실행할지 결정x, 실행중에 사용값이 결정 (동적바인딩)

    @Override //어노테이션, 선언한 메서드가 오버라이드 되었다는 것을 나타냄
    // 만약 상위(부모)클래스(또는 인터페이스)에서 해당 메서드를 찾을 수 없다면 컴파일 에러.
    public void setChannel(int ch) {
        if (ch > 1 && ch < 2000) {
            channel = ch;
            System.out.println("채널을:" + channel + "변경 했습니다.");
        }else  System.out.println("채널 설정 범위를 벗어났습니다");
    }
    public  void  setChannel(int ch, boolean isinternet) {
        if (isinternet) {
            System.out.println("인터넷 모드 입니다");
            this.isinternet = true;
        } else {
            this.isinternet = false;
            if (ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을:" + channel + "변경 했습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다");
        }
    }void viewTV() {
        System.out.println("이름:" + name);
        System.out.println("전원:" + isPower);
        System.out.println("채널:" + channel);
        System.out.println("볼륨:" + volume);
        System.out.println("인터넷:" + isinternet);
    }
}


// 메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 개수로 구분하는 것
