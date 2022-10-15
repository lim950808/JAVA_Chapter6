package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// 14. 바이트 단위 입출력 스트림
// 파일의 끝까지 한 바이트씩 자료 읽기
public class FileInputStreamTest2 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while ( (i = fis.read()) != -1){
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
