package Ducks;

public class NoSwimBehavior implements ISwimBehavior{
    @Override
    public void swim(String type) {
        System.out.println("This duck type is" + type + " and " + type + "s don't swim, unlike normal ducks ");

    }
}
