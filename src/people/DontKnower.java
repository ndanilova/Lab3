package people;

import clothes.Clothes;
import conditions.Cord;
import gear.*;

public class DontKnower extends Shorty{
    private Cord cord = new Cord();
    public DontKnower(String name, int weight) {
        super(name, weight);
        setClothes(Clothes.SPACESUIT);
    }
}
