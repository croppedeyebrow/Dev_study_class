package 아이패드주문하기;

public class IpadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadpro iPadpro = new IPadpro("iPad Pro");
            if (!iPadpro.continueOrder()) break;
            iPadpro.setScreen();
            iPadpro.setColore();
            iPadpro.setMemory();
            iPadpro.setNetwork();
            iPadpro.setName();
            iPadpro.setSerialNum();
            iPadpro.progressPad();
            iPadpro.productPad();

        }
    }
}
