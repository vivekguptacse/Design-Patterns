package behavioral.observer.pushStyle;

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

    public void notifyObserver(int value)
    {
        for(Observer observer : observers)
        {
            observer.update(value);
        }
    }
}
