package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActPunch extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.PUNCH;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " с такой силой огрел по затылку дубинкой, что ";
            case 1 -> " плюнул с такой силой, что ";
            default -> " так громко взвизгнул ";
        };

    }


}
