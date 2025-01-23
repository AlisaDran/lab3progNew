package Characters;

import stuff.Charact;
import stuff.HP;
import types.Echaracters;

public class Kozlic extends Charact {


    public Kozlic(String name, HP health) {
        super(name, health);
    }

    @Override
    public Echaracters getType() {
        return Echaracters.KOZLIC;
    }
}
