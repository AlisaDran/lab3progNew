package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActFlyout extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.FLYOUT;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " вылетел прямо на улицу ";
            case 1 -> " выполз наружу ";
            default -> " выкатился из здания ";
        };


    }


}
