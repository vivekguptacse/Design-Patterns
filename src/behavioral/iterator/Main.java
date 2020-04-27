package behavioral.iterator;

public class Main
{
    public static void main(String[] args)
    {
        BrowsingHistory history = new BrowsingHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.current());
            iterator.next();
        }

        System.out.println("Second Implementation started.. ");

        BrowsingHistroyWithArray historywithArray = new BrowsingHistroyWithArray();
        historywithArray.push("a");
        historywithArray.push("b");
        historywithArray.push("c");

        Iterator iteratorwithArray = historywithArray.createIterator();

        while(iteratorwithArray.hasNext())
        {
            System.out.println(iteratorwithArray.current());
            iteratorwithArray.next();
        }

    }
}
