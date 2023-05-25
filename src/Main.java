import observers.*;
import observable.*;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        IObservable groupChat1 = new GroupChat();
        IObserver[] people = new IObserver[5];
        for (int i = 0 ; i < people.length ; i ++ ) {
            people[i] = new Person( "person "+String.valueOf(i), groupChat1);
            groupChat1.addObserver(people[i]);
        }

        int countdown = 2000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Call your method here
                groupChat1.updateState();
                groupChat1.notifyObservers();
            }
        }, 0, countdown);





    }
}