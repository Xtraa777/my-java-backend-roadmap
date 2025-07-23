package study.review01.basic;

public class OperationEx2 {

    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;
        double[] numbers = {val1, val2, val3};

        double sum = 0;
        double avg = 0;
        for (double number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
