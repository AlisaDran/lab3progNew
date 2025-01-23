package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActOpened extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.OPENED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> "  распахнулись ";
            case 1 -> "  сорвались с петель ";
            default -> " разбились ";
        };


    }


}