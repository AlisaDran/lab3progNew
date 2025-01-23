package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActWaved extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.WAVED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " нетерпеливо махнул рукой на ";
            case 1 -> " посмотрел с презрением на ";
            default -> " закусил губу, смотря на ";
        };

    }


}
