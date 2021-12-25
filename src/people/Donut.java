package people;

import clothes.Clothes;
import conditions.Cord;
import gear.*;

public class Donut extends Shorty{
    private Cord cord = new Cord();
    public Donut(String name, int weight) {
        super(name, weight);
        setClothes(Clothes.SPACESUIT);

    }
}
