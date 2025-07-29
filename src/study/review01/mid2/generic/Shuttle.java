package study.review01.mid2.generic;

public class Shuttle<T extends BioUnit> {

    private T bioUnit;

    public void in(T t) {
        this.bioUnit = t;
    }

    public T out() {
        return bioUnit;
    }

    public void showInfo() {
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
