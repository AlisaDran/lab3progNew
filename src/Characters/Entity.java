package Characters;

import stuff.Charact;
import types.Echaracters;

public class Entity extends Charact {
    public Entity(String name) {
        super(name);
    }

    @Override
    public Echaracters getType() {
        return Echaracters.ENTITY;
    }
}
