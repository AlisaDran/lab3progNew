package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActBounced extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.BOUNCED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " полетел через всю комнату ";
            case 1 -> " сделал тройной кувырок назад ";
            default -> " телепортировался ";
        };

    }

}
