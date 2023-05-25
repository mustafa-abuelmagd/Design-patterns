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

        ADuck[] duckCollection = new ADuck[4];

        ADuck firstCityDuck = new ADuck("CityDuck", 1, "CityDuck", NormalQuackBehavior, NormalDisplayBehavior, NoSwimBehavior);
        duckCollection[0] = firstCityDuck;
        ADuck firstFarmDuck = new ADuck("FarmDuck", 1, "FarmDuck", NormalQuackBehavior, NormalDisplayBehavior, NormalSwimBehavior);
        duckCollection[1] = firstFarmDuck;
        ADuck firstYellowDuck = new ADuck("YellowDuck", 1, "YellowDuck", SqueakQuackBehavior, NoDisplayBehavior, NoSwimBehavior);
        duckCollection[2] = firstYellowDuck;
        ADuck firstWoodenDuck = new ADuck("WoodenDuck", 1, "WoodenDuck", NoQuackBehavior, NoDisplayBehavior, NoSwimBehavior);
        duckCollection[3] = firstWoodenDuck;

        for (ADuck duck : duckCollection) {
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