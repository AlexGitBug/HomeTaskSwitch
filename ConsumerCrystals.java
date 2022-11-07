package Thread.HomeTask.Switch;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;



public class ConsumerCrystals implements Runnable{
    public static final int FINISH_AMOUNT = 15;
    public static final int SUM_RED_AND_WHITE_CRYSTALS = FINISH_AMOUNT * 2;

    private final Queue<Crystal> crystalQueue;
    private final int capacity;
    private int redCounter = 0;
    private int whiteCounter = 0;
    private final AtomicBoolean finish;
    private String name;

    public ConsumerCrystals(Queue<Crystal> crystalQueue, int capacity, int redCounter, int whiteCounter, AtomicBoolean finish, String name) {
        this.crystalQueue = crystalQueue;
        this.capacity = capacity;
        this.redCounter = redCounter;
        this.whiteCounter = whiteCounter;
        this.finish = finish;
        this.name = name;
    }

    @Override
    public void run() {
//        System.out.println("Crystals consumer: start collecting crystals.");
//        while (redCounter < capacity && whiteCounter < capacity && finish.get()) {
//            synchronized (crystalQueue) {
//                if (!(crystalQueue.isEmpty())) {
//                    Crystal crystal = crystalQueue.poll();
////                    switch (crystal.getCrystalColorEnum()) {
////                        case RED -> {
////                            if (redCounter < FINISH_AMOUNT) {
////                                System.out.println(getName() + " magicians already have " + redCounter + " red crystals");
////                                crystalQueue.poll();
////                                redCounter++;
////                                System.out.println(getName() + " magicians: total number of red crystals - " + redCounter);
////                            } else {
////                                System.out.println(getName() + " magicians do not need red crystals");
////                            }
////                        }
// //                       case WHITE -> {
//                            if (whiteCounter < FINISH_AMOUNT) {
//                                System.out.println(getName() + " magicians already have " + whiteCounter + " white crystals");
//                                crystalQueue.poll();
//                                whiteCounter++;
//                                System.out.println(getName() + " magicians: total number of white crystals - " + whiteCounter);
//                            } else {
//                                System.out.println(getName() + " magicians do not need white crystals");
//                            }
//                        }
//                    }
//                }
//                try {
//                    crystalQueue.wait(700);
//                    if ((redCounter + whiteCounter) >= SUM_RED_AND_WHITE_CRYSTALS) {
//                        finish.getAndSet(false);
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.println(getName() + " magicians: full.");
//    }
//
//    @Override
//    public String toString() {
//        return "ConsumerCrystals{" +
//                "crystalQueue=" + crystalQueue +
//                ", capacity=" + capacity +
//                ", redCounter=" + redCounter +
//                ", whiteCounter=" + whiteCounter +
//                ", finish=" + finish +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Queue<Crystal> getCrystalQueue() {
//        return crystalQueue;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public int getRedCounter() {
//        return redCounter;
//    }
//
//    public int getWhiteCounter() {
//        return whiteCounter;
//    }
//
//    public AtomicBoolean getFinish() {
//        return finish;
    }
}