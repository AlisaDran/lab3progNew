package stuff;

public record HP(int hp) {
    public HP addHp(int p) {
        return new HP(hp+p);
    }
    public HP takeHp(int m) {
        return new HP(hp-m);
    }
    public boolean checkHp() {
        return hp>0;
    }
}
