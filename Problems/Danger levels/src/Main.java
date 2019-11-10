enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    public int getLevel() {
        return level;
    }

    private final int level;

    DangerLevel(int level) {
        this.level = level;
    }
}