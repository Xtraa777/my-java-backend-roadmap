package discount.domain;

public enum Grade {
    BASIC(1),
    GOLD(2);

    private final int level;

    Grade(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
