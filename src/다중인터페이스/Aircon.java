package 다중인터페이스;

import javax.print.DocFlavor;

public interface Aircon {
    int MAX_TEMP = 30; // public final static
    int MIN_TEMP =0;

    void airconon(); //상속 받은 클래스에서 기능을 완성해야 함
    void airconoff();

    void setairconTEMP(int temp);


}
