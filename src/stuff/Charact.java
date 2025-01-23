package stuff;

import types.Echaracters;
import types.Emoves;

public abstract class Charact implements ICharact{
    public String name;
    protected Echaracters type;
    protected HP health;

    protected Charact (String name) {
        this.name = name;
    }
    protected Charact (String name, HP health) {
        this.name = name;
        this.health = health;
    }

    protected String getName () {
        return this.name;
    }
    public int getHealth() {
        return this.health.hp();
    }
    public void setHealth(HP save) {
        this.health = save;
    }
    protected abstract Echaracters getType();

    public String writeActSolo(Action act){
        String toDo = act.doAct();
        return this.name + toDo;
    }

    public String writeActDuo(Action act, Charact pers){
        String toDo = act.doAct();
        return this.name + toDo + pers.name;
    }







}
