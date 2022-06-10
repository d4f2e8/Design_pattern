public class Enemy {
    private int armor;
    private int speed;

    public Enemy() {
    }

    public Enemy(int armor, int speed) {
        this.armor = armor;
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
