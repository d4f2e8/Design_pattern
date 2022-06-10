import java.util.HashMap;
import java.util.Map;

public class WeaponCache {
    private static Map<String, Weapon> weaponMap = new HashMap<>();

    public WeaponCache() {
    }

    public static void loadCache() {
        Weapon spear = new Spear();
        weaponMap.put("spear", spear);

        Weapon rifle = new Rifle();
        weaponMap.put("rifle", rifle);

        Weapon laser = new Laser();
        weaponMap.put("laser", laser);
    }

    public static Weapon getWeapon(String name){
        return (Weapon) weaponMap.get(name.toLowerCase()).clone();
    }
}
