package gear;

import people.Shorty;

public class WeightLessNess extends Gear {
    public WeightLessNess() {
        attach();
    }

    @Override
    public void useGear(Shorty shorty, int timeOfUse) {
        shorty.setWeight(0);
    }

    public void deactivate(Shorty shorty) {
        shorty.setWeight(shorty.getActuallWeight());
    }

    @Override
    void attach() {
        isAttach = true;
    }
}
