package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActCrashed extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.CRASHED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " грохнулся посреди мостовой ";
            case 1 -> " разложился по середине улицы ";
            default -> " прилег на бочок ";
        };


    }


}
