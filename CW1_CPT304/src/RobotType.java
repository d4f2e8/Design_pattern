public abstract class RobotType implements Cloneable {
    private String color;
    private String moveMethod;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMoveMethod(String moveMethod) {
        this.moveMethod = moveMethod;
    }


    public String getColor() {
        return color;
    }

    public String getMoveMethod() {
        return moveMethod;
    }

    public Object clone() {
        return this.clone();
    }
}
