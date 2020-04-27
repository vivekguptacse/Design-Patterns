package behavioral.observer.pullStyle;

public class Spreadsheet implements Observer
{
    private Datasource datasource;

    public Spreadsheet(Datasource datasource)
    {
        this.datasource = datasource;
    }

    @Override
    public void update()
    {
        System.out.println("Spreadsheet got Notified : " + datasource.getValue());
    }
}
