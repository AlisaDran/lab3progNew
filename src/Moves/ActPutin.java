package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActPutin extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.PUTIN;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " начал совать ее под нос ";
            case 1 -> " швырнул ее в сторону ";
            default -> " начал ее грызть, смотря на ";
        };

    }



}
