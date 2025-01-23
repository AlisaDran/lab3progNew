package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActEndanger extends Action{
    @Override
    public Emoves getAct() {
        return Emoves.ENDANGER;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " показал язык ";
            default -> " погрозил кулаком по направлению к  ";
        };


    }

}
