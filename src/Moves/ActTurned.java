package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;


public class ActTurned extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.TURNED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " повернулся к ";
            case 1 -> " прыгнул к ";
            default -> " решил подкатить к ";
        };

    }


}
