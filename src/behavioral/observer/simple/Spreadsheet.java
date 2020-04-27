package behavioral.observer.simple;

public class Spreadsheet implements Observer
{
    @Override
    public void update()
    {
        System.out.println("Spreadsheet got Notified");
    }
}
