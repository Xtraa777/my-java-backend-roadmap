package study.review01.basic;

public class DistanceEx {

    public static void main(String[] args) {
        int distance = 150;
        String trans;

        if (distance <= 1) {
            trans = "도보";
        } else if (distance <= 10) {
            trans = "자전거";
        } else if (distance <= 100) {
            trans = "자동차";
        } else {
            trans = "비행기";
        }

        System.out.println(trans + "를 이용하세요");
    }
}
