package Moves;

import stuff.Action;
import types.Emoves;

public class ActSaw extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.SAW;
    }

    @Override
    public String doAct() {
        return " как вдруг увидел, что ";
    }
}