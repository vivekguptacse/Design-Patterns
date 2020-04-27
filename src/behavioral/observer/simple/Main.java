package behavioral.observer.simple;

public class Main
{
    public static void main(String[] args)
    {
        Datasource datasource = new Datasource();
        Observer sheet1= new Spreadsheet();
        Observer sheet2= new Spreadsheet();
        Observer chart= new Chart();

        datasource.addObserver(sheet1);
        datasource.addObserver(sheet2);
        datasource.addObserver(chart);

        datasource.setValue(1);

    }
}
