import people.*;

public class Main {
    public static void main(String[] args) {
        AllKnower allKnower = new AllKnower("Znaika", 47);
        Donut donut = new Donut("Ponchick", 8);
        Chamomile chamomile = new Chamomile("Romashka", 22);
        DontKnower dontKnower = new DontKnower("Neznaika", 40);
        if (donut.everythingReady() && allKnower.everythingReady() && chamomile.everythingReady() && dontKnower.everythingReady()) {
            System.out.println("everyone is ready!");
            HumanLike.standInLine(allKnower, donut, chamomile, dontKnower);
            allKnower.doGear(allKnower.weightLessNess, allKnower, donut, chamomile, dontKnower);
            allKnower.doGear(allKnower.jetSneakers, 100, allKnower, donut, chamomile, dontKnower);
        }
        SleepWalker sleepWalker1 = new SleepWalker("Charlie", 8);
        SleepWalker sleepWalker2 = new SleepWalker("Genry", 90);
        SleepWalker sleepWalker3 = new SleepWalker("Charlotte", 800);
        SleepWalker sleepWalker4 = new SleepWalker("Timmy", 80);
        SleepWalker.shout(sleepWalker1.getName(), sleepWalker2.getName(), sleepWalker3.getName(), sleepWalker4.getName());
        SleepWalker.clap(sleepWalker1.getName(), sleepWalker2.getName(), sleepWalker3.getName(), sleepWalker4.getName());
        SleepWalker.throwHat(sleepWalker1.getName(), sleepWalker2.getName(), sleepWalker3.getName(), sleepWalker4.getName());
        SleepWalker.cry(sleepWalker1.getName(), sleepWalker3.getName(), sleepWalker4.getName());
        SleepWalker.jump(sleepWalker4.getName());
    }
}
