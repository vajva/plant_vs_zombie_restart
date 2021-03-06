package game.spirits.plants.shoot.peaShooter;

import game.main.map.MapLawn;
import game.behavior.plant.shoot.PSShootBehavior;

public class SplitPea extends AbstractPeaShooter {
    public SplitPea(MapLawn mapLawn) {
        super(mapLawn);
    }
    @Override
    protected PSShootBehavior pSShootBehavior() {
        return new PSShootBehavior(this) {
            @Override
            protected boolean needProduceBulletInShooting() {
                return false;
            }
        };
    }
}

