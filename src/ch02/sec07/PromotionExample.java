package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10; // byte 타입은 1byte
        int intValue = byteValue; // int 타입은 4byte 메모리 크기를 가진다.
        System.out.println("intValue: " + intValue);    // 1byte가 8bit이기 때문에 4byte는 8X4 = 32bit로 32자릿수까지 표현이 가능하다

        char charValue = '가';
        intValue = charValue; // '가'의 유니코드로 변환이 된다.
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + intValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleCValue: " + doubleValue);
    }
}
