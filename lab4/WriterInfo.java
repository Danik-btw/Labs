public class WriterInfo {
    public static void main(String[] s) {
        CardStrategy strategy = new CardStrategy(1997, 75, "table", 16, 2, true, 15);
        StepByStepStrategy strategy2 = new StepByStepStrategy(2019, 75, "IOS 14", 16, 3, true, 2.5);
        Shooter shooter = new Shooter(2009, 15, "Linux 4", 5, "Pistol");
        Quest quest = new Quest(2007, 90, "Anroid 14", 13);
        strategy.print();
        strategy2.print();
        shooter.print();
        quest.print();
    }
}
