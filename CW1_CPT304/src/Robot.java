public class Robot {
    private RobotType robotType;
    private AttackStrategy attackStrategy;
    private Weapon weapon;

    public Robot(RobotType robotType) {
        this.robotType = robotType;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public String getColor() {
        return this.robotType.getColor();
    }

    public String getMoveMethod() {
        return this.robotType.getMoveMethod();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("I will attack the enemy with " + weapon.getWeaponType()+".");
    }
}
