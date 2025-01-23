package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

import java.util.Random;

public class ActHelp extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.HELP;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(1);
        return switch (n) {
            case 0 -> " подбросил на ноги ";
            default -> " стал помогать подняться ";
        };


    }

}
