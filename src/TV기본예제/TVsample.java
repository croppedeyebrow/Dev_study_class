package TV기본예제;

public class TVsample {
    public static void main(String[] args) {
        TV tv = new TV();
       // tv.getinfoTV();

        TV gtv = new TV(false, 20, 20);
       // gtv.getinfoTV();
        gtv.setON(true);
        gtv.setChannel(59);
        gtv.setVolume(20);
        gtv.getinfoTV();
    }
}
