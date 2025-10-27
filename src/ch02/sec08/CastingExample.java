package ch02.sec08;

// 강제 타입(형) 변환

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10; // 00000000 00000000 00000000 00001010
        byte var2 = (byte) var1; // byte에 int를 꽂아 넣는다. byte는 8bit이기 때문에 앞에 다 죽이고 00001010만 남는다.
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65; // int > char이다. 따라서 int 타입에서 char로 갈 때는 강제 형 변환을 시켜야한다.
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
