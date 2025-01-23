package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActSencecameback extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.SENSECAMEBACK;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " Постепенно сознание вернулось к нему,";
            case 1 -> " Потихоньку он вспомнил где находится, ";
            default -> " Постепенно он пришел в себя, ";
        };


    }

}
