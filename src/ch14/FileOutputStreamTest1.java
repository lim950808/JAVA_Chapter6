package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
// 14. 바이트 단위 입출력 스트림
// 파일에 한 바이트씩 쓰기
public class FileOutputStreamTest1 {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(65);  //A
            fos.write(66);  //B
            fos.write(67);  //C
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
