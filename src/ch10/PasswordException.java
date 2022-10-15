package ch10;
// 10. 사용자 정의 예외 클래스와 그 활용
public class PasswordException extends Exception {

    public PasswordException(String message) {
        super(message);
    }

}