package 코코아톡;

import 인터페이스기본.NetworkAdapter;


public class CocoaTalk {
    private String to; // 상대방 이름
    private  String msg; // 전달한 메시지
    public CocoaTalk(String name) {
        to = name;
    }
    public void WriteMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);

    }
}
