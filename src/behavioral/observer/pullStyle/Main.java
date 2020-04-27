package behavioral.observer.pullStyle;

public class Main
{
    public static void main(String[] args)
    {
        Datasource datasource = new Datasource();
        Observer sheet1= new Spreadsheet(datasource);
        Observer sheet2= new Spreadsheet(datasource);
        Observer chart= new Chart(datasource);

        datasource.addObserver(sheet1);
        datasource.addObserver(sheet2);
        datasource.addObserver(chart);

        datasource.setValue(3);

    }
}
