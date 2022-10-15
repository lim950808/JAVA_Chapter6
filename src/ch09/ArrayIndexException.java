package ch09;
// 09. 예외 처리하기와 미루기
public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for(int i=0; i<=5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Index 5 out of bounds for length 5
            System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
        System.out.println("here!!");
    }
}
