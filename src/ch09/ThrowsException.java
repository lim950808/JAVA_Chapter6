package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { // throws를 사용해서 예외처리를 미룬다.
        FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
        Class c = Class.forName(className);  //ClassNotFoundException 발생
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) { // Exception 클래스는 최상위이기 때문에 제일 아랫쪽에 사용한다.
            e.printStackTrace();
        }
        System.out.println("end");
    }
}