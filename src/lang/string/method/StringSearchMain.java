package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
//      contains(CharSequence s) : 문자열이 특정 문자열을 포함하고 있는지 확인한다.
//      indexOf(String ch) / indexOf(String ch, int fromIndex) : 문자열이 처음 등장하는 위치를 반환한다.
//      lastIndexOf(String ch) : 문자열이 마지막으로 등장하는 위치를 반환한다
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java", 10));
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java"));
    }
}