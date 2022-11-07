package Thread.HomeTask.Switch;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConsumerRed extends ConsumerCrystals implements Runnable {

    private final CrystalColorEnum crystalColorEnum;

    public ConsumerRed(Queue<Crystal> crystalQueue, int capacity, int redCounter, int whiteCounter, AtomicBoolean finish, String name, CrystalColorEnum crystalColorEnum) {
        super(crystalQueue, capacity, redCounter, whiteCounter, finish, name);
        this.crystalColorEnum = crystalColorEnum;
    }

    @Override
    public String toString() {
        return "ConsumerRed{" +
                "crystalColorEnum=" + crystalColorEnum +
                '}';
    }

    public CrystalColorEnum getCrystalColorEnum() {
        return crystalColorEnum;
    }
}