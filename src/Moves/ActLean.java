package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActLean extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.LEAN;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " почтительно наклонился к ";
            case 1 -> " резко нагнулся к ";
            default -> " наклонился с презрением ";
        };

    }


}
