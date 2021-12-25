package people;

import clothes.Clothes;
import conditions.Cord;
import gear.*;

public class AllKnower extends Shorty{
    private Cord cord = new Cord();
    public AllKnower(String name, int weight){
        super(name, weight);
        setClothes(Clothes.SPACESUIT);
        //setGears(new GeoHammer(), new WeightLessNess(), new AlpenShtock(), new IceChop(), new JetSneakers());
    }
}
