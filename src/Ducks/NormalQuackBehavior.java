package Ducks;

public class NormalQuackBehavior implements IQuackBehavior {
    @Override
    public void quack(String type) {
        System.out.println("This duck type is" + type + " and " + type + "s quack like normal ducks ");
    }
}
