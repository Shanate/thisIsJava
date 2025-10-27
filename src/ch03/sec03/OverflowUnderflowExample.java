package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) { // byte는 8bit = 0000_0000 ~ 1111_1111의 표현 범위가 된다. 즉 127을 넘게 되면 오버플로우가 된다.
            var1++;
            System.out.println("var1: " + var1);

        }
        System.out.println("------------------------");

        byte var2 = -125;
        for(int i=0;i<5; i++){ // 마찬가지로 -128을 넘게 되면 언더플로우가 걸린다.
            var2--;
            System.out.println("var2: " + var2);
        }
    }
}
