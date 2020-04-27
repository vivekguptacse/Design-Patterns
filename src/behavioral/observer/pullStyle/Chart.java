package behavioral.observer.pullStyle;

public class Chart implements Observer
{
    private Datasource datasource;

    public Chart(Datasource datasource)
    {
        this.datasource = datasource;
    }

    @Override
    public void update()
    {
        System.out.println("Chart got updated : " + datasource.getValue());
    }
}
