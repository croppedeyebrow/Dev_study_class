package 사용자정의예외클래스;
// 기본적으로 자바는 수많은 예외클래스가 있음.
// 하지만 사용라려는 목적에 맞는 예외처리가 없는 경우 직접 만들 수 있다.
public class CustomEcception {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        int num1 = 100;
        int num2 = 99;

        //try 블록: try 블록 내에서 예외가 발생할 수 있는 코드를 포함합니다.
        // ce.printEven(num1)과 ce.printEven(num2) 메서드 호출 중에 예외가 발생할 수 있으므로 이 코드를 try 블록 내에 위치시킵니다.

        //catch 블록: catch 블록은 try 블록에서 발생한 예외를 처리하는 데 사용됩니다.
        // 여기서는 EvenException이 발생할 경우 해당 예외를 처리합니다.

        //EvenException 예외 처리: EvenException은 사용자 정의 예외 클래스로,
        // 코드에서 정의된 예외입니다. try 블록 내에서 ce.printEven 메서드를 호출할 때 이 예외가 발생하면 해당 예외 객체가 catch 블록으로 전달됩니다.
        try {
            System.out.println(ce.printEven(num1));
            System.out.println(ce.printEven(num2));
        } catch (EvenEXception e) {
            e.printStackTrace();
            // 예외가 발생하면 해당 예외의 스택 트레이스(stack trace) 정보를 출력하는 메서드입니다.
            // 이렇게 하면 예외의 발생 원인과 위치를 파악하는 데 도움
        }

    }
}


class EvenEXception extends Exception {
    private Integer number = null;
    public EvenEXception(int number) {
        this.number= number;
    }
    @Override
    public String getMessage() {
        if (number == null) return "숫자가 아닙니다.";
        else return Integer.toString(number) + "는 짝수가 아닙니다.";
    }

}


class CheckEven {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public int printEven(int number) throws EvenEXception {
        this.num = number;
        if (num % 2 != 0) throw new EvenEXception(num);
        else return num;

    }
}

