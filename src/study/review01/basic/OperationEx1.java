package study.review01.basic;

public class OperationEx1 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int[] numbers = {num1, num2, num3};

        int sum = 0;
        int avg = 0;
        for (int number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
