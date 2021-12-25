package people;

import clothes.Clothes;
import conditions.Cord;

public class Chamomile extends Shorty {
    private Cord cord = new Cord();

    public Chamomile(String name, int weight) {
        super(name, weight);
        setClothes(Clothes.SPACESUIT);
    }
}
