package Moves;

import stuff.Action;
import types.Emoves;

public class ActRollout extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.ROLLOUT;
    }

    @Override
    public String doAct() {
        return " из нее кубарем выкатился на мостовую ";


    }


}
