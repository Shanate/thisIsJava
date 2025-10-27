package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
//                break;
                // break는 한 번 걸리면 반복문을 종료하는데 반해 continue는 다음 반복으로 넘어간다.
            }
            System.out.print(i + " ");
        }
    }
}
