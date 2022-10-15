package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// 16. 여러가지 보조 스트림 클래스들
// 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림
// FileInputStream으로 읽은 자료를 문자로 변환해주는 예
public class InputStreamReaderTest {

    public static void main(String[] args) {

        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
            int i;
            while( (i = isr.read()) != -1){  //보조 스트림으로 읽습니다.
                System.out.print((char)i);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
