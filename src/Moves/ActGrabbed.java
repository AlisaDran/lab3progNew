package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActGrabbed extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.GRABBED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " схватил  за шиворот ";
            case 1 -> " прижал  к стене ";
            default -> " схватил за плечи ";
        };

    }


}
