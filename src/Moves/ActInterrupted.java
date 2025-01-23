package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActInterrupted extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.INTERRUPTED;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " однако, даже не дослушал до конца ";
            case 1 -> " однако, не обратил на это внимания ";
            default -> " однако, сразу отвернулся ";
        };

    }
}
