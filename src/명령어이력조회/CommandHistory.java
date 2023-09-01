package 명령어이력조회;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistory {
    Queue<String> queue =new LinkedList<>();
    final static int Max_SIZE = 10;
// Queue를 쓰면, List보다 기능 제한.
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true) {
            System.out.print("$  ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim();
            // trim: 입력 받은 문자열 앞/뒤의 공백제거. 띄어쓰기하고 입력했을 때 정상 출력 가능하도록
            if (cmd.equalsIgnoreCase("q")) {
                System.exit(0); // 프로그램을 강제 종료
            }else if(cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다");
                System.out.println(" q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를" + Max_SIZE +"개 보여 줍니다.");
            }else if(cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for (String e : history.queue) {
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
        }else  {
                history.save(cmd);
                System.out.println(cmd);
            }
    }
}
void save(String cmd) {
    queue.offer(cmd);
    if (queue.size() > Max_SIZE) queue.remove(); // 큐의 사이즈가 정한 Max_size보다 크면 맨앞의 요소 제거
}
}