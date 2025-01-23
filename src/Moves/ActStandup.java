package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActStandup extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.STANDUP;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " вскочил ";
            default -> " поднялся на ноги ";
        };


    }

}
