package ch15;

import java.io.FileReader;
import java.io.IOException;
// 15. 문자 단위 입출력 스트림
// 파일에서 문자 읽기
public class FileReaderTest {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("reader.txt")){
            int i;
            while( (i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
