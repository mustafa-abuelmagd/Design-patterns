package observers;

import observable.*;

public class Person implements IObserver {
    IObservable observable;
    String name;

    public Person(String name , IObservable observable) {
        this.observable = observable;
        this.name = name;
    }

    @Override
    public boolean update() {
        System.out.println(this.name +"  " +this.observable.getData());
        return true;
    }
}
