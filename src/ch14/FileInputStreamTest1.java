package ch14;

import java.io.FileInputStream;
import java.io.IOException;
// 14. 바이트 단위 입출력 스트림
// 파일에서 한 바이트씩 자료 읽기
public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e){
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
