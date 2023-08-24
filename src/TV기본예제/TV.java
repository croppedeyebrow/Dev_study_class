package TV기본예제;

import javax.swing.*;

public class TV {
    private boolean isON; // TV전원
    private  int channel; // tv채널
    private int volume; // 볼륨

    TV(){
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원: " + isON+ ", 채널 : " +channel + ",볼륨: "+volume );
    }
    TV(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("전원: " + isON+", 채널 : "+channel + ",볼륨: "+volume );
    }
    public void setON(boolean isON) {
        this.isON = isON;
        String onoffstr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원이" + onoffstr + "되었 습니다");
    }
    public void setChannel(int channel){
        if (channel >= 1 && channel <=999) {
            channel  = channel;
            System.out.println("채널을"+ channel + "로 변경 하였습니다.");

        }
        else {
            System.out.println("존재하지 않는 채널입니다.");}

    }
    public void setVolume(int volume){
        if (volume >=0 && volume <=100){
            volume = volume;
            System.out.println("볼륨을"+volume+"변경하였습니다.");
        }
    }
    public void getinfoTV(){
        String onoffstr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5)+"TV정보"+"=".repeat(5));
        System.out.println("전원:"+onoffstr);
        System.out.println("볼륨:"+volume);
        System.out.println("채널:"+channel);
    }



}
