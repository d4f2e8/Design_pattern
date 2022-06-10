public class Main {
    static int[] armor;
    static int[] speed;

    static {
        armor = new int[]{5, 10, 15, 20, 25, 30, 50, 60, 70, 80};
        speed = new int[]{40, 70, 130, 50, 60, 90, 140, 30, 120, 150};
    }

    public static void main(String[] args) {
        WeaponCache.loadCache();
        Enemy enemy = new Enemy();
        AttackStrategy attackStrategy;
        for (int i = 0; i < 10; i++) {
            enemy.setArmor(armor[i]);
            enemy.setSpeed(speed[i]);
            attackStrategy = decideStrategy(enemy);
            int colorIndex = (int) Math.floor(Math.random() * 3);
            Robot robot = null;
            switch(colorIndex){
                case 0:
                   robot  = new Robot(new GreenType());
                   break;
                case 1:
                    robot  = new Robot(new BlueType());
                    break;
                case 2:
                    robot  = new Robot(new RedType());
                    break;
            }
            robot.setAttackStrategy(attackStrategy);
            robot.setWeapon(WeaponCache.getWeapon(robot.getAttackStrategy().getWeaponType()));
            System.out.println("Robot " + (i+1));
            System.out.println("I am a " + robot.getColor() + " robot.");
            System.out.println("I can " + robot.getMoveMethod() + " to the destination.");
            System.out.println("My enemy has armor " + enemy.getArmor() + " points, and moves " + enemy.getSpeed() + " km/h.");
            robot.attack();
            System.out.println();

        }


    }

    public static AttackStrategy decideStrategy(Enemy enemy) {
        int armorFit = 0;
        int speedFit = 0;
        if(enemy.getArmor()<20){
            armorFit = 0;
        }else if(enemy.getArmor()>50){
            armorFit = 2;
        }else{
            armorFit = 1;
        }
        if(enemy.getSpeed()<=60){
            speedFit = 0;
        }else if(enemy.getSpeed()>120){
            speedFit = 2;
        }else{
            speedFit = 1;
        }
        switch(Math.max(armorFit,speedFit)){
            case 0:
                return new AttackWithSpear();
            case 1:
                return new AttackWithRifle();
            case 2:
                return new AttackWithLaser();
        }
        return null;
    }
}
