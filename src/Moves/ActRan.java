package Moves;

import stuff.Action;
import types.Emoves;

public class ActRan extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.RAN;
    }

    @Override
    public String doAct() {
        return " подбежал к нему ";


    }

}
