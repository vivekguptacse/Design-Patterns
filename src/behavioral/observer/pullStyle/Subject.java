package behavioral.observer.pullStyle;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObserver()
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }
}
