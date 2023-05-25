package Ducks;

public class SqueakQuackBehavior implements IQuackBehavior{
    @Override
    public void quack(String type) {
        System.out.println("This duck type is" + type + " and " + type + "s Squeak unlike normal ducks ");
    }
}
