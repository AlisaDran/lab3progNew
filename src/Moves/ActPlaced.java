package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActPlaced extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.PLACED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " поставил напротив широкой двустворчатой двери ";
            case 1 -> " прыгнул сальтуху на ";
            default -> " схватил за плечи ";
        };

    }


}
