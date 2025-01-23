package Moves;

import stuff.Action;
import types.Emoves;

public class ActOpenedtwo extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.OPENEDTWO;
    }

    @Override
    public String doAct() {
        return " опять распахнулась ";


    }

}
