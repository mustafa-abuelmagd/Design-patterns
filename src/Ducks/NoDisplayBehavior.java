package Ducks;

public class NoDisplayBehavior implements IDisplayBehavior{

    @Override
    public void display(String type) {
        System.out.println("This duck type is" + type + " and " + type + "s don't display, unlike normal ducks ");
    }
}
