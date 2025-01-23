package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActHit extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.HIT;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " стукнулся головой о дверь ";
            case 1 -> " ударился о дверь мизинчиком ";
            default -> " врезался в дверь ";
        };

    }

}
