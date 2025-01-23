package Moves;

import stuff.Action;
import types.Emoves;

public class ActJumped extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.JUMPED;
    }

    @Override
    public String doAct() {
        return " быстро вскочил, ";


    }

}
