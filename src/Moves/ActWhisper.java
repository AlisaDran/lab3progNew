package Moves;

import java.util.Random;
import stuff.Action;
import types.Emoves;

public class ActWhisper extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.WHISPER;
    }

    @Override
    public String doAct() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        return switch (n) {
            case 0 -> " начал что-то быстро шептать, искоса поглядывая на ";
            case 1 -> " укусил за ушко ";
            default -> " тихо мяукнул, смотря на ";
        };

    }


}
