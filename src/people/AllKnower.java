package people;

import clothes.Clothes;
import conditions.Cord;

public class AllKnower extends Shorty {
    private Cord cord = new Cord();

    public AllKnower(String name, int weight) {
        super(name, weight);
        setClothes(Clothes.SPACESUIT);

    }
}
