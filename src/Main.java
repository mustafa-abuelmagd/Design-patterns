import Ducks.*;

public class Main {
    public static void main(String[] args) {
        IQuackBehavior NormalQuackBehavior = new NormalQuackBehavior();
        IQuackBehavior NoQuackBehavior = new NoQuackBehavior();
        IQuackBehavior SqueakQuackBehavior = new SqueakQuackBehavior();

        IDisplayBehavior NormalDisplayBehavior = new NormalDisplayBehavior();
        IDisplayBehavior NoDisplayBehavior = new NoDisplayBehavior();

        ISwimBehavior NormalSwimBehavior = new NormalSwimBehavior();
        ISwimBehavior NoSwimBehavior = new NoSwimBehavior();

        Duck[] duckCollection = new Duck[4];

        Duck firstCityDuck = new Duck("CityDuck", 1, "CityDuck", NormalQuackBehavior, NormalDisplayBehavior, NoSwimBehavior);
        duckCollection[0] = firstCityDuck;
        Duck firstFarmDuck = new Duck("FarmDuck", 1, "FarmDuck", NormalQuackBehavior, NormalDisplayBehavior, NormalSwimBehavior);
        duckCollection[1] = firstFarmDuck;
        Duck firstYellowDuck = new Duck("YellowDuck", 1, "YellowDuck", SqueakQuackBehavior, NoDisplayBehavior, NoSwimBehavior);
        duckCollection[2] = firstYellowDuck;
        Duck firstWoodenDuck = new Duck("WoodenDuck", 1, "WoodenDuck", NoQuackBehavior, NoDisplayBehavior, NoSwimBehavior);
        duckCollection[3] = firstWoodenDuck;

        for (Duck duck : duckCollection) {
            if (duck != null) {
                duck.display();
                duck.swim();
                duck.quack();
                System.out.println();
            } else {
                System.out.println("Duck doesn't exist yet");
            }
        }


    }
}