package Ducks;

public class NormalSwimBehavior implements ISwimBehavior{
    @Override
    public void swim(String type) {
        System.out.println("This duck type is" + type + " and " + type + "s swim like normal ducks ");

    }
}
