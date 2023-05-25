package Ducks;

public class NormalDisplayBehavior implements IDisplayBehavior{
    @Override
    public void display(String type){
        System.out.println("This duck type is" + type + " and " + type + "s display like normal ducks ");
    }
}
