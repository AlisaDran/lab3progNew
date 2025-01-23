package Characters;

import stuff.Charact;
import types.Echaracters;

public class Policeman extends Charact {


    public Policeman(String name){
        super(name);
    }

    @Override
    public Echaracters getType() {
        return Echaracters.POLICEMAN;
    }
}
