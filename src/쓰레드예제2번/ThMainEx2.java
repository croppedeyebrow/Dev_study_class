package 쓰레드예제2번;

import java.awt.*;

import static java.lang.Thread.sleep;
//3초마다 알람 발생.
public class ThMainEx2 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                sleep(3000);

            } catch (InterruptedException ignored) {
            }

        }
    }
}
