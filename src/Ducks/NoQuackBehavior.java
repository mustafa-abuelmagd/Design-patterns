package Ducks;

public class NoQuackBehavior implements IQuackBehavior{
    @Override
    public void quack(String type){
        System.out.println("This duck type is" + type + " and " + type + "s don't quack, unlike normal ducks ");
    }
}
