package stuff;

import types.Emoves;

public abstract class Action implements IAction {
    public abstract Emoves getAct();
    public abstract String doAct();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Action other = (Action) obj;
        return this.doAct() == other.doAct() && this.getAct() == other.getAct();
    }
    @Override
    public int hashCode() {
        return this.getAct().hashCode() * this.doAct().hashCode();
    }

    @Override
    public String toString() {
        return this.doAct();
    }


}
