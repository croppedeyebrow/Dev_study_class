package MultipleEx1;

class MultipleEx1 {
        public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            if (i % 7 ==0) {
//                System.out.printf("%5d", i);
//                if (i % 70 == 0) {a
//                    System.out.println();
//                }
//            }


            int cnt = 0;
            for (int i = 7; i <= 1000; i += 7) {
                cnt++;
                System.out.printf("%5d",i);
                if (cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }
            }
        }
    }
