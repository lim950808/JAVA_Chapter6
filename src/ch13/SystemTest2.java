package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            InputStreamReader isr = new InputStreamReader(System.in); // 한글도 읽게 만듬
            while( (i = isr.read()) != '\n' ) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}