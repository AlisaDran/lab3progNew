package Characters;

import stuff.Charact;
import stuff.HP;
import types.Echaracters;

public class Neznaika extends Charact {

    public Neznaika (String name, HP health){
        super(name, health);
    }


    @Override
    public Echaracters getType() {
        return Echaracters.NEZNAIKA;
    }
}
