package Moves;

import stuff.Action;
import types.Emoves;

public class ActTocomfort extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.TOCOMFORT;
    }

    @Override
    public String doAct() {
        return " не знал, чем утешить бедного ";


    }

}
