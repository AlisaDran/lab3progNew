package Moves;

import stuff.Action;
import types.Emoves;

public class ActWantstandup extends Action {
    @Override
    public Emoves getAct() {
        return Emoves.WANTSTANDUP;
    }

    @Override
    public String doAct() {
        return " уже хотел подняться на ноги,";


    }

}
