package Thread.HomeTask.Switch;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainRunner {
    public static void main(String[] args) {
        Queue<Crystal> crystalQueue = new LinkedBlockingQueue<>();
        AtomicBoolean isNotFull = new AtomicBoolean(true);

        Thread producerCrystals = new Thread(new CrystalProducer(crystalQueue, 2001, 0, isNotFull));
        Thread consumerFire = new Thread(new ConsumerRed(crystalQueue, 1000, 0, 0, isNotFull, "Fire", CrystalColorEnum.RED));
        Thread consumerAir = new Thread(new ConsumerWhite(crystalQueue, 1000, 0, 0, isNotFull, "Air", CrystalColorEnum.WHITE));

        consumerFire.start();
        consumerAir.start();
        producerCrystals.start();
    }
}