package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActRegain extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.REGAIN;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " некоторое время не мог прийти в себя.";
            case 1 -> " еще долго смотрел на звездочки. ";
            default -> " выпал в осадок. ";
        };


    }


}
