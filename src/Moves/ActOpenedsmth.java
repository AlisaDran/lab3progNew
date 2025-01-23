package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActOpenedsmth extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.OPENEDSMTH;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " раскрыл одну папку ";
            case 1 -> " выбрал одну из валявшехся на полу папок ";
            default -> " взял с полки тетрадку ";
        };

    }


}
