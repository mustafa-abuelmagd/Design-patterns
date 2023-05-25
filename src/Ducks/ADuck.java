package Ducks;

public class ADuck {
    String name;
    int age;
    String type;
    IQuackBehavior QuackBehavior;
    IDisplayBehavior DisplayBehavior;
    ISwimBehavior SwimBehavior;

    public ADuck(String name,
                 int age,
                 String type,
                 IQuackBehavior QuackBehavior,
                 IDisplayBehavior DisplayBehavior,
                 ISwimBehavior SwimBehavior) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.QuackBehavior = QuackBehavior;
        this.DisplayBehavior = DisplayBehavior;
        this.SwimBehavior = SwimBehavior;
    }

    public void quack() {
        this.QuackBehavior.quack(this.type);
    }

    public void display() {
        this.DisplayBehavior.display(this.type);
    }

    public void swim() {
        this.SwimBehavior.swim(this.type);
    }


}
