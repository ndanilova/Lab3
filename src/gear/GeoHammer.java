package gear;

import people.Shorty;

public class GeoHammer extends Gear {
    public GeoHammer() {
        attach();
    }

    @Override
    public void useGear(Shorty shorty, int timeOfUse) {
        Ore result = searchForOre(shorty, timeOfUse);
        System.out.printf("%s had taken geologic hammer and got %s\n", shorty.getName(), result);
    }

    @Override
    void attach() {
        isAttach = true;
    }

    private Ore searchForOre(Shorty shorty, int t) {
        if (Math.random() <= 0.3 * t * 0.1) return Ore.GOLD;
        else if (Math.random() <= 0.4 * t * 0.1) return Ore.LEAD;
        else if (Math.random() <= 0.5 * t * 0.1) return Ore.IRON;
        else return Ore.STONE;
    }

    private enum Ore {
        STONE, IRON, LEAD, GOLD
    }

}
